/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.controller;

import com.bitscraft.cvmsystem.model.Personal;
import com.bitscraft.cvmsystem.service.PersonalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Lenovo
 */
@RequestMapping(value = "/personal")
@Controller
public class PersonalController {
    
    @Autowired(required=true)
    @Qualifier("personalService")
    PersonalService personalService;
    
     @RequestMapping(value="/addPersonal", method= RequestMethod.GET)
    public ModelAndView addPersonal(@ModelAttribute("personal")Personal personals, BindingResult result){
        return new ModelAndView("PersonalDetail");
    }

    
    @RequestMapping(value="personal/save", method= RequestMethod.POST)
    public ModelAndView savePersonal(@ModelAttribute("personal")Personal personals, BindingResult result){
        personalService.addPersonal(personals);
        return new ModelAndView("redirect:/personal/addPersonal");
    }
    
   
    
    
}
