package com.example.hostlify.application.Room.domain.model;

import com.example.hostlify.shared.domain.model.AuditModel;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="room")
public class Room extends AuditModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roomId;

    @NotNull
    private int roomNumber;
    @NotBlank
    private String type;
    @NotBlank
    private String description;
    @NotNull
    private int capacity;
    @NotBlank
    private String beds;
    @NotNull
    private Float rate;
    @NotBlank
    private boolean status;
    @NotBlank
    private String facilities;
    @NotBlank
    private int floor;
    @NotBlank
    private String photo;

}
