/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.daoImpl;

import com.bitscraft.cvmsystem.dao.AcademicDao;
import com.bitscraft.cvmsystem.model.Academic;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Tshering
 */
@Repository("academicDao")
public class AcademicDaoImpl implements AcademicDao {

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    @Transactional
    public void addAcademic(Academic academic) {
        sessionFactory.getCurrentSession().saveOrUpdate(academic);
    }
    
}
