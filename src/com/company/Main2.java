package com.company;

import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
//It's second variant of settling this program.
// It take more time and memory, but give opportunity to adjust way of sorting elements in list
class myColor extends Color implements Comparable<myColor>{
    myColor(int red,int green,int blue){
        super(red,green,blue);
    }

    @Override
    public int compareTo(myColor o) {
        Integer red1 = this.getRed();
        Integer red2 = o.getRed();
        int result = red1.compareTo(red2);
        if(result == 0){
            Integer blue1 = this.getBlue();
            Integer blue2 = o.getBlue();
            result = blue2.compareTo(blue1);
        }
        return result;
    }
}

public class Main2 {

    public static void main(String[] args) {
        //creating list of rgb
        final List<myColor> colors = new ArrayList<>();
        for (int i = 0; i <= 255; i +=  51) {
            for (int j = 0; j <= 255; j += 51) {
                for (int z = 0; z <= 255; z +=51) {
                    colors.add(new myColor(i, j, z));
                }
            }
        }
        //sorting of colors collection
        Collections.sort(colors);

        //printing 9 first rgb colors
        for(int i = 0; i < 9; i++){
            myColor color = colors.get(i);
            System.out.println("RGB: " + color.getRed() +
                    " " + color.getGreen() + " " +color.getBlue());
        }
    }
}
