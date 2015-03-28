package com.sourceit.homework.hw01.ClassWorkTreads;

/**
 * Created by Юля on 27.03.2015.
 */
public class Producer implements Runnable {
    Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int i = 0;
        while (true){
            storage.put(i++);
        }
    }
}
