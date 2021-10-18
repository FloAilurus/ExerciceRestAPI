package com.example.api.mapper;

import com.example.api.models.dto.BookingDTO;
import com.example.api.models.dto.ClientDTO;
import com.example.api.models.entity.Booking;
import com.example.api.models.entity.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class ClientMapper implements Mapper<ClientDTO, Client> {

    @Autowired
    private BookingMapper bookingMapper;

    @Override
    public ClientDTO entityToDTO(Client entity) {
        if (entity == null)
            return null;

        return ClientDTO.builder()
                .clientId(entity.getClientId())
                .lastName(entity.getLastName())
                .firstName(entity.getFirstName())
                .phoneNumber(entity.getPhoneNumber())
                .paymentMethods(entity.getPaymentMethods())
                .bookings(
                        entity.getBookings()
                        .stream()
                        .map(bookingMapper::entityToSmall)
                        .collect(Collectors.toSet())
                )
                .build();
    }
}
