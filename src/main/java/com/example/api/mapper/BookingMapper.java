package com.example.api.mapper;

import com.example.api.models.dto.BookingDTO;
import com.example.api.models.dto.ClientDTO;
import com.example.api.models.dto.RoomDTO;
import com.example.api.models.dto.SmallBookingDTO;
import com.example.api.models.entity.Booking;
import com.example.api.models.entity.Client;
import com.example.api.models.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingMapper implements Mapper<BookingDTO, Booking> {

    @Autowired
    private Mapper<RoomDTO, Room> roomMapper;
    @Autowired
    private Mapper<ClientDTO, Client> clientMapper;

    @Override
    public BookingDTO entityToDTO(Booking entity) {
        if (entity == null)
            return null;

        return BookingDTO.builder()
                .bookingId(entity.getBookingId())
                .startDate(entity.getStartDate())
                .endDate(entity.getEndDate())
                .includesBreakfast(entity.isIncludesBreakfast())
                .room(roomMapper.entityToDTO(entity.getRoom()))
                .client(clientMapper.entityToDTO(entity.getClient()))
                .build();

    }

    public SmallBookingDTO entityToSmall(Booking entity) {
        if (entity == null)
            return null;

        return SmallBookingDTO.builder()
                .bookingId(entity.getBookingId())
                .startDate(entity.getStartDate())
                .endDate(entity.getEndDate())
                .includesBreakfast(entity.isIncludesBreakfast())
                .build();
    }
}
