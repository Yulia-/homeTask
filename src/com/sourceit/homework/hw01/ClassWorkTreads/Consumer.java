package com.sourceit.homework.hw01.ClassWorkTreads;

/**
 * Created by Юля on 27.03.2015.
 */
public class Consumer implements Runnable {
    Storage storage;

    public Consumer (Storage storage) {
        this.storage = storage;
        new Thread(this, "Consumer").start();
    }
        @Override
        public void run () {
            while (true) {
                storage.get();
            }
        }
}
