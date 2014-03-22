package com.guavatest.listener;

import com.google.common.eventbus.Subscribe;

/**
 * User: wangchen
 * Date: 14-3-22
 * Time: 13:11
 */
public class NumberListener {

    private Number number;

    @Subscribe
    public void listen(Number number) {
        this.number = number;
    }

    public Number getNumber() {
        return number;
    }

}


