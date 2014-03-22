package com.guavatest.listener;

import com.google.common.eventbus.Subscribe;

/**
 * User: wangchen
 * Date: 14-3-22
 * Time: 13:18
 */
public class IntegerLitener {
    private int number;

    @Subscribe
    public void listen(Integer integer) {
        number = integer;
    }

    public int getNumber() {
        return number;
    }
}
