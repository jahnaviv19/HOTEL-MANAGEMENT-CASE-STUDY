package com.RoomMicroservice.Repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.RoomMicroservice.Model.Room;

@Repository
public interface RoomMongodbRepos extends MongoRepository<Room, Long> {

	@Query("{roomAvl:true}")
	List<Room> findAvailable();

}