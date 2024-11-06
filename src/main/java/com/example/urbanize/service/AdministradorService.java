package com.example.urbanize.service;

import com.example.urbanize.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AdministradorService {
        @Autowired
        AdministradorRepository administradorRepository;
}
