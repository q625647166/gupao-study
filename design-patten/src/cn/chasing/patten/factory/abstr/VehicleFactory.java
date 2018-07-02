package cn.chasing.patten.factory.abstr;

import cn.chasing.patten.factory.Car;
import cn.chasing.patten.factory.Train;
import cn.chasing.patten.factory.Vehicle;

public class VehicleFactory extends AbstractFactory {
    @Override
    public Vehicle getCar() {
        return new Car();
    }

    @Override
    public Vehicle getTrain() {
        return new Train();
    }
}
