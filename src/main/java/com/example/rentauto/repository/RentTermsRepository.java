package com.example.rentauto.repository;

import com.example.rentauto.entity.RentTerms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RentTermsRepository extends JpaRepository<RentTerms, Long> {
}
