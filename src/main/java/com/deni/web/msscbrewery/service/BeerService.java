package com.deni.web.msscbrewery.service;

import com.deni.web.msscbrewery.model.BeerDto;

import java.util.UUID;

public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
