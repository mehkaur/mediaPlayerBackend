package com.cg.onlinemediaplayerJWT.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.onlinemediaplayerJWT.models.ERole;
import com.cg.onlinemediaplayerJWT.models.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
