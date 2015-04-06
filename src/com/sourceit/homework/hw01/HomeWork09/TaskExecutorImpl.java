package com.sourceit.homework.hw01.HomeWork09;

import com.sourceit.hometask.threads.Task;
import com.sourceit.hometask.threads.TaskExecutionFailedException;
import com.sourceit.hometask.threads.TaskExecutor;
import com.sourceit.hometask.threads.TasksStorage;

/**
 * Created by Юля on 30.03.2015.
 */
public class TaskExecutorImpl implements TaskExecutor {
    private TasksStorage storage;
    private static boolean startPoint = false;

    public TaskExecutorImpl(TasksStorage storage) {
        this.storage = storage;
    }

    @Override
    public void setStorage(TasksStorage tasksStorage) throws NullPointerException {
        if (tasksStorage == null){
            throw new NullPointerException("Storage is null");
        }
        storage = tasksStorage;


    }

    @Override
    public TasksStorage getStorage() {
        return storage;
    }

    @Override
    public void start() throws NullPointerException, IllegalStateException {
        if (startPoint){
            throw new IllegalStateException();
        }
        startPoint = true;
        if (storage==null){
            throw new NullPointerException ("Storage is empty");
        }
        Task task = storage.get();
        try {
            task.execute();
        } catch (TaskExecutionFailedException e) {
            if(task.getTryCount()<5){
                storage.add(task);
            }
        }
        stop();


    }

    @Override
    public void stop() throws IllegalStateException {
        if (startPoint == true){
            throw new IllegalStateException("Executing hasn't started");
        }
        startPoint = false;

    }
}
