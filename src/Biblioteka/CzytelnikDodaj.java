
package Biblioteka;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CzytelnikDodaj {
    

    public static int DodajCzyt(String NumerKartyN, String ImieNazwiskoN, String EmailN) {

         int status =0;
         try{
        
            Connection con =DB.getConnection();
            PreparedStatement ps= con.prepareStatement("insert into czytelnicy(NumerKarty,ImieNazwisko,Email) values(?,?,?)");
            ps.setString(2,ImieNazwiskoN);
            ps.setString(1,NumerKartyN);
            ps.setString(3,EmailN);
            status =ps.executeUpdate();
            con.close();
}catch(Exception e){System.out.println(e);}
    return status; 
    
    
    }

    
}
