import com.tony666.demo.service.api.service.CarService;
import com.tony666.demo.service.cadillac.CadillacService;

module service.cadillac {
    requires api;

    provides CarService with CadillacService;
}