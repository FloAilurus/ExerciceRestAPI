package com.example.api.models.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "room")
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    @Id
    private long roomNumber;

    @Column(nullable = false)
    private long placeNbr;

    @Column(nullable = false)
    private long price;

    @OneToMany(mappedBy = "room")
    private Set<Booking> bookings;

}
