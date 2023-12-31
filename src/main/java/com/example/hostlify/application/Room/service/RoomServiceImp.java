package com.example.hostlify.application.Room.service;

import com.example.hostlify.application.Guest.domain.persistence.GuestRepository;
import com.example.hostlify.application.Room.domain.model.Room;
import com.example.hostlify.application.Room.domain.persistence.RoomRepository;
import com.example.hostlify.application.Room.domain.service.RoomService;
import jakarta.validation.Validator;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomServiceImp implements RoomService {
    private static final String ENTITY = "Room";

    private final RoomRepository roomRepository;

    private final Validator validator;

    public RoomServiceImp(RoomRepository roomRepository, Validator validator) {
        this.roomRepository = roomRepository;
        this.validator = validator;
    }
    @Override
    public List<Room> getAll() {
        return null;
    }

    @Override
    public Room getById(Long roomId) {
        return null;
    }

    @Override
    public Room getByRoomNumber(int roomNumber) {
        return null;
    }

    @Override
    public Room getByType(String type) {
        return null;
    }

    @Override
    public Room getByCapacity(int capacity) {
        return null;
    }

    @Override
    public Room getByBeds(String bed) {
        return null;
    }

    @Override
    public Room getByFloor(int floor) {
        return null;
    }

    @Override
    public Room create(Room room) {
        return null;
    }

    @Override
    public Room update(Long roomId, Room room) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(Long roomId) {
        return null;
    }
}
