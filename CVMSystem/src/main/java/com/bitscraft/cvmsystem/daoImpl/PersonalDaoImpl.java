/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.daoImpl;

import com.bitscraft.cvmsystem.dao.PersonalDao;
import com.bitscraft.cvmsystem.model.Personal;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Lenovo
 */
@Repository("personalDao")
public class PersonalDaoImpl implements PersonalDao {

    @Autowired
    SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sf) {
        this.sessionFactory = sf;
    }
    
    @Override
    @Transactional
    public void addPersonal(Personal personal) {
        sessionFactory.getCurrentSession().saveOrUpdate(personal);
    }
    
}
