package com.josh.springbeanslearning.services.impl;

import com.josh.springbeanslearning.services.BlueColourPrinter;
import com.josh.springbeanslearning.services.ColourPrinter;
import com.josh.springbeanslearning.services.GreenColourPrinter;
import com.josh.springbeanslearning.services.RedColourPrinter;

public class ColourPrinterImpl implements ColourPrinter {

    private final RedColourPrinter redColourPrinter;
    private final BlueColourPrinter blueColourPrinter;
    private final GreenColourPrinter greenColourPrinter;

    // Constructor injection
    public ColourPrinterImpl(RedColourPrinter redColourPrinter,
                             BlueColourPrinter blueColorPrinter,
                             GreenColourPrinter greenColorPrinter){
        this.redColourPrinter = redColourPrinter;
        this.blueColourPrinter = blueColorPrinter;
        this.greenColourPrinter = greenColorPrinter;
    }


    @Override
    public String printColors() {
        return String.join(", ",redColourPrinter.print(),blueColourPrinter.print(),greenColourPrinter.print());
    }
}
