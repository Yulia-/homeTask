package com.sourceit.homework.hw01.HomeWork08;

import com.sourceit.hometask.io.FileCopyFailedException;

import java.io.File;

/**
 * Created by Юля on 17.03.2015.
 */
public class Test {
    public static void main (String [] args){

        String inFile = "C:/workSpace/ForCopy/777777.jpg";
        String outFileSimple = "C:workSpace/simpleStringCopy.jpg";
        String outChannels = "C:workSpace/ForCopy/channelStringCopy.jpg";
        String outBuffered = "C:workSpace/ForCopy/bufferedStringCopy.jpg";
        String outFile = "C:workSpace/ForCopy/fileStringCopy.jpg";

        File source = new File("C:/workSpace/ForCopy/777777.jpg");
        File simpleCopy = new File("C:/workSpace/ForCopy/simpleCopy.jpg");
        File bufferedCopy = new File("C:/workSpace/ForCopy/bufferedCopy.jpg");
        File channelsCopy = new File("C:/workSpace/ForCopy/channelsCopy.jpg");
        File fileCopy = new File("C:/workSpace/ForCopy/fileCopy.jpg");

        CopyFileFactoryImpl copy = new CopyFileFactoryImpl();
        try {
            copy.createSimpleCopyFileStrategy().copyFile(inFile, outFileSimple);
            copy.createBufferedCopyFileStrategy().copyFile(inFile, outBuffered);
            copy.createChannelsCopyFileStrategy().copyFile(inFile, outChannels);
            copy.createFilesCopyFileStrategy().copyFile(inFile,outFile);

            copy.createSimpleCopyFileStrategy().copyFile(source,simpleCopy);
            copy.createBufferedCopyFileStrategy().copyFile(source, bufferedCopy);
            copy.createChannelsCopyFileStrategy().copyFile(source, channelsCopy);
            copy.createFilesCopyFileStrategy().copyFile(source, fileCopy);
        } catch (FileCopyFailedException e){
            System.out.println("FileCopyFailedException");
        }

    }
}
