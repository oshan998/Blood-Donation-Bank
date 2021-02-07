
package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import Models.Doctor;


public class DoctorService {

    private DatabaseConnection con;
    private Doctor doctor;

    public DoctorService() {
        con = DatabaseConnection.getSingleConnection();
    }

    public boolean AddDoctor(Doctor doctor) {
           
        try {
           String query = "insert into doctor" + "(doctorid,name,dob,sex,experience,phone,address,description)" + " values(" + doctor.docid+ ",'" + doctor.name+ "','" + doctor.dob + "','"+ doctor.Sex + "'," + doctor.experience+ ",'" + doctor.phone+ "','" + doctor.address + "','" + doctor.description + "','"+ doctor.phone +"')";

           boolean result = con.Execute(query);

            return result;
            
        } catch (Exception sql) {
            System.out.println("Error " + sql.getMessage());
            return false;
        }

    }

  
   
}


