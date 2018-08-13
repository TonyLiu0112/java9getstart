package com.tony666.demo.client;

import com.tony666.demo.service.api.service.Author;
import com.tony666.demo.service.api.service.CarService;

import java.util.ServiceLoader;

public class App {

    public static void main(String[] args) {
        System.err.println("所有的车辆有:");
        getAllCars();
        System.out.println("-----------------------");
        System.err.println("我的车辆是:");
        getMyCars();
    }

    private static void getAllCars() {
        ServiceLoader<CarService> services = CarService.getServices();
        services.forEach(carService -> System.out.println(carService.getCar().toString()));
    }

    private static void getMyCars() {
        ServiceLoader<CarService> services = CarService.getServices();
        services.stream().filter(App::isMine).forEach(provider -> System.out.println(provider.get().getCar().toString()));
    }

    private static boolean isMine(ServiceLoader.Provider<CarService> provider) {
        return provider.type().isAnnotationPresent(Author.class) && provider.type().getAnnotation(Author.class).value();
    }
}
