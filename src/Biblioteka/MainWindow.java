
package Biblioteka;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JFrame;

public class MainWindow extends javax.swing.JFrame {
    
    public static JFrame MainWindow;

    public JFrame GetLibrarianLogin() {
       return MainWindow;
    }
    
    public MainWindow() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnWpyKsiazke = new javax.swing.JButton();
        btnOddajKsiazke = new javax.swing.JButton();
        btnWyjscie = new javax.swing.JButton();
        btnDodajCzyt = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnZobaczKsiazki = new javax.swing.JButton();
        btnZobaczCzyt = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        btnWypKsiazki = new javax.swing.JButton();
        btnDodajKsiazke = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnWpyKsiazke.setText("Wypożycz książkę");
        btnWpyKsiazke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWpyKsiazkeActionPerformed(evt);
            }
        });

        btnOddajKsiazke.setText("Oddaj książkę");
        btnOddajKsiazke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOddajKsiazkeActionPerformed(evt);
            }
        });

        btnWyjscie.setText("Wyjście");
        btnWyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWyjscieActionPerformed(evt);
            }
        });

        btnDodajCzyt.setText("Dodaj czytelnika");
        btnDodajCzyt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajCzytActionPerformed(evt);
            }
        });

        btnZobaczKsiazki.setText("Zobacz książki");
        btnZobaczKsiazki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZobaczKsiazkiActionPerformed(evt);
            }
        });

        btnZobaczCzyt.setText("Zobacz czytelników");
        btnZobaczCzyt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZobaczCzytActionPerformed(evt);
            }
        });

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteka/36235-200.png"))); // NOI18N
        jLabelLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnZobaczKsiazki, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnZobaczCzyt, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabelLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnZobaczKsiazki, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZobaczCzyt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnWypKsiazki.setText("Zobacz wypożyczone książki");
        btnWypKsiazki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWypKsiazkiActionPerformed(evt);
            }
        });

        btnDodajKsiazke.setText("Dodaj książkę");
        btnDodajKsiazke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDodajKsiazkeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(114, 114, 114)
                .addComponent(btnWyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnDodajCzyt, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOddajKsiazke, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWpyKsiazke, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnWypKsiazki, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDodajKsiazke, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnWyjscie, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnWypKsiazki, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnWpyKsiazke, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnOddajKsiazke, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDodajCzyt, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDodajKsiazke, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(198, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWpyKsiazkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWpyKsiazkeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        WpozyczKsiazke.main(new String[] {});
    }//GEN-LAST:event_btnWpyKsiazkeActionPerformed

    private void btnOddajKsiazkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOddajKsiazkeActionPerformed
        // TODO add your handling code here:
       this.setVisible(false);
        ZwrocKsiazke.main(new String[]{});
    }//GEN-LAST:event_btnOddajKsiazkeActionPerformed

    private void btnWyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWyjscieActionPerformed
        // TODO add your handling code here:
        this.dispose();
        
    }//GEN-LAST:event_btnWyjscieActionPerformed

    private void btnDodajCzytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajCzytActionPerformed
        // TODO add your handling code hereer
        this.setVisible(false);
        DodajCzytelnika.main(new String[]{});
    }//GEN-LAST:event_btnDodajCzytActionPerformed

    private void btnWypKsiazkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWypKsiazkiActionPerformed
        // TODO add your handling code here:
        WpozyczoneKsiazki.main(new String[]{});
    }//GEN-LAST:event_btnWypKsiazkiActionPerformed

    private void btnZobaczCzytActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZobaczCzytActionPerformed
        // TODO add your handling code here:
        Czytelnicy.main(new String[]{});
    }//GEN-LAST:event_btnZobaczCzytActionPerformed

    private void btnZobaczKsiazkiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZobaczKsiazkiActionPerformed
        // TODO add your handling code here:

        Ksiazki.main(new String[] {});
    }//GEN-LAST:event_btnZobaczKsiazkiActionPerformed

    private void btnDodajKsiazkeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDodajKsiazkeActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        DodajKsiazke.main(new String[]{});
    }//GEN-LAST:event_btnDodajKsiazkeActionPerformed

    public static void main(String args[]) {
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 
                MainWindow = new MainWindow();
                MainWindow.setVisible(true);
                
            }
        });

        
    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDodajCzyt;
    private javax.swing.JButton btnDodajKsiazke;
    private javax.swing.JButton btnOddajKsiazke;
    private javax.swing.JButton btnWpyKsiazke;
    private javax.swing.JButton btnWyjscie;
    private javax.swing.JButton btnWypKsiazki;
    private javax.swing.JButton btnZobaczCzyt;
    private javax.swing.JButton btnZobaczKsiazki;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
