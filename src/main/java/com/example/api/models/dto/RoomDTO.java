package com.example.api.models.dto;

import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class RoomDTO {

    private long roomNumber;
    private long placeNbr;
    private long price;
    private Set<SmallBookingDTO> bookings;
}
