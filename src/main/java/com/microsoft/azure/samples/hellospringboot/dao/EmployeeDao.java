package com.microsoft.azure.samples.hellospringboot.dao;

import com.microsoft.azure.samples.hellospringboot.entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface EmployeeDao extends CrudRepository<EmployeeEntity, Integer> {

}
