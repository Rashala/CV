/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bitscraft.cvmsystem.controller;


import com.bitscraft.cvmsystem.model.admin;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author preea
 */

@RequestMapping(value = "/admin")
@Controller
public class login{

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView index(@ModelAttribute("admin") admin admin, BindingResult result) {
       return new ModelAndView("login");
    }

   
    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public String submit(@ModelAttribute("admin") admin admin, Model model) {
        if (admin != null && admin.getUserName() != null & admin.getPassword() != null) {
            if (admin.getUserName().equals("snigdha") && admin.getPassword().equals("password")) {
                model.addAttribute("admin", "welcome" + admin.getUserName());
                return "redirect:/personal/addPersonal";
            } else {
                model.addAttribute("admin", "Invalid Details");
                return "login";
            }
        } else {
            model.addAttribute("admin", "Please enter Details");
            return "login";
        }
    }

}
