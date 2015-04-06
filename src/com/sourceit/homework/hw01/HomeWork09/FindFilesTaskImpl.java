package com.sourceit.homework.hw01.HomeWork09;

import com.sourceit.hometask.threads.FindFilesTask;
import com.sourceit.hometask.threads.TaskExecutionFailedException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * Created by Юля on 30.03.2015.
 */
public class FindFilesTaskImpl implements FindFilesTask {

    private String directory;
    private String searchString;
    private PrintStream outPrintStream;
    private int tryCount;

    public FindFilesTaskImpl(String directory, String searchString, PrintStream printStream, int tryCount) {
        this.directory = directory;
        this.searchString = searchString;
        this.outPrintStream = printStream;
        this.tryCount = tryCount;
    }

    @Override
    public void setDirectory(String s) throws NullPointerException, FileNotFoundException {
        if (s == null){
            throw new NullPointerException ("The directory is null");
        }
        if (!(new File(s).exists())){
            throw new FileNotFoundException("The directory doesn't exist");
        }
        directory = s;

    }

    @Override
    public void setFileNameSearchString(String s) throws IllegalArgumentException {
        if (s == null){
            throw new IllegalArgumentException("Searching string is null");
        }
        searchString = s;

    }

    @Override
    public void setPrintStream(PrintStream printStream) {
        outPrintStream = printStream;

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
        File searched = new File(directory);
        if (searched.exists()){
            System.out.println(searched.getName() + searched.getAbsolutePath());
        } else {
            throw new TaskExecutionFailedException("Execution is failed");
        }

    }
}
