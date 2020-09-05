package com.offcn.pojo;

import javax.persistence.*;

/**
 * @author wuhang
 * @date 2020/9/4 19:03
 */
@Entity
@Table(name= "s")
public class Person {
    @Id
    @GeneratedValue
    private  Long id;
    @Column
    private  String name;
    @Column int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
}
