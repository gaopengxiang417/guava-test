package com.guavatest.listener;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.Subscribe;

/**
 * User: wangchen
 * Date: 14-3-22
 * Time: 13:01
 */
public class DeadListener {

    @Subscribe
    public void listenerDead(DeadEvent event) {
        System.out.println("coming dead event");
        System.out.println(event.getEvent());
        System.out.println(event.getSource());
    }
}
