package com.example.rentauto.repository;


import com.example.rentauto.entity.DrivingLicense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DrivingLicenseRepository extends JpaRepository<DrivingLicense, Long> {
}
