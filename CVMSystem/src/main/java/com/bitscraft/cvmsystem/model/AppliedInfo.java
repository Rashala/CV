/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "applied_info")
public class AppliedInfo implements Serializable {

    @Id
    @Column(name = "emp_id", unique = true)
    @GeneratedValue(generator = "gen")
    @GenericGenerator(name = "gen", strategy = "foreign", parameters = @Parameter(name = "property", value = "personalDetail"))
    private Integer employeeId;
    
    @Column(name="applied_date")
    private Date appliedDate;
    
    @Column(name="applied_area")
    private String appliedArea;
    
    @Column(name="applied_position")
    private String appliedPosition;
    
    @Column(name="action")
    private String action;
    
    @Column(name="joined_date")
    private String joinedDate;

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getAppliedDate() {
        return appliedDate;
    }

    public void setAppliedDate(Date appliedDate) {
        this.appliedDate = appliedDate;
    }

    public String getAppliedArea() {
        return appliedArea;
    }

    public void setAppliedArea(String appliedArea) {
        this.appliedArea = appliedArea;
    }

    public String getAppliedPosition() {
        return appliedPosition;
    }

    public void setAppliedPosition(String appliedPosition) {
        this.appliedPosition = appliedPosition;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getJoinedDate() {
        return joinedDate;
    }

    public void setJoinedDate(String joinedDate) {
        this.joinedDate = joinedDate;
    }
    
    
    

}
