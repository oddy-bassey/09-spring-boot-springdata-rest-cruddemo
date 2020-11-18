package com.revoltcode.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.revoltcode.springboot.cruddemo.entity.Employee;

//SpringData uses the actual entity name with its first letter in lowercase

//we can also provide a preferred name by using the @RepositoryRestResource(path="preferredName")

//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
