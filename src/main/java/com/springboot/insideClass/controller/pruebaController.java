package com.springboot.insideClass.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/prueba")
@SecurityRequirement(name = "insideClassapi")
public class pruebaController {

    @GetMapping
    public String listAll() {

        return "hola";
    }

}
