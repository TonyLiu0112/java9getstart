package com.tony666.demo.service.benz;

import com.tony666.demo.service.api.service.Author;
import com.tony666.demo.service.api.service.CarService;
import com.tony666.demo.service.api.vo.Car;

@Author
public class BenzService implements CarService {
    @Override
    public Car getCar() {
        return new Car("奔驰S200L", 90_0000d);
    }
}
