package com.example.hostlify.application.Guest.resource;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class GuestResource {
    private Long id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private int phoneNumber;
    private String photo;

}
