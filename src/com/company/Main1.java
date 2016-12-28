package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
//It's main variant of settling this problem. It takes less time and memory then second variant.
public class Main1 {
    public static void main(String[] args) {
        //creating list of rgb
        final List<Color> colors = new ArrayList<>();
        for (int i = 0; i <= 255; i += 51) {
            for (int j = 255; j >= 0; j -= 51) {
                for (int z = 0; z <= 255; z += 51) {
                    colors.add(new Color(i, z, j));
                }
            }
        }
        //printing 9 first rgb colors
        for (int i = 0; i<9;i++){
            Color color = colors.get(i);
            System.out.println("RGB: " + color.getRed() +
                    " " + color.getGreen() + " " + color.getBlue());
        }
    }
}
