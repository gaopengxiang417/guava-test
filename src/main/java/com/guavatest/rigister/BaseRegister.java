package com.guavatest.rigister;

import com.google.common.eventbus.EventBus;
import com.guavatest.event.BaseEvent;
import com.guavatest.listener.BaseEventListener;

/**
 * User: wangchen
 * Date: 14-3-22
 * Time: 11:27
 */
public class BaseRegister {
    public static void main(String[] args) {

        EventBus bus = new EventBus("wangchen");

        BaseEventListener listener = new BaseEventListener();

        bus.register(listener);

        bus.post(new BaseEvent(43));

        System.out.println(listener.getLastMessage());
    }
}
