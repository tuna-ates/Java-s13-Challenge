package employeeApp;

import java.util.Arrays;

public class Employee {
    private int id;
    private String fullName;
    private String email;

    private String password;

    private  String[] healthplans;

    public Employee(int id, String fullName, String email, String password, String[] healthplans) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public void addHealthplan(int index, String name){

    if (index<0){
        System.out.println("index değeri 0 dan küçük olamaz");
    }else {
        try {

            boolean isExist=false;

            for (String healthplan:this.healthplans){
                if (healthplan!=null&& healthplan.equals(name)){
                    isExist=true;
                    System.out.println(name+"ilgili sigorta var");
                    break;
                }
            }
            if(!isExist){
                if(this.healthplans[index]==null){
                    this.healthplans[index]=name;
                }else {
                    System.out.println("ilgili index dolu"+index);
                }
            }


        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("invalid index:"+index);
        }catch (Exception exception){
            System.out.println("Error:"+exception.getMessage());
        }

    }


    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }
    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthplans=" + Arrays.toString(healthplans) +
                '}';
    }
}
