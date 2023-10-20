package com.vaccination_details.vaccination.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vaccination_details.vaccination.model.userDetails;
import com.vaccination_details.vaccination.repository.OneRepo;

@Service
public class servicesIMPL implements serviceMain {

    @Autowired
    private OneRepo obj;

    @Override
    public void addUser(userDetails user) {
        obj.save(user);
    }
}
