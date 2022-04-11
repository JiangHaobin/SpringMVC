package com.aiguigu.rest.controller.bean;

import org.springframework.stereotype.Repository;

/**
 * @projectName: SpringMVC
 * @package: com.aiguigu.rest.controller.bean
 * @className: Employee
 * @author: jhb
 * @description: TODO
 * @date: 2022/2/21 21:36
 * @version: 1.0
 */

public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private Integer gender;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }

    public Employee() {
    }

    public Employee(Integer id, String lastName, String email, Integer gender) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
    }

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
}
