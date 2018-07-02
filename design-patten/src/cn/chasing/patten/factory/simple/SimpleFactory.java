package cn.chasing.patten.factory.simple;

import cn.chasing.patten.factory.Car;
import cn.chasing.patten.factory.Train;
import cn.chasing.patten.factory.Vehicle;

public class SimpleFactory {

    public Vehicle getVehicle(String vehicleName) {
        if ("car".equals(vehicleName)) {
            return new Car();
        } else if ("train".equals(vehicleName)) {
            return new Train();
        } else {
            return null;
        }
    }
}
