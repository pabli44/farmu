package com.pvelilla.farmuoperations.farmuoperations.utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Base64;

public class Utils {

    public static String getShortUrl(String originalURL) {
        String encodedURL = Base64.getUrlEncoder().encodeToString(originalURL.getBytes());
        String shortURL = encodedURL.substring(0, 8);
        return shortURL;
    }

    public static void resizeImage(String inputImagePath, int newWidth, int newHeight){
        //String inputImagePath = "/home/pvelilla/Pictures/assasins.jpg"; // Ruta de la imagen de entrada
        inputImagePath = "src/main/resources/images-process/assasins.jpg"; // Ruta de la imagen de entrada
        String outputImagePath = "src/main/resources/images-process/assasins2.jpg"; // Ruta de la imagen de salida
        //String outputImagePath = "/home/pvelilla/Pictures/assasins2.jpg"; // Ruta de la imagen de salida

        try {
            BufferedImage inputImage = ImageIO.read(new File(inputImagePath));
            BufferedImage outputImage = new BufferedImage(newWidth, newHeight, inputImage.getType());

            Graphics2D g2d = outputImage.createGraphics();
            g2d.drawImage(inputImage, 0, 0, newWidth, newHeight, null);
            g2d.dispose();

            ImageIO.write(outputImage, "jpg", new File(outputImagePath));
        } catch (IOException e) {
            System.out.println("Error en el proceso de redimensión: " + e.getMessage());
        }
    }


}
