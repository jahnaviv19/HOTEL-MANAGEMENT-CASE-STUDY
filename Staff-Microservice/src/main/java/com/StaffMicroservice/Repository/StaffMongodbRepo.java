package com.StaffMicroservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.StaffMicroservice.Model.Staff;

public interface StaffMongodbRepo extends MongoRepository<Staff, Long> {

}

