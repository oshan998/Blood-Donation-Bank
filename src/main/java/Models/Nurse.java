package Models;

public class Nurse {

    public int nurseid;
    public String name;
    public String dob;
    public String Sex;
    public int experience;
    public String phone;
    public String address;
    public String description;

    public Nurse(int docid, String name, String dob, String Sex, int experience, String phone, String qddress, String description) {
        this.nurseid = nurseid;
        this.name = name;
        this.dob = dob;
        this.Sex = Sex;
        this.experience = experience;
        this.phone = phone;
        this.address = address;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Doctor{" + "docid=" + nurseid + ", name=" + name + ", dob=" + dob + ", Sex=" + Sex + ", experience=" + experience + ", phone=" + phone + ", qddress=" + address + ", description=" + description + '}';
    }

}
