package cn.chasing.patten.factory.func;

import cn.chasing.patten.factory.Car;
import cn.chasing.patten.factory.Vehicle;

public class CarFactory implements Factory {
    @Override
    public Vehicle getVehicle() {
        return new Car();
    }
}
