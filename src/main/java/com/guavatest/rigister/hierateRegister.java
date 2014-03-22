package com.guavatest.rigister;

import com.google.common.eventbus.EventBus;
import com.guavatest.listener.IntegerLitener;
import com.guavatest.listener.NumberListener;

/**
 * User: wangchen
 * Date: 14-3-22
 * Time: 13:13
 * 主要用来测试listener A监听EventA，而eventA 有一个子类eventB，那么listenerA同时也会
 * 监听到eventB的消息
 */
public class hierateRegister {

    public static void main(String[] args) {

        EventBus bus = new EventBus("wangchen");

        NumberListener numberListener = new NumberListener();
        IntegerLitener integerLitener = new IntegerLitener();


        bus.register(numberListener);
        bus.register(integerLitener);

        bus.post(new Integer(23));


        System.out.println(numberListener.getNumber());
        System.out.println(integerLitener.getNumber());

        bus.post(new Long(99));

        System.out.println(numberListener.getNumber());
        System.out.println(integerLitener.getNumber());
    }
}
