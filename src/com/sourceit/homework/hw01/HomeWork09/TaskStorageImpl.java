package com.sourceit.homework.hw01.HomeWork09;

import com.sourceit.hometask.threads.Task;
import com.sourceit.hometask.threads.TasksStorage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Юля on 30.03.2015.
 */
public class TaskStorageImpl implements TasksStorage {

    List taskList = Collections.synchronizedList(new ArrayList());

    @Override
    synchronized public void add(Task task) throws NullPointerException {
        synchronized (taskList) {
            Iterator i = taskList.iterator();
            while (i.hasNext())
                taskList.add(i.next());
        }
        taskList.add(task);

    }

    @Override
    synchronized public Task get() {

            Task firstTask = (Task) taskList.get(0);
            taskList.remove(firstTask);

        return firstTask;
    }

        @Override
        synchronized public int count () {

            return taskList.size();
        }
    }

