/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.daoImpl;

import com.bitscraft.cvmsystem.dao.JobDao;
import com.bitscraft.cvmsystem.model.Job;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lenovo
 */
@Repository("jobDao")
public class JobDaoImpl implements JobDao{

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    public void addJob(Job job) {
        
        sessionFactory.getCurrentSession().saveOrUpdate(job);
        
    }
    
}
