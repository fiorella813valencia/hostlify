package com.example.hostlify.application.Guest.resource;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class CreateGuestResource {

    @NotBlank
    @NotNull
    private String name;
    @NotBlank
    @NotNull
    private String lastName;
    @NotBlank
    @NotNull
    @Column(unique = true)
    private String email;
    @NotBlank
    @NotNull
    private String password;
    @NotNull
    @Column(unique = true)
    private int phoneNumber;
    @NotBlank
    @NotNull
    private String photo;
}
