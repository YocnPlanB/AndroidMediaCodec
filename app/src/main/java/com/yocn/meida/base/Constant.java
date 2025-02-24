package com.yocn.meida.base;

import com.yocn.meida.util.FileUtils;
import com.yocn.meida.util.StorageUtil;

/**
 * @Author yocn
 * @Date 2019-11-07 17:23
 * @ClassName Constant
 */
public class Constant {

    private static String PATH_YUV = "/yuv";

    public static String getRootPath() {
        return BaseApplication.getAppContext().getExternalFilesDir(null).getAbsolutePath();
    }

    public static String getCacheYuvDir() {
        String path = getRootPath() + PATH_YUV;
        FileUtils.checkDir(path);
        return path;
    }

    public static String getTestYuvFilePath() {
        String path = getRootPath() + PATH_YUV;
        FileUtils.checkDir(path);
        String yuvFile = path + "/test.yuv";
        return yuvFile;
    }
}
