package com.cars.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarDTO;

@RestController
@RequestMapping("/")
public class CarsController {

  @PostMapping
  public void createCar(@RequestBody CarDTO req) {
    System.out.println("Modelo: " + req.modelo());
    System.out.println("Fabricante: " + req.fabricante());
    System.out.println("Data de fabricacao: " + req.dataFabricacao());
    System.out.println("Valor: " + req.valor());
    System.out.println("Ano do modelo: " + req.anoModelo());
  }
}
