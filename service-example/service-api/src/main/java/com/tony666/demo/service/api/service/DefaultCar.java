package com.tony666.demo.service.api.service;

import com.tony666.demo.service.api.vo.Car;

@Author
public class DefaultCar implements CarService {
    @Override
    public Car getCar() {
        return new Car("大众捷达", 130000d);
    }

}
