package cn.chasing.patten.factory.abstr;


public class AbstractFactoryTest {

    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        //用户只有选择权
        //方便程序扩展
        System.out.println(vehicleFactory.getCar());
        System.out.println(vehicleFactory.getTrain());
    }
}

