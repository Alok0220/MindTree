/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.entity.controller;

import com.treemode.school.entity.service.AsstPrincipalService;
import com.treemode.school.entity.service.ParentsService;
import com.treemode.school.entity.service.PrincipalService;
import com.treemode.school.entity.service.SeniorTeacherService;
import com.treemode.school.entity.service.StaffService;
import com.treemode.school.entity.service.StudentsService;
import com.treemode.school.entity.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    
    
    
    
}
