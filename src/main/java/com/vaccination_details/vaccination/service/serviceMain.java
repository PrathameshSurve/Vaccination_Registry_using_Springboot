package com.vaccination_details.vaccination.service;

import java.util.List;

import com.vaccination_details.vaccination.model.userDetails;

public interface serviceMain {

    public void addUser(userDetails user);

    public List<userDetails> getAllUsers();
}
