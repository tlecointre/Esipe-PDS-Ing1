/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hubanato.entities;

import edu.hubanato.server.InterfacePoolServer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * This class is used for all the queries we need to use to define the interest
 * rate
 *
 * @author Nadia Randria
 */
public class InterestRate {

    private int idTypeLoan;
    private float interestRate;
    private int ageMin, ageMax;
    private int durationMin, durationMax;
    private String titleLoan;

    /**
     * This constructor permit to declare and initialize the data
     *
     * @param ageMin Age minimum
     * @param ageMax Age maximum
     * @param durationMin Minimal duration of the loan
     * @param durationMax Maximal duration of the loan
     * @param titleLoan Name of the loan
     */
    public InterestRate(int ageMin, int ageMax, int durationMin, int durationMax, String titleLoan) {
        this.ageMin = ageMin;
        this.ageMax = ageMax;
        this.durationMin = durationMin;
        this.durationMax = durationMax;
        this.titleLoan = titleLoan;
    }

    /**
     * This constructor permit to declare and initialize the data when the
     * interest rate is already defined
     *
     * @param interestRate Interest rate of the agency
     * @param ageMin Age minimum
     * @param ageMax Age maximum
     * @param durationMin Minimal duration of the loan
     * @param durationMax Maximal duration of the loan
     * @param title Name of the loan
     */
    public InterestRate(float interestRate, int ageMin, int ageMax, int durationMin, int durationMax, String title) {

        this.interestRate = interestRate;
        this.ageMin = ageMin;
        this.ageMax = ageMax;
        this.durationMin = durationMin;
        this.durationMax = durationMax;
        this.titleLoan = title;
    }

    /**
     * This method is used to recover the interest rate if it already exists by
     * using the parameters : ageMin, ageMax, durationMin, durationMax,
     * titleLoan
     *
     * else we define it by 0.0
     *
     * @return interestRate Interest rate of the company
     *
     * @throws SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public float queryInterestRate() throws SQLException, ClassNotFoundException {

        Connection connection = InterfacePoolServer.getConnection();

        String queryIdTypeLoan = "SELECT id_types as idTypeLoan FROM TYPES WHERE title = ?";
        PreparedStatement select = connection.prepareStatement(queryIdTypeLoan);

        select.setString(1, titleLoan);

        ResultSet rs = select.executeQuery();
        System.out.println(queryIdTypeLoan);
        while (rs.next()) {
            idTypeLoan = rs.getInt("idTypeLoan");
        }

        String queryRate = "SELECT intrate as rate FROM INTEREST_RATE WHERE AGE_MIN = ? AND AGE_MAX = ? "
                + "AND DURATION_MIN = ? AND DURATION_MAX = ? AND ID_TYPES = ?";
        PreparedStatement query = connection.prepareStatement(queryRate);

        query.setInt(1, ageMin);
        query.setInt(2, ageMax);
        query.setInt(3, durationMin);
        query.setInt(4, durationMax);
        query.setInt(5, idTypeLoan);

        ResultSet rlt = query.executeQuery();
        System.out.println(queryRate);

        boolean isEmpty = true;

        while (rlt.next()) {
            isEmpty = false;
            interestRate = rlt.getFloat("rate");

        }
        rlt.close();

        if (isEmpty) {
            interestRate = Float.parseFloat("0.0");
        }

        InterfacePoolServer.returnConnection(connection);
        return interestRate;
    }

    /**
     * We use this method to insert the interest rate if it not exists
     *
     * else to update it if it already exists
     *
     * @throws SQLException
     * @throws java.lang.ClassNotFoundException
     */
    public void saveInterestRate() throws SQLException, ClassNotFoundException {

        Connection connection = InterfacePoolServer.getConnection();

        String queryIdTypeLoan = "SELECT id_types as idTypeLoan FROM TYPES WHERE title = ?";
        PreparedStatement select = connection.prepareStatement(queryIdTypeLoan);

        select.setString(1, titleLoan);

        ResultSet rs = select.executeQuery();
        System.out.println(queryIdTypeLoan);
        rs.next();
        idTypeLoan = rs.getInt("idTypeLoan");

        String sqlCheck = "SELECT count(intrate) as count FROM INTEREST_RATE WHERE AGE_MIN = ? AND AGE_MAX = ?"
                + "AND DURATION_MIN = ? AND DURATION_MAX = ?";
        PreparedStatement check = connection.prepareStatement(sqlCheck);

        check.setInt(1, ageMin);
        check.setInt(2, ageMax);
        check.setInt(3, durationMin);
        check.setInt(4, durationMax);

        ResultSet result = check.executeQuery();
        System.out.println(sqlCheck);
        result.next();
        int count = result.getInt("count");

        if (count == 1) {

            String queryUpdateRate = "UPDATE INTEREST_RATE SET INTRATE = ? WHERE AGE_MIN = ? AND AGE_MAX = ?"
                    + "AND DURATION_MIN = ? AND DURATION_MAX = ?";
            PreparedStatement update = connection.prepareStatement(queryUpdateRate);

            update.setFloat(1, interestRate);
            update.setInt(2, ageMin);
            update.setInt(3, ageMax);
            update.setInt(4, durationMin);
            update.setInt(5, durationMax);

            update.executeUpdate();
            System.out.println(queryUpdateRate);
            update.close();

        } else if (count == 0) {

            String queryInsertRate = "INSERT INTO INTEREST_RATE(INTRATE,AGE_MIN,AGE_MAX,DURATION_MIN,DURATION_MAX,ID_TYPES) "
                    + "VALUES (?,?,?,?,?,?)";
            PreparedStatement insert = connection.prepareStatement(queryInsertRate);

            insert.setFloat(1, interestRate);
            insert.setInt(2, ageMin);
            insert.setInt(3, ageMax);
            insert.setInt(4, durationMin);
            insert.setInt(5, durationMax);
            insert.setInt(6, idTypeLoan);

            insert.executeUpdate();
            System.out.println(queryInsertRate);
            insert.close();
        }
        InterfacePoolServer.returnConnection(connection);
    }

    /**
     * This method is used to recover the interest rate It is used by the form
     * SimulateurForm.java
     *
     * @param duration Duration of the loan
     * @param age Age
     * @param loanType Type of the loan
     *
     * @return rate Interest Rate
     *
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static float getRate(int duration, int age, String loanType) throws SQLException, ClassNotFoundException {
        Connection connection = InterfacePoolServer.getConnection();

        String sql = "SELECT intrate FROM INTEREST_RATE r, TYPES t "
                + "WHERE r.id_types = t.id_types "
                + "AND t.title = ? AND ? BETWEEN r.duration_min AND r.duration_max "
                + "AND ? BETWEEN r.age_min AND r.age_max";

        PreparedStatement ordre = connection.prepareStatement(sql);

        ordre.setString(1, loanType);
        ordre.setInt(2, duration);
        ordre.setInt(3, age);

        ResultSet rs = ordre.executeQuery();

        float rate;
        if (rs.next()) {
            rate = rs.getFloat("intrate");
        } else {
            rate = -1;
        }
        System.out.println(rate);

        ordre.close();
        InterfacePoolServer.returnConnection(connection);
        return rate;
    }

}
