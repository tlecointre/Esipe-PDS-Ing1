/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hubanato.forms;

import edu.hubanato.controlers.CalculateInterestRateControl;

/**
 *
 * @author Nadia Randria
 */
public class CalculateInterestRateForm extends javax.swing.JFrame {

    /**
     * Creates new form CalcInteretForm
     */
    public CalculateInterestRateForm() {
        initComponents();
        cmbLoanType.addItemListener(new CalculateInterestRateControl(cmbLoanType, cmbAge, cmbProSituation, cmbLoanTerm, cmbPersoContribution, cmbDebtRatio, txtaEvaluation, txtRateDirector, txtInterestRate, btnEvaluate, btnSaveInterestRate));
        btnEvaluate.addActionListener(new CalculateInterestRateControl(cmbLoanType, cmbAge, cmbProSituation, cmbLoanTerm, cmbPersoContribution, cmbDebtRatio, txtaEvaluation, txtRateDirector, txtInterestRate, btnEvaluate, btnSaveInterestRate));
        btnSaveInterestRate.addActionListener(new CalculateInterestRateControl(cmbLoanType, cmbAge, cmbProSituation, cmbLoanTerm, cmbPersoContribution, cmbDebtRatio, txtaEvaluation, txtRateDirector, txtInterestRate, btnEvaluate, btnSaveInterestRate));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblLoanType = new javax.swing.JLabel();
        cmbLoanType = new javax.swing.JComboBox();
        lblAge = new javax.swing.JLabel();
        cmbAge = new javax.swing.JComboBox();
        lblProSituation = new javax.swing.JLabel();
        cmbProSituation = new javax.swing.JComboBox();
        lblLoanTerm = new javax.swing.JLabel();
        cmbLoanTerm = new javax.swing.JComboBox();
        lblPersoContribution = new javax.swing.JLabel();
        cmbPersoContribution = new javax.swing.JComboBox();
        lblDebtRatio = new javax.swing.JLabel();
        cmbDebtRatio = new javax.swing.JComboBox();
        lblYear = new javax.swing.JLabel();
        lblPercent1 = new javax.swing.JLabel();
        lblPercent2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblRateDirector = new javax.swing.JLabel();
        txtRateDirector = new javax.swing.JTextField();
        lblInterestRate = new javax.swing.JLabel();
        txtInterestRate = new javax.swing.JTextField();
        lblPercent3 = new javax.swing.JLabel();
        lblPercent4 = new javax.swing.JLabel();
        btnEvaluate = new javax.swing.JButton();
        btnSaveInterestRate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtaEvaluation = new javax.swing.JTextArea();
        lblTitle = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Interest Rate");

        lblLoanType.setText("Type de prêt :");

        cmbLoanType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Prêt à la consommation", "Prêt automobile", "Prêt immobilier" }));

        lblAge.setText("Age :");

        cmbAge.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "18 - 25", "26 - 45", "46 - 50" }));

        lblProSituation.setText("Situation professionnelle :");

        cmbProSituation.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CDD", "CDI" }));

        lblLoanTerm.setText("Durée du prêt :");

        cmbLoanTerm.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));

        lblPersoContribution.setText("Apport personnel :");

        cmbPersoContribution.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "< 15", "15 - 20", "20 - 30", "30 >" }));

        lblDebtRatio.setText("Taux d'endettemment :");

        cmbDebtRatio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "< 25", "25 - 30", "30 - 33", "> 33" }));

        lblYear.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblYear.setText("année(s)");

        lblPercent1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPercent1.setText("%");

        lblPercent2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPercent2.setText("%");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Les taux :", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        lblRateDirector.setText("Taux de la maison mère :");

        txtRateDirector.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtRateDirector.setEnabled(false);

        lblInterestRate.setText("Taux directeur :");

        txtInterestRate.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        lblPercent3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPercent3.setText("%");

        lblPercent4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        lblPercent4.setText("%");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblRateDirector)
                    .addComponent(lblInterestRate))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtRateDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPercent3)
                    .addComponent(lblPercent4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRateDirector)
                    .addComponent(txtRateDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPercent3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPercent4)
                    .addComponent(lblInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        btnEvaluate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnEvaluate.setText("Evaluer");

        btnSaveInterestRate.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        btnSaveInterestRate.setText("Sauvegarder le taux");

        txtaEvaluation.setColumns(20);
        txtaEvaluation.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtaEvaluation.setRows(5);
        jScrollPane1.setViewportView(txtaEvaluation);

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(51, 0, 102));
        lblTitle.setText("Définition des taux d'intérêts");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblDebtRatio)
                                    .addComponent(lblPersoContribution)
                                    .addComponent(lblLoanTerm)
                                    .addComponent(lblProSituation)
                                    .addComponent(lblAge)
                                    .addComponent(lblLoanType))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbAge, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbLoanType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbProSituation, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbLoanTerm, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblYear))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbPersoContribution, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblPercent1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbDebtRatio, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblPercent2))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnEvaluate, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(btnSaveInterestRate)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 591, Short.MAX_VALUE)
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGap(386, 386, 386)
                .addComponent(lblTitle)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLoanType)
                            .addComponent(cmbLoanType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAge)
                            .addComponent(cmbAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProSituation)
                            .addComponent(cmbProSituation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLoanTerm)
                            .addComponent(cmbLoanTerm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblYear))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPersoContribution)
                            .addComponent(cmbPersoContribution, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPercent1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDebtRatio)
                            .addComponent(cmbDebtRatio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPercent2))
                        .addGap(28, 28, 28)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEvaluate)
                            .addComponent(btnSaveInterestRate)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculateInterestRateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculateInterestRateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculateInterestRateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculateInterestRateForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculateInterestRateForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEvaluate;
    private javax.swing.JButton btnSaveInterestRate;
    private javax.swing.JComboBox cmbAge;
    private javax.swing.JComboBox cmbDebtRatio;
    private javax.swing.JComboBox cmbLoanTerm;
    private javax.swing.JComboBox cmbLoanType;
    private javax.swing.JComboBox cmbPersoContribution;
    private javax.swing.JComboBox cmbProSituation;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDebtRatio;
    private javax.swing.JLabel lblInterestRate;
    private javax.swing.JLabel lblLoanTerm;
    private javax.swing.JLabel lblLoanType;
    private javax.swing.JLabel lblPercent1;
    private javax.swing.JLabel lblPercent2;
    private javax.swing.JLabel lblPercent3;
    private javax.swing.JLabel lblPercent4;
    private javax.swing.JLabel lblPersoContribution;
    private javax.swing.JLabel lblProSituation;
    private javax.swing.JLabel lblRateDirector;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtInterestRate;
    private javax.swing.JTextField txtRateDirector;
    private javax.swing.JTextArea txtaEvaluation;
    // End of variables declaration//GEN-END:variables
}
