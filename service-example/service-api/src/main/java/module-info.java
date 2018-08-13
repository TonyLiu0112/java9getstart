import com.tony666.demo.service.api.service.CarService;
import com.tony666.demo.service.api.service.DefaultCar;

module api {
    exports com.tony666.demo.service.api.service;
    exports com.tony666.demo.service.api.vo;

    provides CarService with DefaultCar;

    uses com.tony666.demo.service.api.service.CarService;
}