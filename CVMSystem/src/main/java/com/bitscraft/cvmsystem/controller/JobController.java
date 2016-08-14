/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.controller;

import com.bitscraft.cvmsystem.model.Job;
import com.bitscraft.cvmsystem.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping(value= "/job")
@Controller
public class JobController {
    
    @Autowired
    private JobService jobService;
    
    @RequestMapping(value="/add", method= RequestMethod.GET)
    public ModelAndView addJob(@ModelAttribute("job")Job job, BindingResult result){
        return new ModelAndView("Job");
    }
    
    @RequestMapping(value="/save", method= RequestMethod.POST)
    public ModelAndView saveJob(@ModelAttribute("job")Job job, BindingResult result){
        jobService.addJob(job);
        return new ModelAndView("redirect:/job/add");
    }
}
