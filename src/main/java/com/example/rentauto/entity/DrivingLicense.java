package com.example.rentauto.entity;

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
@Table(name = "driving_license")
public class DrivingLicense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_photo")
    private String firstPhoto;

    @Column(name = "second_photo")
    private String secondPhoto;

    @OneToOne(mappedBy = "drivingLicense")
    private User user;
}
