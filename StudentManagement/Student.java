package StudentManagement;

public class Student {
    private int Phone;
    private String StudentID,Name,Address;

    public Student(String StudentID,String Name,String Address,int Phone){
        this.StudentID=StudentID;
        this.Name=Name;
        this.Address=Address;
        this.Phone=Phone;
    }

    public String getName() {
        return Name;
    }
    public int getPhone() { return Phone; }
    public String getStudentID() {
        return StudentID;
    }
    public String getAddress() {
        return Address;
    }

    public void setName(String name) {
        Name = name;
    }
    public void setAddress(String address) {
        Address = address;
    }
    public void setStudentID(String studentID) {
        StudentID = studentID;
    }
    public void setPhone(int phone) {
        Phone = phone;
    }
}
