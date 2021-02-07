package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import FrontEnd.DonorUI;
import Models.Patient;


public class PatientService {

    private DatabaseConnection con;
    private Patient patient;

    public PatientService() {
        con = DatabaseConnection.getSingleConnection();
    }

    public boolean AddDonor(Patient patient) {
           
        try {
           String query = "insert into donor" + "(donorid,name,nic,age,sex,blood,weight,height,phone,address)" + " values(" + patient.index+ ",'" + patient.name + "','" + patient.NIC + "',"+ patient.age + ",'" + patient.sex+ "','" + patient.blood+ "'," + patient.weight + "," + patient.height + ",'"+ patient.phone +"','" + patient.address+"')";

           boolean result = con.Execute(query);

            return result;
            
        } catch (Exception sql) {
            System.out.println("Error " + sql.getMessage());
            return false;
        }

    }

  
   
}
