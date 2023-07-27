package com.example.hostlify.application.Guest.domain.service;

import com.example.hostlify.application.Guest.domain.model.Guest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface GuestService {
    List<Guest> getAll();
    Page<Guest> getAll(Pageable pageable);
    Optional<Guest> getById(Long guestId);
    Guest getByEmail(String email);
    Guest getByName(String name);
    Guest getByLastName(String lastName);

    Guest create(Guest guest);
    Guest update(Long guestId, Guest guest);
    ResponseEntity<?> delete(Long guestId);
}