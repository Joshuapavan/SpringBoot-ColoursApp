package com.josh.springbeanslearning.services.impl;

import com.josh.springbeanslearning.services.GreenColourPrinter;

public class GreenColourPrinterImpl implements GreenColourPrinter {
    @Override
    public String print() {
        return "Green";
    }
}
