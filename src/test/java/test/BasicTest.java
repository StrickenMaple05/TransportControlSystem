package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import transport.publicTransport.*;
import transport.cars.*;
import transport.*;

import java.util.Arrays;


@DisplayName("Тестировка: основные действия программы")
public class BasicTest {

    private ControlSystem controlSystem;
    private PassCar audi;
    private PassCar bmw;
    private Bus bus;
    private TrolleyBus trolleyBus;

    @BeforeEach
    public void Init() {
        controlSystem = new ControlSystem();
        audi = new PassCar("1", 2015);
        bmw = new PassCar("2", 2016);
        bus = new Bus("3", 20);
        trolleyBus = new TrolleyBus("4",20);
    }

    @DisplayName("Регистрация транспортных средств")
    @Test
    public void RegistrationTest() {

        controlSystem.register(audi, bmw);
        Assertions.assertEquals(Arrays.asList(audi, bmw), controlSystem.getRegisteredVehicles());
    }

    @DisplayName("Получение информации о транспортном средстве")
    @Test
    public void InfoTest() {

        controlSystem.register(audi);
        Assertions.assertEquals(audi.toString(), controlSystem.getInfo(audi));
    }

    @DisplayName("Получение информации обо всех транспортных средствах данного типа")
    @Test
    public void TypeInfoTest() {

        controlSystem.register(audi, bmw);
        Assertions.assertEquals(Arrays.asList(audi.toString(), bmw.toString()),
                                controlSystem.getPassCarInfo());
    }

    @DisplayName("Подсчёт вместимости всего общественного транспорта")
    @Test
    public void CapacityTest() {

        controlSystem.register(bus, trolleyBus);
        Assertions.assertEquals(bus.getCapacity() + trolleyBus.getCapacity(),
                                controlSystem.getSummaryCapacity());
    }

    @DisplayName("Пересчёт автомобилей, выпущенных n лет назад")
    @Test
    public void ParamYearOldCarTest() {

        controlSystem.register(audi, bmw);
        Assertions.assertEquals(1,
                controlSystem.getParamYearOldCarsCount(5));
    }
}
