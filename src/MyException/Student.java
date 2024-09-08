package MyException;

public class Student {
    private int id;
    private String name;
    private String branch;
    private String email;
    private String password;
    private int age;
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name  =name;
    }
    public void setBranch(String branch){
        this.branch = branch;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public int getAge() {
        return age;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getBranch(){
        return branch;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", branch=" + branch + ", email=" + email + ", password="
                + password + "]";
    }
}
