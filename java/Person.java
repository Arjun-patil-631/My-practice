public class Person{
    private String name;
    private String dept;
    private String email;
    private String contactNo;

    public Person(String name, String dept, String email, String contactNo){
        this.name=name;
        this.dept=dept;
        this.email=email;
        this.contactNo=contactNo;
    }

    public String toString(){
        return  name+"|"+dept+"|"+email+"|"+contactNo;
    }
}