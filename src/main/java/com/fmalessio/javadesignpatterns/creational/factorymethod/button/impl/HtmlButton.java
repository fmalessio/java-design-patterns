package com.fmalessio.javadesignpatterns.creational.factorymethod.button.impl;

import com.fmalessio.javadesignpatterns.creational.factorymethod.button.Button;

public class HtmlButton implements Button {
    @Override
    public String onClick() {
        return "HTML Click! Button says - 'Hello World!'";
    }
}
