/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculadoraBasica;

import javax.swing.JOptionPane;

/**
 *
 * @author Lucas
 */
public class CalculadoraBasicaTela extends javax.swing.JFrame {
    
    CalculadoraBasica calculadora = new CalculadoraBasica();
    /**
     * Creates new form Calculadora_Tela
     */
    public CalculadoraBasicaTela() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CampoNumero2 = new javax.swing.JTextField();
        CampoNumero1 = new javax.swing.JTextField();
        BotaoSomar = new javax.swing.JButton();
        BotaoSubtrair = new javax.swing.JButton();
        BotaoDividir = new javax.swing.JButton();
        BotaoMultiplicar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CampoResultado = new javax.swing.JTextField();
        BotaoLimpar = new javax.swing.JButton();
        BotaoEncerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Campo \"X\"");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Campo \"Y\"");

        BotaoSomar.setText("Somar (X+Y)");
        BotaoSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSomarActionPerformed(evt);
            }
        });

        BotaoSubtrair.setText("Subtrair (X-Y)");
        BotaoSubtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSubtrairActionPerformed(evt);
            }
        });

        BotaoDividir.setText("Dividir (X/Y)");
        BotaoDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDividirActionPerformed(evt);
            }
        });

        BotaoMultiplicar.setText("Multiplicar (X*Y)");
        BotaoMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoMultiplicarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Resultado");

        CampoResultado.setBackground(new java.awt.Color(240, 240, 240));
        CampoResultado.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CampoResultado.setDisabledTextColor(new java.awt.Color(153, 0, 0));
        CampoResultado.setEnabled(false);

        BotaoLimpar.setText("Limpar Campos");
        BotaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLimparActionPerformed(evt);
            }
        });

        BotaoEncerrar.setText("Encerrar Programa");
        BotaoEncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoEncerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(CampoNumero2)
                            .addComponent(CampoNumero1)))
                    .addComponent(BotaoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BotaoSomar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoMultiplicar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoDividir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoSubtrair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotaoEncerrar))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(BotaoSomar)
                    .addComponent(CampoNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(CampoNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotaoSubtrair)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoDividir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CampoResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoMultiplicar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoLimpar)
                    .addComponent(BotaoEncerrar))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSomarActionPerformed
        calculadora.x = Float.parseFloat(CampoNumero1.getText());
        calculadora.y = Float.parseFloat(CampoNumero2.getText());
        CampoResultado.setText(Float.toString(calculadora.somar()));     
    }//GEN-LAST:event_BotaoSomarActionPerformed

    private void BotaoSubtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSubtrairActionPerformed
        calculadora.x = Float.parseFloat(CampoNumero1.getText());
        calculadora.y = Float.parseFloat(CampoNumero2.getText());
        CampoResultado.setText(Float.toString(calculadora.subtrair()));
    }//GEN-LAST:event_BotaoSubtrairActionPerformed

    private void BotaoDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDividirActionPerformed
        try {
            if(Float.parseFloat(CampoNumero2.getText())==0){
                JOptionPane.showMessageDialog(null, "Impossível dividir por zero!","Erro", JOptionPane.ERROR_MESSAGE);
            }else{
                calculadora.x = Float.parseFloat(CampoNumero1.getText());
                calculadora.y = Float.parseFloat(CampoNumero2.getText());
                CampoResultado.setText(Float.toString(calculadora.dividir()));
            }
        }catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "Valores inválidos!" ,"Erro",JOptionPane.ERROR_MESSAGE);
            }
        
        
        
    }//GEN-LAST:event_BotaoDividirActionPerformed

    private void BotaoMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoMultiplicarActionPerformed
        calculadora.x = Float.parseFloat(CampoNumero1.getText());
        calculadora.y = Float.parseFloat(CampoNumero2.getText());
        CampoResultado.setText(Float.toString(calculadora.multiplicar()));
    }//GEN-LAST:event_BotaoMultiplicarActionPerformed

    private void BotaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLimparActionPerformed
        CampoNumero1.setText("");
        CampoNumero2.setText("");
        CampoResultado.setText("");
    }//GEN-LAST:event_BotaoLimparActionPerformed

    private void BotaoEncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoEncerrarActionPerformed
        System.exit(0);
    }//GEN-LAST:event_BotaoEncerrarActionPerformed

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
            java.util.logging.Logger.getLogger(CalculadoraBasicaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBasicaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBasicaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculadoraBasicaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraBasicaTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoDividir;
    private javax.swing.JButton BotaoEncerrar;
    private javax.swing.JButton BotaoLimpar;
    private javax.swing.JButton BotaoMultiplicar;
    private javax.swing.JButton BotaoSomar;
    private javax.swing.JButton BotaoSubtrair;
    private javax.swing.JTextField CampoNumero1;
    private javax.swing.JTextField CampoNumero2;
    private javax.swing.JTextField CampoResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JOptionPane jOptionPane1;
    // End of variables declaration//GEN-END:variables
}
