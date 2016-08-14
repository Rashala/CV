/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.serviceImpl;

import com.bitscraft.cvmsystem.dao.AcademicDao;
import com.bitscraft.cvmsystem.model.Academic;
import com.bitscraft.cvmsystem.service.AcademicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tshering
 */
@Service("academicService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class AcademicServiceImpl implements AcademicService {

    @Autowired
    @Qualifier("academicDao")
    private AcademicDao academicDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false)
    public void addAcademic(Academic academic) {
        academicDao.addAcademic(academic);
    }

}
