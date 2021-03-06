package com.springframework.msscbrewery.services;

import com.springframework.msscbrewery.web.model.BeerDTO;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDTO getBeerById(UUID beerId) {
        return BeerDTO.builder()
                      .id(UUID.randomUUID())
                      .beerName("Galaxy Cat")
                      .beerStyle("Pale Ale")
                      .build();
    }
}
