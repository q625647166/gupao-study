package cn.chasing.patten.factory.func;

public class FactoryTest  {

    public static void main(String[] args) {

        //多态形式
        Factory factory = new CarFactory();

        System.out.println(factory.getVehicle().getName());
    }
}

