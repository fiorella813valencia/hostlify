package com.example.hostlify.application.Guest.api;

import com.example.hostlify.application.Guest.domain.service.GuestService;
import com.example.hostlify.application.Guest.mapping.GuestMapper;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@Validated
@RestController
@RequestMapping("/api/v1/guests")
public class GuestController {
    public final GuestService guestService;
    private final GuestMapper mapper;

    public GuestController(GuestService guestService, GuestMapper mapper){
        this.guestService=guestService;
        this.mapper=mapper;
    }

}
