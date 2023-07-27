package com.example.hostlify.application.Guest.mapping;

import com.example.hostlify.application.Guest.domain.model.Guest;
import com.example.hostlify.application.Guest.resource.CreateGuestResource;
import com.example.hostlify.application.Guest.resource.GuestResource;
import com.example.hostlify.application.Guest.resource.UpdateGuestResource;
import com.example.hostlify.shared.mapping.EnhancedModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.List;
@Component
@EnableAutoConfiguration
public class GuestMapper implements Serializable {

    @Autowired
    EnhancedModelMapper mapper;

    public GuestResource toResource(Guest model) { return mapper.map(model, GuestResource.class); }

    public Guest toModel(CreateGuestResource resource) { return mapper.map(resource, Guest.class); }

    public Guest toModel(UpdateGuestResource resource) { return mapper.map(resource, Guest.class); }

    public Page<GuestResource> modelListPage(List<Guest> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList, GuestResource.class), pageable, modelList.size());
    }
}
