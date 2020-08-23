/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.treemode.school.entity.repository;

import com.treemode.school.entity.model.AsstPrincipal;
import com.treemode.school.entity.model.Principal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author alokdethe
 */
@Repository
public interface PrincipalRepository extends JpaRepository<Principal, Long> {
    
}
