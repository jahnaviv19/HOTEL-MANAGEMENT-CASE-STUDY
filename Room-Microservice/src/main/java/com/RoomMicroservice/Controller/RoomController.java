package com.RoomMicroservice.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RoomMicroservice.Model.Room;
import com.RoomMicroservice.Model.RoomList;
import com.RoomMicroservice.Services.Roomservice;

@RestController
@RequestMapping("/rooms")
public class RoomController {

	@Autowired
	Roomservice roomService;

	@GetMapping("/hello")
	public String hello() {
		return "Hello world";
	}

	@PostMapping("/addRoom")
	public Room addRoom(@RequestBody Room room) {
		return this.roomService.addRoom(room);
	}

	@GetMapping("/findAllRoom")
	public RoomList getAllRoom() {

		RoomList list = new RoomList();
		list.setAllRoom(this.roomService.getAllRoom());
		return list;

	}

	@GetMapping("/findById/{id}")
	public Optional<Room> getRoom(@PathVariable("id") String id) {

		return this.roomService.getRoom(Long.parseLong(id));
	}

	@PutMapping("/updateRoom")
	public Room updateRoom(@RequestBody Room room) {
		return this.roomService.updateRoom(room);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteRoom(@PathVariable("id") String id) {
		return this.roomService.deleteRoom(Long.parseLong(id));
	}

	@GetMapping("/findRoomAvl")
	public RoomList getRoomAvl() {

		return this.roomService.getRoomAvl();

	}

}
