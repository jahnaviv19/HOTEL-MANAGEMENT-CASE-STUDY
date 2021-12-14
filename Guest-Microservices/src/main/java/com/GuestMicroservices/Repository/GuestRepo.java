package com.GuestMicroservices.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.GuestMicroservices.Model.Guest;




@Repository
public interface GuestRepo extends MongoRepository<Guest, Integer>{

}