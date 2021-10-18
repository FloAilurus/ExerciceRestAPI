package com.example.api.models.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class SmallBookingDTO {

    private long bookingId;
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean includesBreakfast;
}
