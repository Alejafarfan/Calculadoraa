/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

/**
 *
 * @author farfa
 */
public class Diseño extends javax.swing.JFrame {

    private double producto1, producto2;
    private String valor;
    Calculadora calcu = new Calculadora(producto1, producto2);

    /**
     * Creates new form Diseño
     */
    public Diseño() {
        initComponents();
        setLocationRelativeTo(null);

        calcu = new Calculadora();
        calcu.setProducto1(producto1);
        calcu.setProducto2(producto2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cmd7 = new javax.swing.JButton();
        cmd8 = new javax.swing.JButton();
        cmd9 = new javax.swing.JButton();
        cmdDividir = new javax.swing.JButton();
        cmd4 = new javax.swing.JButton();
        cmd5 = new javax.swing.JButton();
        cmd6 = new javax.swing.JButton();
        cmdMultiplicar = new javax.swing.JButton();
        cmd3 = new javax.swing.JButton();
        cmdRestar = new javax.swing.JButton();
        cmd1 = new javax.swing.JButton();
        cmd2 = new javax.swing.JButton();
        cmd0 = new javax.swing.JButton();
        cmdSumar = new javax.swing.JButton();
        txtResult = new javax.swing.JTextField();
        cmdIgual = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cmdC = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 3, 18)); // NOI18N
        jLabel1.setText("CASIO FX353");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(217, 212, 193));

        cmd7.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        cmd7.setText("7");
        cmd7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd7ActionPerformed(evt);
            }
        });

        cmd8.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        cmd8.setText("8");
        cmd8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd8ActionPerformed(evt);
            }
        });

        cmd9.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        cmd9.setText("9");
        cmd9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd9ActionPerformed(evt);
            }
        });

        cmdDividir.setBackground(new java.awt.Color(153, 255, 153));
        cmdDividir.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        cmdDividir.setText("÷");
        cmdDividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdDividirActionPerformed(evt);
            }
        });

        cmd4.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        cmd4.setText("4");
        cmd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd4ActionPerformed(evt);
            }
        });

        cmd5.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        cmd5.setText("5");
        cmd5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd5ActionPerformed(evt);
            }
        });

        cmd6.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        cmd6.setText("6");
        cmd6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd6ActionPerformed(evt);
            }
        });

        cmdMultiplicar.setBackground(new java.awt.Color(153, 255, 153));
        cmdMultiplicar.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        cmdMultiplicar.setText("×");
        cmdMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdMultiplicarActionPerformed(evt);
            }
        });

        cmd3.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        cmd3.setText("3");
        cmd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd3ActionPerformed(evt);
            }
        });

        cmdRestar.setBackground(new java.awt.Color(153, 255, 153));
        cmdRestar.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        cmdRestar.setText("-");
        cmdRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdRestarActionPerformed(evt);
            }
        });

        cmd1.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        cmd1.setText("1");
        cmd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd1ActionPerformed(evt);
            }
        });

        cmd2.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        cmd2.setText("2");
        cmd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd2ActionPerformed(evt);
            }
        });

        cmd0.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        cmd0.setText("0");
        cmd0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmd0ActionPerformed(evt);
            }
        });

        cmdSumar.setBackground(new java.awt.Color(153, 255, 153));
        cmdSumar.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        cmdSumar.setText("+");
        cmdSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSumarActionPerformed(evt);
            }
        });

        txtResult.setFont(new java.awt.Font("Segoe UI Variable", 0, 18)); // NOI18N
        txtResult.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        cmdIgual.setBackground(new java.awt.Color(153, 255, 153));
        cmdIgual.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        cmdIgual.setText("=");
        cmdIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdIgualActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Stencil", 2, 18)); // NOI18N
        jLabel2.setText("CASIO FX353");

        cmdC.setBackground(new java.awt.Color(255, 51, 51));
        cmdC.setFont(new java.awt.Font("Segoe UI Variable", 1, 24)); // NOI18N
        cmdC.setText("C");
        cmdC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cmd7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmd8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmd9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmdDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cmd4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmd5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmd6, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmdMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cmd0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(cmd1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cmd2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(cmd3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmdRestar, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                                        .addComponent(cmdSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(txtResult))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(cmdC, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmdIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtResult, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdDividir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMultiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmd3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdRestar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmd0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmdIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdC, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmd0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd0ActionPerformed
        txtResult.setText(txtResult.getText() + "0");
    }//GEN-LAST:event_cmd0ActionPerformed

    private void cmd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd1ActionPerformed
        txtResult.setText(txtResult.getText() + "1");
    }//GEN-LAST:event_cmd1ActionPerformed

    private void cmd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd2ActionPerformed
        txtResult.setText(txtResult.getText() + "2");
    }//GEN-LAST:event_cmd2ActionPerformed

    private void cmd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd3ActionPerformed
        txtResult.setText(txtResult.getText() + "3");
    }//GEN-LAST:event_cmd3ActionPerformed

    private void cmd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd4ActionPerformed
        txtResult.setText(txtResult.getText() + "4");
    }//GEN-LAST:event_cmd4ActionPerformed

    private void cmd5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd5ActionPerformed
        txtResult.setText(txtResult.getText() + "5");
    }//GEN-LAST:event_cmd5ActionPerformed

    private void cmd6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd6ActionPerformed
        txtResult.setText(txtResult.getText() + "6");
    }//GEN-LAST:event_cmd6ActionPerformed

    private void cmd7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd7ActionPerformed
        txtResult.setText(txtResult.getText() + "7");
    }//GEN-LAST:event_cmd7ActionPerformed

    private void cmd8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd8ActionPerformed
        txtResult.setText(txtResult.getText() + "8");
    }//GEN-LAST:event_cmd8ActionPerformed

    private void cmd9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmd9ActionPerformed
        txtResult.setText(txtResult.getText() + "9");
    }//GEN-LAST:event_cmd9ActionPerformed

    private void cmdSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSumarActionPerformed
        producto1 = Double.parseDouble(txtResult.getText());
        txtResult.setText("");
        valor = "+";

    }//GEN-LAST:event_cmdSumarActionPerformed

    private void cmdRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdRestarActionPerformed
        producto1 = Double.parseDouble(txtResult.getText());
        txtResult.setText("");
        valor = "-";

    }//GEN-LAST:event_cmdRestarActionPerformed

    private void cmdMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdMultiplicarActionPerformed
        producto1 = Double.parseDouble(txtResult.getText());
        txtResult.setText("");
        valor = "*";

    }//GEN-LAST:event_cmdMultiplicarActionPerformed

    private void cmdDividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdDividirActionPerformed
        producto1 = Double.parseDouble(txtResult.getText());
        txtResult.setText("");
        valor = "/";

    }//GEN-LAST:event_cmdDividirActionPerformed

    private void cmdIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdIgualActionPerformed
        producto2 = Double.parseDouble(txtResult.getText());
        double resultado = 0;
        switch (valor) {
            case "+":
                resultado = calcu.suma(producto1, producto2, resultado);
                break;
            case "-":
                resultado = calcu.resta(producto1, producto2, resultado);
                break;
            case "*":
                resultado = calcu.multiplicacion(producto1, producto2, resultado);
                break;
            case "/":
                resultado = calcu.division(producto1, producto2, resultado);
                break;
            default:
                break;
        }
        txtResult.setText(Double.toString(resultado));
    }//GEN-LAST:event_cmdIgualActionPerformed

    private void cmdCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCActionPerformed
       txtResult.setText("");
       this.calcu.setProducto1(0);
       this.calcu.setProducto2(0);
    }//GEN-LAST:event_cmdCActionPerformed

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
            java.util.logging.Logger.getLogger(Diseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Diseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Diseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Diseño.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Diseño().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmd0;
    private javax.swing.JButton cmd1;
    private javax.swing.JButton cmd2;
    private javax.swing.JButton cmd3;
    private javax.swing.JButton cmd4;
    private javax.swing.JButton cmd5;
    private javax.swing.JButton cmd6;
    private javax.swing.JButton cmd7;
    private javax.swing.JButton cmd8;
    private javax.swing.JButton cmd9;
    private javax.swing.JButton cmdC;
    private javax.swing.JButton cmdDividir;
    private javax.swing.JButton cmdIgual;
    private javax.swing.JButton cmdMultiplicar;
    private javax.swing.JButton cmdRestar;
    private javax.swing.JButton cmdSumar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtResult;
    // End of variables declaration//GEN-END:variables
}
