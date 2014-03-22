package com.guavatest.rigister;

import com.google.common.eventbus.EventBus;
import com.guavatest.event.BaseEvent;
import com.guavatest.listener.DeadListener;

/**
 * User: wangchen
 * Date: 14-3-22
 * Time: 13:06
 */
public class DeadRegister {

    public static void main(String[] args) {
        EventBus bus = new EventBus("test");

        DeadListener deadListener = new DeadListener();

        bus.register(deadListener);

        bus.post(new BaseEvent(2323));


    }
}
