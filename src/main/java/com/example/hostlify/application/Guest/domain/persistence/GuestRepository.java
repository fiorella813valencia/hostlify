package com.example.hostlify.application.Guest.domain.persistence;

import com.example.hostlify.application.Guest.domain.model.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest,Long> {

    Guest findByName(String name);
    Guest findByEmail(String email);
    Guest findByLastName(String lastName);
}
