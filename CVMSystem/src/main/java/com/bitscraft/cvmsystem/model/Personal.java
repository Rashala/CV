/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name="personal_detail")
public class Personal implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id", nullable = false)
    private Integer employeeId;
       
//    @Enumerated(EnumType.STRING)
    @Column(name = "prefix" , insertable = false)
    public String prefix;
    
//    public enum Prefix {
// 
//        Mr, Miss, Mrs;
//
//        public static String getPrefix(Prefix sf) {
//            switch (sf) {
//                case Mr:
//                    return "Mr";
//                case Miss:
//                    return "Miss";
//                case Mrs:
//                    return "Mrs";
//                default:
//                    return null;
//            }
//        }
//        
//        
//           }  
//    
               
    
    @Column(name = "first_name" , nullable = false)
    //@NotEMpty
    @Size(min = 1, max = 40)
    private String firstName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "last_name"  , nullable = false)
    //@NotEMpty
    @Size(min = 1, max = 40)
    private String lastName;
   
      @Enumerated(EnumType.STRING)
    @Column(name = "gender" , insertable = false)
    public Gender gender;
    
     public enum Gender {

        MALE, FEMALE, OTHERS;

        public static String getGender(Gender gen) {
            switch (gen) {
                case MALE:
                    return "MALE";
                case FEMALE:
                    return "FEMALE";
                case OTHERS:
                    return "OTHERS";
                default:
                    return null;
            }
        }
    }
    
     @Column(name = "dob" ,  insertable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date DOB;

       @Enumerated(EnumType.STRING)
    @Column(name = "marital_status" ,  insertable = false)
    public MaritalStatus maritalStatus;
    
     public enum MaritalStatus {

        SINGLE, MARRIED, DIVORCE;

        public static String getMaritalStatus(MaritalStatus ms) {
            switch (ms) {
                case SINGLE:
                    return "SINGLE";
                case MARRIED:
                    return "MARRIED";
                case DIVORCE:
                    return "DIVORCE";
                default:
                    return null;
            }
        }
    }
     
     @Column(name = "address")
    private String address; 
     
     @Column(name = "contact_number")
    private String contactNumber;
    
    @Column(name = "alt_contact_number")
    private String altContactNumber;
    
     

    @Column(name = "email" )
 // @Email
        private String email;

   @Column(name = "emp_type")
    private String empType;   
      
    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public MaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(MaritalStatus maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAltContactNumber() {
        return altContactNumber;
    }

    public void setAltContactNumber(String altContactNumber) {
        this.altContactNumber = altContactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

}
