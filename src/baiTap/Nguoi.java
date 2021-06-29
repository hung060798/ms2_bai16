package baiTap;

public class Nguoi {

    private String name;
    private int age;
    private String gender;
    private String sdt;

    public Nguoi() {
    }

    public Nguoi(String name, int age, String gender, String sdt) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.sdt = sdt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String ghi(){
        return name + ", " + age + ", " + gender + ", " + sdt;
    }
}
