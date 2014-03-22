package com.guavatest.listener;

import com.google.common.eventbus.Subscribe;
import com.guavatest.event.BaseEvent;

/**
 * User: wangchen
 * Date: 14-3-22
 * Time: 11:21
 */
public class BaseEventListener {
    private int lastMessage = 0;

    @Subscribe
    public void listenMessage(BaseEvent event) {
        lastMessage = event.getMessage();
    }

    //multi method to listener
    @Subscribe
    public void listenSecond(BaseEvent event) {
        System.out.println(event.getMessage());
    }

    public int getLastMessage() {
        return lastMessage;
    }
}
