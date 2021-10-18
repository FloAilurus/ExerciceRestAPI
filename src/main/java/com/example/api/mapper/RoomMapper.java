package com.example.api.mapper;

import com.example.api.models.dto.RoomDTO;
import com.example.api.models.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class RoomMapper implements Mapper<RoomDTO, Room> {

    @Autowired
    private BookingMapper bookingMapper;

    @Override
    public RoomDTO entityToDTO(Room entity) {
        if (entity == null)
        return null;

        return RoomDTO.builder()
                .roomNumber(entity.getRoomNumber())
                .placeNbr(entity.getPlaceNbr())
                .price(entity.getPrice())
                .bookings(entity.getBookings()
                        .stream()
                        .map(bookingMapper::entityToSmall)
                        .collect(Collectors.toSet()))
                .build();

    }
}
