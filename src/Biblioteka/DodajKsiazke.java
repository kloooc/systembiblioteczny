
package Biblioteka;

import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import static Biblioteka.MainWindow.MainWindow;

public class DodajKsiazke extends javax.swing.JFrame {

    public DodajKsiazke() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Tytul = new javax.swing.JTextField();
        Wydawnictwo = new javax.swing.JTextField();
        Autor = new javax.swing.JTextField();
        NumerISBN = new javax.swing.JTextField();
        btnDodajKsiazke = new javax.swing.JButton();
        btnCofnij = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Gatunek = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel1.setText("Tytuł");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel3.setText("Wydawnictwo");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel4.setText("Autor");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel6.setText("Numer ISBN");

        Tytul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TytulActionPerformed(evt);
            }
        });

        Wydawnictwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WydawnictwoActionPerformed(evt);
            }
        });

        Autor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AutorActionPerformed(evt);
            }
        });

        NumerISBN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumerISBNActionPerformed(evt);
            }
        });

        btnDodajKsiazke.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        btnDodajKsiazke.setText("Dodaj książkę");
        btnDodajKsiazke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajKsiazkeActionPerformed(evt);
            }
        });

        btnCofnij.setText("Cofnij");
        btnCofnij.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCofnijActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 0, 20)); // NOI18N
        jLabel2.setText("Gatunek");

        Gatunek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GatunekActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCofnij)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDodajKsiazke, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Autor, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                            .addComponent(Wydawnictwo, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                            .addComponent(Tytul, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                            .addComponent(NumerISBN)
                            .addComponent(Gatunek))))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Tytul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Autor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Wydawnictwo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Gatunek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumerISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40)
                .addComponent(btnDodajKsiazke, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(btnCofnij)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TytulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TytulActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TytulActionPerformed

    private void WydawnictwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WydawnictwoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_WydawnictwoActionPerformed

    private void AutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AutorActionPerformed

    private void NumerISBNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumerISBNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumerISBNActionPerformed

    private void btnCofnijActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCofnijActionPerformed
        // TODO add your handling code here:
        this.dispose();
        MainWindow.setVisible(true);
    }//GEN-LAST:event_btnCofnijActionPerformed

    private void btnDodajKsiazkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajKsiazkeActionPerformed
        // TODO add your handling code here:
        String TytulN = Tytul.getText();
        String AutorN = Autor.getText();
        String WydawnictwoN = Wydawnictwo.getText();
        String NumerISBNN = NumerISBN.getText();
        String GatunekN = Gatunek.getText();
        
     
        if(KsiazkaDodaj.ZapiszKsiazke(TytulN,AutorN,WydawnictwoN,NumerISBNN,GatunekN)!=0)
            {
                JOptionPane.showMessageDialog(DodajKsiazke.this, "Dodano książkę!","Powodzenie", JOptionPane.ERROR_MESSAGE);
                Tytul.setText("");
                Autor.setText("");
                Wydawnictwo.setText("");
                NumerISBN.setText("");
                Gatunek.setText("");
            }
            else
                JOptionPane.showMessageDialog(DodajKsiazke.this, "Błąd podczas dodawania książki!","Niepowodzenie", JOptionPane.ERROR_MESSAGE);
        
    }//GEN-LAST:event_btnDodajKsiazkeActionPerformed

    private void GatunekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GatunekActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GatunekActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DodajKsiazke().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Autor;
    private javax.swing.JTextField Gatunek;
    private javax.swing.JTextField NumerISBN;
    private javax.swing.JTextField Tytul;
    private javax.swing.JTextField Wydawnictwo;
    private javax.swing.JButton btnCofnij;
    private javax.swing.JButton btnDodajKsiazke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
