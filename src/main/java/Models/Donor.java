package Models;

public class Donor {

    public int index;
    public String name;
    public String NIC;
    public int age;
    public String sex;
    public String blood;
    public float weight;
    public float height;
    public String phone;
    public String address;

    public Donor(int index, String name, String NIC, int age, String sex, String blood, float weight, float height, String phone, String address) {
        this.index = index;
        this.name = name;
        this.NIC = NIC;
        this.age = age;
        this.sex = sex;
        this.blood = blood;
        this.weight = weight;
        this.height = height;
        this.phone = phone;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Donor{" + "index=" + index + ", name=" + name + ", NIC=" + NIC + ", age=" + age + ", sex=" + sex + ", blood=" + blood + ", weight=" + weight + ", height=" + height + ", phone=" + phone + ", Address=" + address + '}';
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNIC() {
        return NIC;
    }

    public void setNIC(String NIC) {
        this.NIC = NIC;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void SearchDonor(){
        
    }

}
