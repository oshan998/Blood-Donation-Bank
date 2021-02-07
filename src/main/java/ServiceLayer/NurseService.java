
package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Nurse;


public class NurseService {

    private DatabaseConnection con;
    private Nurse nurse;

    public NurseService() {
        con = DatabaseConnection.getSingleConnection();
    }

    public boolean AddDoctor(Nurse nurse) {
           
        try {
           String query = "insert into nurse" + "(nurseid,name,dob,sex,experience,phone,address,description)" + " values(" + nurse.nurseid+ ",'" + nurse.name+ "','" + nurse.dob + "','"+ nurse.Sex + "'," + nurse.experience+ ",'" + nurse.phone+ "','" + nurse.address + "','" + nurse.description + "','"+ nurse.phone +"')";

           boolean result = con.Execute(query);

            return result;
            
        } catch (Exception sql) {
            System.out.println("Error " + sql.getMessage());
            return false;
        }

    }

  
   
}


