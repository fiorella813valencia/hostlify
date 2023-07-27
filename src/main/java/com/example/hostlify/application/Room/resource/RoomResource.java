package com.example.hostlify.application.Room.resource;

import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
public class RoomResource {
    private Long roomId;

    private int roomNumber;

    private String type;

    private String description;

    private int capacity;

    private String beds;

    private Float rate;

    private boolean status;

    private String facilities;

    private int floor;

    private String photo;

}
