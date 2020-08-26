/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.entity.controller;

import com.treemode.school.entity.model.AsstPrincipal;
import com.treemode.school.entity.model.Parents;
import com.treemode.school.entity.model.School;
import com.treemode.school.entity.model.SeniorTeacher;
import com.treemode.school.entity.service.AsstPrincipalService;
import com.treemode.school.entity.service.ParentsService;
import com.treemode.school.entity.service.PrincipalService;
import com.treemode.school.entity.service.SeniorTeacherService;
import com.treemode.school.entity.service.StaffService;
import com.treemode.school.entity.service.StudentsService;
import com.treemode.school.entity.service.TeacherService;
import java.util.Optional;
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
public class EducationEntityController {
    
    @Autowired
    private AsstPrincipalService asstPrincipalService;
    
    @Autowired
    private PrincipalService principalService;
    
    @Autowired
    private SeniorTeacherService seniorTeacherService;
    
    @Autowired
    private StaffService staffService;
    
    @Autowired
    private TeacherService teacherService;
    
    @GetMapping( value = { "getAsstPrincipal/{id}" }, produces = { "application/json" } )
    public @ResponseBody AsstPrincipal getAsstPrincipal( @PathVariable Long id ){
        
        Optional<AsstPrincipal> asstPrincipal = asstPrincipalService.getAsstPrincipalById(id);
        AsstPrincipal asstPrincipalObj = asstPrincipal.get();
        
        return asstPrincipalObj;
    }
    
    @GetMapping( value = { "getSchool/{id}" }, produces = { "application/json" } )
    public @ResponseBody School getSchool( @PathVariable Long id ){
        
        return null;
    }
    
    @GetMapping( value = { "getSTeacher/{id}" }, produces = { "application/json" } )
    public @ResponseBody SeniorTeacher getSTeacher( @PathVariable Long id ){
        
        return null;
    }
    
    @PostMapping( value = {"/AsstPrincipal"} )  
    private int savePrincipal(@RequestBody AsstPrincipal asstPrincipal)   
    {  
        //booksService.saveOrUpdate(books);  
       return 0;//books.getBookid();  
    }  
    
}
