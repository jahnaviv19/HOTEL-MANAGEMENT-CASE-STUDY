package com.DepartmentMicroservices.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.DepartmentMicroservices.Model.Department;

@Repository
public interface DepartmentRepo extends MongoRepository<Department, Long> {

}
