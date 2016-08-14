/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.serviceImpl;

import com.bitscraft.cvmsystem.dao.AppliedInfoDao;
import com.bitscraft.cvmsystem.model.AppliedInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lenovo
 */
@Service("appliedInfoService")
@Transactional(propagation=Propagation.SUPPORTS, readOnly=true)
public class AppliedInfoServiceImpl implements AppliedInfoDao {
    
    @Autowired
    @Qualifier("appliedInfoDao")
    private AppliedInfoDao appliedInfoDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addAppliedInfo(AppliedInfo appliedInfo) {
        appliedInfoDao.addAppliedInfo(appliedInfo);
    }
    
}
