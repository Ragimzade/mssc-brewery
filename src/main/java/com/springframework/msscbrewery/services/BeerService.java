package com.springframework.msscbrewery.services;

import com.springframework.msscbrewery.web.model.BeerDTO;

import java.util.UUID;
public interface BeerService {

    BeerDTO getBeerById(UUID beerId);
}
