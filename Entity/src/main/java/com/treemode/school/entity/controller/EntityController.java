/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.entity.controller;

import com.treemode.school.entity.model.Parents;
import com.treemode.school.entity.model.Students;
import com.treemode.school.entity.service.ParentsService;
import com.treemode.school.entity.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author alokdethe
 */
@Controller
@RequestMapping("api")
public class EntityController {
    
    @Autowired
    private ParentsService parentsService;
    
    @Autowired
    private StudentsService studentService;
    
    @GetMapping( value = { "getParents/{id}" }, produces = { "application/json" } )
    public @ResponseBody Parents getParents( @PathVariable Long id ){
        
        return null;
    }
    
    @GetMapping( value = { "getStudents/{id}" }, produces = { "application/json" } )
    public @ResponseBody Students getStudents( @PathVariable Long id ){
        
        return null;
    }
    
     @PostMapping( value = {"/SaveParents"} )  
    private void saveParents(@RequestBody Parents parents)   
    {   
       Object obj = parentsService.saveParents(parents);
      
    }
    
    @PostMapping( value = {"/SaveStudents"} )  
    private void saveParents(@RequestBody Students students)   
    {   
       Object obj = studentService.saveStudents(students);
      
    }
    
}
