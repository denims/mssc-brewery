package com.deni.web.msscbrewery.service;

import com.deni.web.msscbrewery.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Test Name")
                .beerStyle("Test Style")
                .build();
    }
}
