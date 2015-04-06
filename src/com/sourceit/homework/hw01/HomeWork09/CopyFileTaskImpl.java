package com.sourceit.homework.hw01.HomeWork09;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileCopyFailedException;
import com.sourceit.hometask.threads.CopyFileTask;
import com.sourceit.hometask.threads.TaskExecutionFailedException;

/**
 * Created by Юля on 30.03.2015.
 */
public class CopyFileTaskImpl implements CopyFileTask {

    private CopyFileStrategy copyStrategy;
    private String sourceFilePath;
    private String destinyFilePath;
    private int tryCount;


    CopyFileTaskImpl(CopyFileStrategy copyStrategy, String sourceFilePath, String destinyFilePath, int tryCount) {
        this.copyStrategy = copyStrategy;
        this.sourceFilePath = sourceFilePath;
        this.destinyFilePath = destinyFilePath;
        this.tryCount = tryCount;
    }

    @Override
    public void setFileCopyUtils(CopyFileStrategy copyFileStrategy) {
        copyStrategy = copyFileStrategy;
    }

    @Override
    public void setSourceFilePath(String s) {
        sourceFilePath = s;

    }

    @Override
    public void setDestinyFilePath(String s) {
        destinyFilePath = s;

    }

    @Override
    public int getTryCount() {

        return tryCount;
    }

    @Override
    public void incTryCount() {
        tryCount++;

    }

    @Override
    public void execute() throws TaskExecutionFailedException {
        incTryCount();
        try {
            copyStrategy.copyFile(sourceFilePath, destinyFilePath);
            System.out.println("Coping files");
        } catch (FileCopyFailedException e){
            throw new TaskExecutionFailedException("Task Execution Failed");
        }

    }
}
