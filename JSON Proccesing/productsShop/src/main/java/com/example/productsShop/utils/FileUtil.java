package com.example.productsShop.utils;

import java.io.IOException;

public interface FileUtil {
    String readFileContent(String filePath) throws IOException;

    void write (String content, String filePath) throws IOException;
}
