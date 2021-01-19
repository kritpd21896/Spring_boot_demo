package com.spring.demo.project.Springdemoproject.entity.roles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolesRepository extends JpaRepository<UserRoles, Integer> {

}
