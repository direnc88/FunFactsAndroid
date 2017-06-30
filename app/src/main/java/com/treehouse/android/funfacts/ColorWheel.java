package com.treehouse.android.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by charlesdirenzo on 6/27/17.
 */

public class ColorWheel
{
    //Fields (member variables) - properties about the object.
    //declaring a string array here called mColors
    private String[] mColors =
            {
                    "#39add1", // light blue
                    "#3079ab", // dark blue
                    "#c25975", // mauve
                    "#e15258", // red
                    "#f9845b", // orange
                    "#838cc7", // lavender
                    "#7d669e", // purple
                    "#53bbb4", // aqua
                    "#51b46d", // green
                    "#e0ab18", // mustard
                    "#637a91", // dark gray
                    "#f092b0", // pink
                    "#b7c0c7"  // light gray
            };

    //Methods - Actions the object can take.
    public int getColor()
    {
        String color;
        //randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mColors.length);
        color = mColors[randomNumber];  //force a conversion here to make the int into a string
        int colorAsInt = Color.parseColor(color);

        return colorAsInt;
    }

}

