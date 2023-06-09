package com.example.demo.repository;

import com.example.demo.entity.Doctor;
import com.example.demo.entity.DonationCenter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {
    Optional<Doctor> findByEmail(String email);
    List<Doctor> findByDonationCenter(DonationCenter center);
}
