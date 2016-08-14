/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.serviceImpl;

import com.bitscraft.cvmsystem.dao.TrainingDao;
import com.bitscraft.cvmsystem.model.Training;
import com.bitscraft.cvmsystem.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tshering
 */
@Service("trainingService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class TrainingServiceImpl implements TrainingService {

    @Autowired
    @Qualifier("trainingDao")
    private TrainingDao trainingDao;
    
    @Override
    @Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public void addTraining(Training training) {
        
        }
    
    
    
}
