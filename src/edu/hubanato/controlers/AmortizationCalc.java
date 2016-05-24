package edu.hubanato.controlers;

import edu.hubanato.forms.AmortizationScheduleForm;
import edu.hubanato.forms.AppelGraphTabForm;

import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;

public class AmortizationCalc {

    private DefaultTableModel tab;
    private DecimalFormat df = new DecimalFormat("########.00");
    AmortizationScheduleForm t1;

    public AmortizationCalc(double amount, double rate, double insuranceRate, int nbYear) {
        t1 = new AmortizationScheduleForm();
        t1.setVisible(true);
        calAmort(amount, rate, insuranceRate, nbYear);

    }

    public void calAmort(double amount, double interestRate, double insuranceRate, int nbYear) {
        double newAmount;
        double monthlyInterest = (interestRate / 12) / 100;
        int nbMonth = nbYear * 12;
        double monthlyPayment, interestPaid, principalPaid;
        double insurance = amount * (insuranceRate / 100) / 12;
        double amountAlreadyPaid = 0, insuranceAlreadyPaid = 0, interestAlreadyPaid = 0;
        int i;
        tab = (DefaultTableModel) t1.getTable().getModel();
        updateLabelInfo(amount, nbMonth, interestRate, insuranceRate, t1);
        //Formule de calcul des mensualités
        monthlyPayment = amount * monthlyInterest * Math.pow(1 + monthlyInterest, (double) nbMonth) / (Math.pow(1 + monthlyInterest, (double) nbMonth) - 1);

        for (i = 1; i < nbMonth; i++) {
            interestPaid = amount * monthlyInterest;//Intérêt du mois
            principalPaid = monthlyPayment - interestPaid; //Mensualité sans intérêt
            newAmount = amount - principalPaid; //Restant à payer
            amountAlreadyPaid += principalPaid; //Montant remboursé (prêt uniquement)
            interestAlreadyPaid += interestPaid; //Interêt payé
            insuranceAlreadyPaid += insurance; //Assurance payé
            tab.addRow(new String[]{Integer.toString(i), df.format(principalPaid), df.format(interestPaid), df.format(newAmount), df.format(monthlyPayment), df.format(insurance), df.format(monthlyPayment + insurance)});
            if (i % 12 == 0) {
                t1.insertDataToBarChartGlobal(amountAlreadyPaid, "Montant", i);
                t1.insertDataToBarChartGlobal(insuranceAlreadyPaid, "Assurance", i);
                t1.insertDataToBarChartGlobal(interestAlreadyPaid, "Interêt", i);
            }
            amount = newAmount;  //On met le nouveau montant comme montant principal
            if (i % 12 == 0) {
                t1.insertDataToLineChartAmount(newAmount, i);
            }
            System.out.println("amount:" + amount + " new amount:" + newAmount);
        }
        //Dernier mois
        principalPaid = amount;
        interestPaid = amount * monthlyInterest;
        monthlyPayment = principalPaid + interestPaid;
        newAmount = 0.0;
        amountAlreadyPaid += principalPaid;
        interestAlreadyPaid += interestPaid; //Interêt payé
        insuranceAlreadyPaid += insurance; //Assurance payé
        updateLabelResult(interestAlreadyPaid, insuranceAlreadyPaid, amountAlreadyPaid + interestAlreadyPaid);
        t1.insertDataToPieChartGlobal("Montant", amountAlreadyPaid);
        t1.insertDataToPieChartGlobal("Intérêt", interestAlreadyPaid);
        t1.insertDataToPieChartGlobal("Assurance", insuranceAlreadyPaid);
        t1.insertDataToLineChartAmount(newAmount, i);
        t1.insertDataToBarChartGlobal(amountAlreadyPaid, "Montant", i);
        t1.insertDataToBarChartGlobal(insuranceAlreadyPaid, "Assurance", i);
        t1.insertDataToBarChartGlobal(interestAlreadyPaid, "Interêt", i);
        tab.addRow(new String[]{Integer.toString(i), df.format(principalPaid), df.format(interestPaid), df.format(newAmount), df.format(monthlyPayment), df.format(insurance), df.format(monthlyPayment + insurance)});
    }

    public void updateLabelInfo(double amount, int nbMonth, double interestRate, double insuranceRate, AmortizationScheduleForm t1) {
        t1.getLabelAMount().setText(t1.getLabelAMount().getText() + df.format(amount) + " Euros");
        t1.getLabelDuration().setText(t1.getLabelDuration().getText() + nbMonth + " Mois");
        t1.getLabelInsurance().setText(t1.getLabelInsurance().getText() + df.format(insuranceRate) + " %");
        t1.getLabelRate().setText(t1.getLabelRate().getText() + df.format(interestRate) + " %");
    }

    public void updateLabelResult(double totalInterest, double totalInsurance, double totalWithoutInsurance) {
        t1.getLabelTotalInsurance().setText(t1.getLabelTotalInsurance().getText() + df.format(totalInsurance) + " Euros");
        t1.getLabelTotalInterest().setText(t1.getLabelTotalInterest().getText() + df.format(totalInterest) + " Euros");
        t1.getLabelTotalWithoutInterest().setText(t1.getLabelTotalWithoutInterest().getText() + df.format(totalWithoutInsurance) + " Euros");
    }
}
