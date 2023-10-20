package com.vaccination_details.vaccination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vaccination_details.vaccination.model.userDetails;

public interface OneRepo extends JpaRepository<userDetails, Long> {

    // userDetails findByDetails(String email);

}