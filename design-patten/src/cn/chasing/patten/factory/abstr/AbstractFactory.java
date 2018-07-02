package cn.chasing.patten.factory.abstr;

import cn.chasing.patten.factory.Vehicle;

/**
 * 抽奖工厂模式
 */
public abstract class AbstractFactory {

    //方便统一管理
    /**
     * 获取火车
     * @return
     */
    public abstract Vehicle getCar();

    /**
     * 获取汽车
     * @return
     */
    public abstract Vehicle getTrain();
}
