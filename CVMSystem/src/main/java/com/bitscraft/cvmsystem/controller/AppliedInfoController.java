/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.controller;

import com.bitscraft.cvmsystem.model.AppliedInfo;
import com.bitscraft.cvmsystem.service.AppliedInfoService;
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
@RequestMapping("/applied")
@Controller
public class AppliedInfoController {
    
    @Autowired(required=true)
    @Qualifier("appliedInfoService")
    AppliedInfoService appliedInfoService;
    
    @RequestMapping(value = "/addAppliedInfo", method = RequestMethod.GET)
    public ModelAndView addApplied(@ModelAttribute("applied") AppliedInfo appliedInfo, BindingResult result) {
        return new ModelAndView("appliedInformation");
    }

    @RequestMapping(value="/saveAppliedInfo", method=RequestMethod.POST)
    public ModelAndView saveApplied(@ModelAttribute("applied") AppliedInfo appliedInfo, BindingResult result){
        appliedInfoService.addAppliedInfo(appliedInfo);
        return new ModelAndView("redirect:/applied/addAppliedInfo");
    }
    
}
