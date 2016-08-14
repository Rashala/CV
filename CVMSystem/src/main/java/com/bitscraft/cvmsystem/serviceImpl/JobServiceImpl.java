/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.serviceImpl;

import com.bitscraft.cvmsystem.dao.JobDao;
import com.bitscraft.cvmsystem.model.Job;
import com.bitscraft.cvmsystem.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lenovo
 */
@Service("jobService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly=true)
public class JobServiceImpl implements JobService {

    @Autowired
    private JobDao jobDao;
    
    @Override
    @Transactional(propagation= Propagation.SUPPORTS, readOnly=false)
    public void addJob(Job Job) {
        jobDao.addJob(Job);
    }
    
}
