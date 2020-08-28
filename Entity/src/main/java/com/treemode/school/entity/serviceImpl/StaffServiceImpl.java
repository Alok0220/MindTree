/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.entity.serviceImpl;

import com.treemode.school.entity.model.SeniorTeacher;
import com.treemode.school.entity.model.Staff;
import com.treemode.school.entity.repository.StaffRepository;
import com.treemode.school.entity.service.StaffService;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author alokdethe
 */
@Service
public class StaffServiceImpl implements StaffService {

    @Resource
    private StaffRepository staffRepo;
    
    @Override
    public Optional<Staff> getStaffById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Staff saveStaff(Staff staff) {
        return staffRepo.saveAndFlush(staff);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
