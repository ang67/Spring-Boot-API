package com.angui.springbootapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.angui.springbootapi.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}