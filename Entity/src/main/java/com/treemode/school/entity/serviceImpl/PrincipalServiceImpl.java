/*

 * Copyright (C) Joffer Systems, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by Alok Dethe <dethealok@gmail.com>, <det.alex0110@gmail.com>, July 2020

 */
package com.treemode.school.entity.serviceImpl;

import com.treemode.school.entity.model.Principal;
import com.treemode.school.entity.repository.PrincipalRepository;
import com.treemode.school.entity.service.PrincipalService;
import java.util.Optional;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author alokdethe
 */
@Service
public class PrincipalServiceImpl implements PrincipalService {

    @Resource
    private PrincipalRepository principalRepo;
    
    @Override
    public Optional<Principal> getPrincipalById(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Principal savePrincipal(Principal principal) {
        return principalRepo.saveAndFlush(principal);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
