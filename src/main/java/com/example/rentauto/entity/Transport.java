package com.example.rentauto.entity;

import com.example.rentauto.enums.Brand;
import com.example.rentauto.enums.TransportBody;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "transports")
public class Transport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

    @Enumerated(EnumType.STRING)
    private Brand brand;

    @Column(name = "model")
    private String model;

    //дата выпуска
    @Column(name = "year_of_release")
    private int yearOfRelease;

    //кузов
    @Enumerated(EnumType.STRING)
    private TransportBody carBody;

    //колличество посадочных мест
    @Column(name = "count_of_seats")
    private int countOfSeats;

    //руль авто с какой стороны
    private String wheel;

    @Column(name = "car_mileage")
    private String carMileage;

    //какой привод, например: полноприводный, передний, задний
    @Column(name = "car_drive")
    private String carDrive;

    @Column(name = "type_transmission")
    private String transmission;

    private String engine;

    @Column(name = "car_class")
    private String carClass;

    @Column(name = "is_available")
    private boolean isAvailable;

    @OneToOne
    private RentTerms rentTerms;
}
