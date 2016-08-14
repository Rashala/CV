/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.serviceImpl;

import com.bitscraft.cvmsystem.dao.PersonalDao;
import com.bitscraft.cvmsystem.model.Personal;
import com.bitscraft.cvmsystem.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lenovo
 */
@Service("personalService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class PersonalServiceImpl implements PersonalService{

    @Autowired
    @Qualifier("personalDao")
    private PersonalDao personalDao;
    
    @Override
    @Transactional(propagation=Propagation.REQUIRED, readOnly=false)
    public void addPersonal(Personal personal) {
        personalDao.addPersonal(personal);
    }
    
}
