package zit;

public class Employee {
    private String FullName;
    private String Position;
    private String Email;
    private String Phone;
    private int Salary;
    private int Age;

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }



    public Employee(String fullName, String Position, String Email, String Phone, int Salary, int Age) {
        this.Age = Age;
        //System.out.println(fullName +" / "+ Position +" / "+ Email +" / "+ Phone +" / "+ Salary +" / "+ Age);
    }
}

