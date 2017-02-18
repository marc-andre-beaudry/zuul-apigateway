package com.marc.gateway.service;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UniqueIdService {

    public String getOne() {
        return UUID.randomUUID().toString();
    }
}
