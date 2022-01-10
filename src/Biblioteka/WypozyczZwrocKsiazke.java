package Biblioteka;

import java.sql.*;
import javax.swing.JTextField;
public class WypozyczZwrocKsiazke {
	
public static int WypozyczKsiazke(int BookID, int NumerKartyN, String IDate, String RDate)
{
    int status =0;
    try{
        
        Connection con =DB.getConnection();
        PreparedStatement ps= con.prepareStatement("insert into wypozyczoneksiazki values(?,?,?,?)");
        ps.setInt(1,BookID);
        ps.setInt(2, NumerKartyN);
        ps.setString(3,IDate);
        ps.setString(4,RDate);
        status =ps.executeUpdate();
        PreparedStatement ps2 = con.prepareStatement("UPDATE `czytelnicy` SET `LiczbaWypKs` = `LiczbaWypKs`+1 WHERE `czytelnicy`.`NumerKarty` = ?");
        ps2.setInt(1,NumerKartyN);
        status =ps2.executeUpdate();
        con.close();
}catch(Exception e){System.out.println(e);}
    return status;
}

   
    public static int ZwrocKsiazke(int BookID,int NumerKartyN)
{
    int status =0;
    try{
        
        Connection con =DB.getConnection();
        PreparedStatement ps= con.prepareStatement("delete from wypozyczoneksiazki where BookID=? and NumerKarty=?");
        ps.setInt(1,BookID);
        ps.setInt(2, NumerKartyN);
        status =ps.executeUpdate();
        PreparedStatement ps2 = con.prepareStatement("UPDATE `czytelnicy` SET `LiczbaWypKs` = `LiczbaWypKs`-1 WHERE `czytelnicy`.`NumerKarty` = ?");
        ps2.setInt(1,NumerKartyN);
        status =ps2.executeUpdate();
        con.close();
}catch(Exception e){System.out.println(e);}
    return status;
}     
   }
    


