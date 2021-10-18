package com.example.api.models.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class BookingDTO {

    private long bookingId;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean includesBreakfast;
    private RoomDTO room;
    private ClientDTO client;
}
