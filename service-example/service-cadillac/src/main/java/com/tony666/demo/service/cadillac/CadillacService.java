package com.tony666.demo.service.cadillac;

import com.tony666.demo.service.api.service.Author;
import com.tony666.demo.service.api.service.CarService;
import com.tony666.demo.service.api.vo.Car;

@Author(true)
public class CadillacService implements CarService {
    @Override
    public Car getCar() {
        return new Car("凯迪拉克CT6", 60_0000d);
    }
}
