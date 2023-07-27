package com.example.hostlify.application.Room.domain.persistence;

import com.example.hostlify.application.Room.domain.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room,Long> {
    Room findByRoomNumber(int roomNumber);
    Room findByType(String type);
    Room findByCapacity(int capacity);
    Room findByBeds(String beds);
    Room findByFloor(int floor);
}
