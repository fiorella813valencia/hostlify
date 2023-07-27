package com.example.hostlify.application.Guest.service;

import com.example.hostlify.application.Guest.domain.model.Guest;
import com.example.hostlify.application.Guest.domain.persistence.GuestRepository;
import com.example.hostlify.application.Guest.domain.service.GuestService;
import com.example.hostlify.shared.exception.ResourceNotFoundException;
import jakarta.validation.Validator;
import jakarta.validation.ConstraintViolation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class GuestServiceImp implements GuestService{

    private static final String ENTITY = "Guest";

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
    public Optional<Guest> getById(Long guestId) {
        return Optional.ofNullable(guestRepository.findById(guestId).orElseThrow(() -> new ResourceNotFoundException(ENTITY, guestId)));
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

    @Override
    public Guest create(Guest guest) {
        //Set<ConstraintViolation<Guest>> violations = validator.validate(guest);
        return guestRepository.save(guest);
    }

    @Override
    public Guest update(Long agencyId, Guest guest) {
        return guestRepository.save(guest);
    }

    @Override
    public ResponseEntity<?> delete(Long guestId) {
        return guestRepository.findById(guestId).map(
                guest->{
                    guestRepository.delete(guest);
                    return ResponseEntity.ok().build();
                }
        ).orElseThrow(()->new ResourceNotFoundException(ENTITY,guestId));
    }
}
