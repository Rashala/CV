/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.controller;

import com.bitscraft.cvmsystem.model.Academic;
import com.bitscraft.cvmsystem.service.AcademicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "/academic")
@Controller
public class AcademicController {

    @Autowired(required = true)
    @Qualifier("academicService")
    AcademicService academicService;

    @RequestMapping(value = "/addAcademic", method = RequestMethod.GET)
    public ModelAndView addAcademic(@ModelAttribute("academic") Academic academics, BindingResult result) {
        return new ModelAndView("academicQualification");
    }

    @RequestMapping(value = "academic/save", method = RequestMethod.POST)
    public ModelAndView saveAcademic(@ModelAttribute("academic") Academic academics, BindingResult result) {
        academicService.addAcademic(academics);
        return new ModelAndView("redirect:/academic/addAcademic");
    }

}
