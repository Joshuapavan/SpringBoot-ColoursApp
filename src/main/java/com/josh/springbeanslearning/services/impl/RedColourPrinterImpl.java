package com.josh.springbeanslearning.services.impl;

import com.josh.springbeanslearning.services.RedColourPrinter;

public class RedColourPrinterImpl implements RedColourPrinter {
    @Override
    public String print() {
        return "Red";
    }
}
