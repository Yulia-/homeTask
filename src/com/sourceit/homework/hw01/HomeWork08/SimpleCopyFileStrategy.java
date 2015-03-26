package com.sourceit.homework.hw01.HomeWork08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by Юля on 16.03.2015.
 */
public class SimpleCopyFileStrategy implements CopyFileStrategy {

    @Override
    public void copyFile(String s1, String s2) throws FileAlreadyPresentsException, FileCopyFailedException {
        File f = new File(s1);
        if (f.exists()) {
            throw new FileAlreadyPresentsException("File is already present");
        }
            try (FileInputStream in = new FileInputStream(s1); FileOutputStream out = new FileOutputStream(s2)) {

                int read;
                for (; (read = in.read()) != -1; ) {
                    out.write(read);
                }

            } catch (IOException e) {
                e.printStackTrace();
                throw new FileCopyFailedException ("FileCopyFailedException");

            }



    }

    @Override
    public void copyFile(File file1, File file2) throws FileAlreadyPresentsException, FileCopyFailedException {
        copyFile(file1.getAbsolutePath(), file2.getAbsolutePath());


    }
}
