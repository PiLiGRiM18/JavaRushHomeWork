package com.javarush.test.level16.lesson13.bonus01;

import com.javarush.test.level16.lesson13.bonus01.common.*;

/**
 * Created by piligrim on 21.12.2015.
 */
public class ImageReaderFactory {
    public static ImageReader getReader(ImageTypes imageType) throws IllegalArgumentException {

        if (imageType == ImageTypes.JPG){
            return new JpgReader();
        }
        if (imageType == ImageTypes.BMP){
            return new BmpReader();
        }
        if (imageType == ImageTypes.PNG){
            return new PngReader();
        }
        else throw new IllegalArgumentException("Неизвестный тип картинки");
    }
}
