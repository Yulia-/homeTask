package com.sourceit.homework.hw01.HomeWork08;

import com.sourceit.hometask.io.CopyFileStrategy;
import com.sourceit.hometask.io.FileAlreadyPresentsException;
import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.*;
import java.nio.channels.FileChannel;


/**
 * Created by Юля on 16.03.2015.
 */
public class ChannelsCopyFileStrategy implements CopyFileStrategy {
    @Override
    public void copyFile(String s1, String s2) throws FileAlreadyPresentsException, FileCopyFailedException {
        FileChannel inChannel = null;
        FileChannel outChannel = null;
        File f = new File(s1);
        if (f.exists()) {
            throw new FileAlreadyPresentsException("File is already present");
        }
        try {
            inChannel = new FileInputStream(s1).getChannel();
        } catch (FileNotFoundException e) {
            try {
                inChannel = new FileInputStream(s1).getChannel();
                outChannel = new FileOutputStream(s2).getChannel();
                outChannel.transferFrom(inChannel, 0, inChannel.size());
                inChannel.close();
                outChannel.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

        @Override
        public void copyFile (File file1, File file2)throws FileAlreadyPresentsException, FileCopyFailedException {
            copyFile(file1.getAbsolutePath(), file2.getAbsolutePath());
        }

}
