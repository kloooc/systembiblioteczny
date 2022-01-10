
package Biblioteka;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class WpozyczoneKsiazki extends javax.swing.JFrame {


    public WpozyczoneKsiazki() throws SQLException {
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        
        initComponents();
        DefaultTableModel model;
        model = (DefaultTableModel) tableBaza.getModel();
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select wypozyczoneksiazki.BookID,wypozyczoneksiazki.NumerKarty,ksiazki.Tytul , wypozyczoneksiazki.DataWypozyczenia, wypozyczoneksiazki.TerminOddania from ksiazki,wypozyczoneksiazki where ksiazki.BookID=wypozyczoneksiazki.BookID",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();
            String Row[]; 
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    Row[i-1]=rs.getString(i);
                    }
                 model.addRow(Row);
            }

           Con.close();
        }catch(Exception e){System.out.println(e);
    }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableBaza = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnWyjscie = new javax.swing.JButton();
        Szukanie = new javax.swing.JTextField();
        btnSzukaj = new javax.swing.JButton();
        NumerKartyRadio = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableBaza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Book ID","Numer Karty", "Tytul ksiazki", "Data wypożyczenia", "Termin oddania"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableBaza.setRowHeight(20);
        jScrollPane1.setViewportView(tableBaza);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 24)); // NOI18N
        jLabel1.setText("Wypozyczone książki");

        btnWyjscie.setText("Wyjście");
        btnWyjscie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWyjscieActionPerformed(evt);
            }
        });

        Szukanie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SzukanieActionPerformed(evt);
            }
        });

        btnSzukaj.setText("Szukaj");
        btnSzukaj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSzukajActionPerformed(evt);
            }
        });

        NumerKartyRadio.setText("Numer karty bibliotecznej");
        NumerKartyRadio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumerKartyRadioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(698, 698, 698)
                        .addComponent(btnWyjscie))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1575, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(575, 575, 575)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(NumerKartyRadio))))
                .addContainerGap(37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Szukanie, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(btnSzukaj)
                .addGap(464, 464, 464))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(NumerKartyRadio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Szukanie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSzukaj))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnWyjscie)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnWyjscieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWyjscieActionPerformed
        // TODO add your handling code hereset
        this.dispose();
        MainWindow.MainWindow.setVisible(true);
    }//GEN-LAST:event_btnWyjscieActionPerformed

    private void SzukanieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SzukanieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SzukanieActionPerformed

    private void btnSzukajActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSzukajActionPerformed
        // TODO add your handling code here:
        
                    DefaultTableModel model;
        model = (DefaultTableModel) tableBaza.getModel();
        while(model.getRowCount()>0)
            model.removeRow(model.getRowCount()-1);
       if(NumerKartyRadio.isSelected())
        {
            String Search = Szukanie.getText();
            int UserIDV;
        UserIDV = Integer.parseInt(Search);
        try(Connection Con = DB.getConnection()) {
            PreparedStatement ps=Con.prepareStatement("select wypozyczoneksiazki.BookID,wypozyczoneksiazki.NumerKarty,ksiazki.Tytul , wypozyczoneksiazki.DataWypozyczenia, wypozyczoneksiazki.TerminOddania from ksiazki,wypozyczoneksiazki where ksiazki.BookID=wypozyczoneksiazki.BookID and wypozyczoneksiazki.NumerKarty=?",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ps.setInt(1,UserIDV);
            ResultSet rs= ps.executeQuery();
            
           ResultSetMetaData rsmd = rs.getMetaData();
  
            int colnum=rsmd.getColumnCount();

            String Row[];
            Row = new String[colnum];
            while(rs.next()){
                for(int i=1;i<=colnum;i++){
                    Row[i-1]=rs.getString(i);
                    }
                 model.addRow(Row);
            }
            int rowcount = model.getRowCount();
             System.out.println(rowcount);
            if(rowcount==0)
            {
                String NoRow[];
                NoRow = new String[7];
                NoRow[1]="Brak";
                NoRow[2]="Rozwiązań";
                NoRow[0]="";
                NoRow[3]="";
                NoRow[4]="";
                NoRow[5]="";
                NoRow[6]="";
                model.addRow(NoRow);
                
                
            }

           Con.close();
        }catch(Exception e){System.out.println(e);
    }
        }
        
        else
        {
            
				JOptionPane.showMessageDialog(WpozyczoneKsiazki.this, "Zaznacz opcje wyszukiwania","Niepowodzenie!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSzukajActionPerformed

    private void NumerKartyRadioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumerKartyRadioActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_NumerKartyRadioActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new WpozyczoneKsiazki().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(WpozyczoneKsiazki.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton NumerKartyRadio;
    private javax.swing.JTextField Szukanie;
    private javax.swing.JButton btnSzukaj;
    private javax.swing.JButton btnWyjscie;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBaza;
    // End of variables declaration//GEN-END:variables


}
