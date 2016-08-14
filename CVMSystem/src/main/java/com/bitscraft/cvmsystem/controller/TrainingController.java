/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.controller;

import com.bitscraft.cvmsystem.model.Training;
import com.bitscraft.cvmsystem.service.TrainingService;
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
 * @author Tshering
 */

@RequestMapping("/training")
@Controller
public class TrainingController {
    
    @Autowired(required=true)
    @Qualifier("trainingService")
    TrainingService trainingService;
    
    @RequestMapping(value="/addTraining", method= RequestMethod.GET)
    public ModelAndView addTraining(@ModelAttribute("training")Training trainings, BindingResult result){
        return new ModelAndView("Trainings");        
    }
            
    @RequestMapping(value="training/save", method= RequestMethod.POST)
    public ModelAndView saveTraining(@ModelAttribute("training")Training trainings, BindingResult result){
        trainingService.addTraining(trainings);
        return new ModelAndView("redirect:/training/addTraining");
    }
    
    
    
}
