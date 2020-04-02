package transport;

import transport.cars.*;
import transport.mobility.*;
import transport.publicTransport.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Система учёта транспорта */
public class ControlSystem {

    /** Зарегистрированные транспортные средства */
    private List<Vehicle> registeredVehicles;

    public ControlSystem() {
        registeredVehicles = new ArrayList<>();
    }

    /**
     * Регистрация транспортных средств в системе
     * @param vehicles транспортные средства
     */
    public void register(Vehicle... vehicles) {
        registeredVehicles.addAll(Arrays.asList(vehicles));
    }

    /**
     * Получение актуальной информации о заданном транспортном средстве
     * @param vehicle транспортное средство
     * @return информация
     */
    public String getInfo(Vehicle vehicle) {
        return vehicle.toString();
    }

    public List<String> getPassCarInfo() {
        List<String> info = new ArrayList<>();
        for (Vehicle vehicle : registeredVehicles) {
            if (vehicle instanceof PassCar) {
                info.add(vehicle.toString());
            }
        }
        return info;
    }
    public List<String> getTruckInfo() {
        List<String> info = new ArrayList<>();
        for (Vehicle vehicle : registeredVehicles) {
            if (vehicle instanceof Truck) {
                info.add(vehicle.toString());
            }
        }
        return info;
    }
    public List<String> getBusInfo() {
        List<String> info = new ArrayList<>();
        for (Vehicle vehicle : registeredVehicles) {
            if (vehicle instanceof Bus) {
                info.add(vehicle.toString());
            }
        }
        return info;
    }
    public List<String> getTrolleyBusInfo() {
        List<String> info = new ArrayList<>();
        for (Vehicle vehicle : registeredVehicles) {
            if (vehicle instanceof TrolleyBus) {
                info.add(vehicle.toString());
            }
        }
        return info;
    }
    public List<String> getTramInfo() {
        List<String> info = new ArrayList<>();
        for (Vehicle vehicle : registeredVehicles) {
            if (vehicle instanceof Tram) {
                info.add(vehicle.toString());
            }
        }
        return info;
    }
    public List<String> getSubwayTrainInfo() {
        List<String> info = new ArrayList<>();
        for (Vehicle vehicle : registeredVehicles) {
            if (vehicle instanceof SubwayTrain) {
                info.add(vehicle.toString());
            }
        }
        return info;
    }
    public List<String> getScooterInfo() {
        List<String> info = new ArrayList<>();
        for (Vehicle vehicle : registeredVehicles) {
            if (vehicle instanceof Scooter) {
                info.add(vehicle.toString());
            }
        }
        return info;
    }
    public List<String> getBicycleInfo() {
        List<String> info = new ArrayList<>();
        for (Vehicle vehicle : registeredVehicles) {
            if (vehicle instanceof Bicycle) {
                info.add(vehicle.toString());
            }
        }
        return info;
    }

    /**
     * Подсчёт суммарной вместимости общественного транспорта
     * @return вместимость
     */
    public int getSummaryCapacity() {
        int capacity = 0;
        for (Vehicle vehicle : registeredVehicles) {
            if (vehicle instanceof PublicTransport) {
                capacity += ((PublicTransport) vehicle).getCapacity();
            }
        }
        return capacity;
    }

    /**
     * Посчёт количества автомобилей, выпущенных param лет назад
     * @param param возраст
     * @return количество автомобилей
     */
    public int getParamYearOldCarsCount(int param) {
        int count = 0;
        int currentYear = LocalDate.now().getYear();
        for (Vehicle vehicle : registeredVehicles) {
            if (vehicle instanceof PassCar) {
                count += currentYear - param == ((PassCar) vehicle).getYear() ? 1 : 0;
            }
        }
        return count;
    }

    public List<Vehicle> getRegisteredVehicles() {
        return registeredVehicles;
    }
}
