package com.example.hostlify.application.Guest.domain.service;

import com.example.hostlify.application.Guest.domain.model.Guest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface GuestService {
    List<Guest> getAll();
    Page<Guest> getAll(Pageable pageable);
    Guest getByEmail(String email);
    Guest getByName(String name);
    Guest getByLastName(String lastName);
}