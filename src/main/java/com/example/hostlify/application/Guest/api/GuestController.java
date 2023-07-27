package com.example.hostlify.application.Guest.api;

import com.example.hostlify.application.Guest.domain.service.GuestService;
import com.example.hostlify.application.Guest.mapping.GuestMapper;
import com.example.hostlify.application.Guest.resource.CreateGuestResource;
import com.example.hostlify.application.Guest.resource.GuestResource;
import com.example.hostlify.application.Guest.resource.UpdateGuestResource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping
    public Page<GuestResource> getAll(Pageable pageable){
        return mapper.modelListPage(guestService.getAll(),pageable);
    }

    @PostMapping
    public GuestResource createGuest(@RequestBody CreateGuestResource resource){
        return mapper.toResource(guestService.create(mapper.toModel(resource)));
    }

    @PutMapping("/{guestId}")
    public GuestResource updateGuest(@PathVariable Long guestId,@RequestBody UpdateGuestResource resource){
        return mapper.toResource(guestService.update(guestId,mapper.toModel(resource)));
    }

    @DeleteMapping("/{guestId}")
    public ResponseEntity<?> deleteGuest(@PathVariable Long guestId){
        return guestService.delete(guestId);
    }

}
