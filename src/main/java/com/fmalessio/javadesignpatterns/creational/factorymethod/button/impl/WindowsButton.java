package com.fmalessio.javadesignpatterns.creational.factorymethod.button.impl;

import com.fmalessio.javadesignpatterns.creational.factorymethod.button.Button;

public class WindowsButton implements Button {
    @Override
    public String onClick() {
        return "Windows Click! Button says - 'Hello World!'";
    }
}
