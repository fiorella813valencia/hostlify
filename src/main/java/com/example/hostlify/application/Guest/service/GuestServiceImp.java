package com.example.hostlify.application.Guest.service;

import com.example.hostlify.application.Guest.domain.model.Guest;
import com.example.hostlify.application.Guest.domain.persistence.GuestRepository;
import com.example.hostlify.application.Guest.domain.service.GuestService;
import jakarta.validation.Validator;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class GuestServiceImp implements GuestService{

    private static final String ENTITY = "Agency";

    private final GuestRepository guestRepository;

    private final Validator validator;

    public GuestServiceImp(GuestRepository guestRepository, Validator validator) {
        this.guestRepository = guestRepository;
        this.validator = validator;
    }
    @Override
    public List<Guest> getAll() {
        return guestRepository.findAll();
    }

    @Override
    public Page<Guest> getAll(Pageable pageable) {
        return guestRepository.findAll(pageable);
    }

    @Override
    public Guest getByEmail(String email) {
        return guestRepository.findByEmail(email);
    }

    @Override
    public Guest getByName(String name) {
        return guestRepository.findByName(name);
    }

    @Override
    public Guest getByLastName(String lastName) {
        return guestRepository.findByName(lastName);
    }
}
