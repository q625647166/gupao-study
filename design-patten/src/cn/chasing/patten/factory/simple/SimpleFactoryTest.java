package cn.chasing.patten.factory.simple;

/**
 * 简单工厂模式
 */
public class SimpleFactoryTest {

    public static void main(String[] args) {
        //隐藏创建过程  不需要用户自主创建对象
        SimpleFactory simpleFactory = new SimpleFactory();
        System.out.println(simpleFactory.getVehicle("car"));
    }
}
