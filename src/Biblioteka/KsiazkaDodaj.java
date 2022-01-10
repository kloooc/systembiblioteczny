package Biblioteka;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class KsiazkaDodaj {


  
    public static int ZapiszKsiazke(String TytulN, String AutorN, String WydawnictwoN, String NumerISBNN, String GatunekN) {
            int status= 0;
        try(Connection con = DB.getConnection()) {
		PreparedStatement ps=con.prepareStatement("insert into ksiazki(Tytul,Autor,Gatunek,Wydawnictwo,NumerISBN) values(?,?,?,?,?)");
		ps.setString(1,TytulN);
                ps.setString(2, AutorN);
                ps.setString(3, GatunekN);
                ps.setString(4, WydawnictwoN);
                ps.setString(5, NumerISBNN);
		status=ps.executeUpdate();
                con.close();
	}catch(Exception e){System.out.println(e);}
	return status;    
    }


    

            
    
 

}
