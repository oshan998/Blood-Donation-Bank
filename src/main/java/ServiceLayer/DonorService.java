package ServiceLayer;

import DatabaseLayer.DatabaseConnection;
import FrontEnd.DonorUI;
import Models.Donor;


public class DonorService {

    private DatabaseConnection con;
    private Donor donor;

    public DonorService() {
        con = DatabaseConnection.getSingleConnection();
    }

    public boolean AddDonor(Donor donor) {
           
        try {
           String query = "insert into donor" + "(donorid,name,nic,age,sex,blood,weight,height,phone,address)" + " values(" + donor.index+ ",'" + donor.name + "','" + donor.NIC + "',"+ donor.age + ",'" + donor.sex+ "','" + donor.blood+ "'," + donor.weight + "," + donor.height + ",'"+ donor.phone +"','" + donor.address+"')";

           boolean result = con.Execute(query);

            return result;
            
        } catch (Exception sql) {
            System.out.println("Error " + sql.getMessage());
            return false;
        }

    }

  
   
}
