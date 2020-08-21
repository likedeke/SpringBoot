package lk.pojo;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {

    private Integer id;
    private String lastName;
    private String email;
    //1 male, 0 female
    private Integer gender;
    private int dId;
    private Date birth;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public int getDId() {
        return dId;
    }

    public void setDid(int dId) {
        this.dId = dId;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Employee(Integer id, String lastName, String email, Integer gender, int dId) {
        super();
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.dId = dId;
        this.birth = new Date();
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", lastName='" + lastName + '\'' + ", email='" + email + '\'' + ", gender=" + gender + ", dId=" + dId + ", birth=" + birth + '}';
    }


}
