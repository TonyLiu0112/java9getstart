import com.tony666.demo.service.api.service.CarService;
import com.tony666.demo.service.benz.BenzService;

module service.benz {
    requires transitive api;

    provides CarService with BenzService;
}