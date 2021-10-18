package com.example.api.models.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class ClientDTO {

    private long clientId;
    private String lastName;
    private String firstName;
    private String phoneNumber;
    private Set<String> paymentMethods;
    private Set<SmallBookingDTO> bookings;
}
