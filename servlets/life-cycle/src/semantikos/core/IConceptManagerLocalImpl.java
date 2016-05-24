package semantikos.core;

import semantikos.model.Description;

import javax.ejb.Stateless;
import java.sql.*;
import java.util.ArrayList;

/**
 * Created by stk-des01 on 24-05-16.
 */



@Stateless
public class IConceptManagerLocalImpl implements IConceptManagerLocal {
    @Override
    public ArrayList<Description> findDescriptionByIDConcept(int id) {

        String driver = "org.postgresql.Driver";
        String ruta = "jdbc:postgresql://192.168.0.221:5432/postgres";
        String user = "postgres";
        String password = "1q2w3e";

        ArrayList <Description> descriptions= new ArrayList<Description>();


        try {
            Class.forName(driver);
            Connection conne = (Connection) DriverManager.getConnection(ruta, user, password);
            CallableStatement call = conne.prepareCall("{call get_desc(?) }");

            call.setInt(1,id);
            call.execute();

            ResultSet rs=call.getResultSet();

            while(rs.next()){

                int idDescription=Integer.parseInt(rs.getString("description_id"));
                String termino= rs.getString("term");
                descriptions.add(new Description(idDescription,termino));

            }



        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.toString());
        }


        return descriptions;
    }
}
