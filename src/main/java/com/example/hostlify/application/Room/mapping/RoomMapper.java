package com.example.hostlify.application.Room.mapping;

import com.example.hostlify.application.Room.domain.model.Room;
import com.example.hostlify.application.Room.resource.CreateRoomResource;
import com.example.hostlify.application.Room.resource.RoomResource;
import com.example.hostlify.application.Room.resource.UpdateRoomResource;
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
public class RoomMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;

    public RoomResource toResource(Room model) { return mapper.map(model, RoomResource.class); }

    public Room toModel(CreateRoomResource resource) { return mapper.map(resource, Room.class); }

    public Room toModel(UpdateRoomResource resource) { return mapper.map(resource, Room.class); }

    public Page<RoomResource> modelListPage(List<Room> modelList, Pageable pageable){
        return new PageImpl<>(mapper.mapList(modelList, RoomResource.class), pageable, modelList.size());
    }
}
