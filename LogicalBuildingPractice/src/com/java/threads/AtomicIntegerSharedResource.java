package com.java.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerSharedResource {
    AtomicInteger count = new AtomicInteger();

    public void increaseCount() {
        count.incrementAndGet();
    }

    public Integer getCount() {
        return count.get();
    }
}
