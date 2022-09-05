package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
@Id
 private int eno;

 private String name;

 public int getEno() {

 return eno;

 }

 public void setEno(int eno) {

 this.eno = eno;

 }

 public String getName() {

 return name;

 }

 public void setName(String name) {

 this.name = name;

 }

 @Override

 public String toString() {

 return "Employee [eno=" + eno + ", name=" + name + "]";

 }

}