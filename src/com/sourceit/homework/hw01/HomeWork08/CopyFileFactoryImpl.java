package com.sourceit.homework.hw01.HomeWork08;

import com.sourceit.hometask.io.CopyFileFactory;
import com.sourceit.hometask.io.CopyFileStrategy;

/**
 * Created by Юля on 26.03.2015.
 */
public class CopyFileFactoryImpl implements CopyFileFactory {
    @Override
    public CopyFileStrategy createSimpleCopyFileStrategy() {
        CopyFileStrategy copy = new SimpleCopyFileStrategy();
        return copy;
    }

    @Override
    public CopyFileStrategy createBufferedCopyFileStrategy() {
        CopyFileStrategy copy = new BufferedCopyFileStrategy();
        return copy;
    }

    @Override
    public CopyFileStrategy createChannelsCopyFileStrategy() {
        CopyFileStrategy copy = new ChannelsCopyFileStrategy();
        return copy;
    }

    @Override
    public CopyFileStrategy createFilesCopyFileStrategy() {
        CopyFileStrategy copy = new FilesCopyFileStrategy();
        return copy;
    }
}
