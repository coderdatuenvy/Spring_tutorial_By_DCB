package com.mhb.spring_demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

// commentted all the getters and setters because we are going to use the lombok
// @data will comprise of @getters and @setters check source code for verification
@Entity
@Data
@Builder


public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentID;

//    public Long getDepartmentID() {
//        return departmentID;
//    }
//
//    public void setDepartmentID(Long departmentID) {
//        this.departmentID = departmentID;
//    }
//
//    public String getDepartmentName() {
//        return departmentName;
//    }
//
//    public void setDepartmentName(String departmentName) {
//        this.departmentName = departmentName;
//    }
//
//    public String getDepartmentAddress() {
//        return departmentAddress;
//    }
//
//    public void setDepartmentAddress(String departmentAddress) {
//        this.departmentAddress = departmentAddress;
//    }
//
//    public String getDepartmentCode() {
//        return departmentCode;
//    }
//
//    public void setDepartmentCode(String departmentCode) {
//        this.departmentCode = departmentCode;
//    }
@NotBlank(message = "Please fill in some dept name")
    private String departmentName;
//
//    @Override
//    public String toString() {
//        return "Department{" +
//                "departmentID=" + departmentID +
//                ", departmentName='" + departmentName + '\'' +
//                ", departmentAddress='" + departmentAddress + '\'' +
//                ", departmentCode='" + departmentCode + '\'' +
//                '}';
//    }
//
//    public Department(Long departmentID, String departmentName, String departmentAddress, String departmentCode) {
//        this.departmentID = departmentID;
//        this.departmentName = departmentName;
//        this.departmentAddress = departmentAddress;
//        this.departmentCode = departmentCode;
//    }
//
//    public Department (){
//
//    }
    private String departmentAddress;
    private String departmentCode;
}
