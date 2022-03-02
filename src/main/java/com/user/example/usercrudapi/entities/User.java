package com.user.example.usercrudapi.entities;



import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name="User")
public class User implements Serializable {

    private static final long serialVersionUID = 7156526077883281623L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private long phone;

    public User() {
    }

    public User(long id, String name, long phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }


}
