package spring.demo.entity;

import javax.persistence.*;

/**
 * Created by qaa on 2017/7/11.
 */
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue
    private long id;

    @Column(nullable = false)
    private String name;

    private int age;

    public User(){
    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }

    public User(Long id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "User:{" +
                "id:" + this.id +
                ",name:" + this.name +
                ",age:" + this.age +
                "}";
    }
}
