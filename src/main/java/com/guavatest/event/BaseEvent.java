package com.guavatest.event;

/**
 * User: wangchen
 * Date: 14-3-22
 * Time: 11:25
 * 基本的发送消息的对象，用来测试
 */
public class BaseEvent {
    private final int message;

    public BaseEvent(int message) {
        this.message = message;
    }

    public int getMessage() {
        return message;
    }
}
