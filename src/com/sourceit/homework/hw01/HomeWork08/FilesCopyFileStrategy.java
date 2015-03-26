package com.sourceit.homework.hw01.HomeWork08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Юля on 16.03.2015.
 */
public class FilesCopyFileStrategy implements CopyFileStrategy {
    @Override
    public void copyFile(String s1, String s2) throws FileAlreadyPresentsException, FileCopyFailedException {

        Path source = Paths.get(s1);
        Path destination = Paths.get(s2);
        try{
            Files.copy(source, destination);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    @Override
    public void copyFile(File file1, File file2) throws FileAlreadyPresentsException, FileCopyFailedException {
        Path source = Paths.get(file1.getAbsolutePath());
        Path destination = Paths.get(file2.getAbsolutePath());
        try{
            Files.copy(source, destination);
        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
