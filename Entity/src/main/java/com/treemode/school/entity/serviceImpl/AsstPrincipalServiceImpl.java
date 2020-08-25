/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.entity.serviceImpl;


import com.treemode.school.entity.model.AsstPrincipal;
import com.treemode.school.entity.repository.AsstPrincipalRepository;
import com.treemode.school.entity.service.AsstPrincipalService;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author alokdethe
 */
@Service
public class AsstPrincipalServiceImpl implements AsstPrincipalService {

    
    @Resource
    private AsstPrincipalRepository asstPrincipalRepo;
    
    @Override
    public java.util.Optional<AsstPrincipal> getAsstPrincipalById(Long id) {
        
        Optional<AsstPrincipal> asstPrincipal = asstPrincipalRepo.getAsstPrincipalById(id);
        
        return asstPrincipal;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
