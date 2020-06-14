package com.deni.web.msscbrewery.service;

import com.deni.web.msscbrewery.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}
