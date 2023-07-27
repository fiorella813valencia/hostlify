package com.example.hostlify.Mapping;

import com.example.hostlify.application.Guest.mapping.GuestMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration("HostlifyAPIMappingConfiguration")
public class MappingConfiguration {
    @Bean
    public GuestMapper GuestMapper() { return new GuestMapper(); }
}