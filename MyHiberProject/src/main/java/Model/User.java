package Model;

import javax.persistence.*;

@Entity
@Table(schema = "mydbtest", name = "usertable")
public class User {
    private int id;
    private String name;
    private String secondName;

    public User(String name, String secondName) {
        this.name = name;
        this.secondName =secondName ;
    }

    public User() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
@Column
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Column
    public String getSecondname() {
       return secondName;    }

    public void setSecondname(String secondname) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }
}
