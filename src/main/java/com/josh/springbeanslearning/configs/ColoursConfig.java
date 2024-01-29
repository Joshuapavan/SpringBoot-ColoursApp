package com.josh.springbeanslearning.configs;

import com.josh.springbeanslearning.services.BlueColourPrinter;
import com.josh.springbeanslearning.services.ColourPrinter;
import com.josh.springbeanslearning.services.GreenColourPrinter;
import com.josh.springbeanslearning.services.RedColourPrinter;
import com.josh.springbeanslearning.services.impl.BlueColourPrinterImpl;
import com.josh.springbeanslearning.services.impl.ColourPrinterImpl;
import com.josh.springbeanslearning.services.impl.GreenColourPrinterImpl;
import com.josh.springbeanslearning.services.impl.RedColourPrinterImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ColoursConfig {

    // Declaration and defining Beans
    @Bean
    public RedColourPrinter redColourPrinter(){
        return new RedColourPrinterImpl();
    }

    @Bean
    public BlueColourPrinter blueColorPrinter(){
        return new BlueColourPrinterImpl();
    }

    @Bean
    public GreenColourPrinter greenColorPrinter(){
        return new GreenColourPrinterImpl();
    }

    @Bean
    public ColourPrinter colourPrinter(RedColourPrinter redColourPrinter, BlueColourPrinter blueColourPrinter, GreenColourPrinter greenColourPrinter){
        return new ColourPrinterImpl(redColourPrinter, blueColourPrinter, greenColourPrinter);
    }
}
