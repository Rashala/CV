/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.daoImpl;

import com.bitscraft.cvmsystem.dao.TrainingDao;
import com.bitscraft.cvmsystem.model.Training;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tshering
 */
@Repository("trainingDao")
public class TrainingDaoImpl implements TrainingDao {

    @Autowired
    SessionFactory sessionFactory;
    
    @Override
    @Transactional
    public void addTraining(Training training) {
    sessionFactory.getCurrentSession().saveOrUpdate(training);
    }
    
}
