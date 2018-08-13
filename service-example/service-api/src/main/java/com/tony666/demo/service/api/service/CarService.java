package com.tony666.demo.service.api.service;

import com.tony666.demo.service.api.vo.Car;

import java.util.ServiceLoader;

public interface CarService {

    Car getCar();

    static ServiceLoader<CarService> getServices() {
        return ServiceLoader.load(CarService.class);
    }

}
