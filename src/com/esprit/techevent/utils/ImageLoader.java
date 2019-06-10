/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.esprit.techevent.utils;

import com.codename1.ui.EncodedImage;
import com.codename1.ui.URLImage;
import com.codename1.ui.plaf.UIManager;
import com.codename1.ui.util.Resources;

/**
 *
 * @author HP EliteBook
 */
public class ImageLoader {

    private static Resources theme = UIManager.initFirstTheme("/theme");

    public static URLImage loadImageFromServer(String url, String image) {
        EncodedImage img = EncodedImage.createFromImage(theme.getImage("techevent.png"), false);
        URLImage urlimg = URLImage.createToStorage(img, image, url);
        return urlimg;
    }
}
