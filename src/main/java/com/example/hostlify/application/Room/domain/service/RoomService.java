package com.example.hostlify.application.Room.domain.service;

import com.example.hostlify.application.Room.domain.model.Room;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface RoomService {
    List<Room> getAll();
    Room getById(Long roomId);

    Room getByRoomNumber(int roomNumber);
    Room getByType(String type);
    Room getByCapacity(int capacity);
    Room getByBeds(String bed);
    Room getByFloor(int floor);

    Room create(Room room);
    Room update(Long roomId,Room room);
    ResponseEntity<?> delete (Long roomId);

}
