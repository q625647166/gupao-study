package cn.chasing.patten.factory.func;

import cn.chasing.patten.factory.Train;
import cn.chasing.patten.factory.Vehicle;

public class TrainFactory implements Factory {

    @Override
    public Vehicle getVehicle() {
        return new Train();
    }
}
