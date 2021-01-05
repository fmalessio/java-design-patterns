package com.fmalessio.javadesignpatterns.creational.factorymethod.impl;

import com.fmalessio.javadesignpatterns.creational.factorymethod.Dialog;
import com.fmalessio.javadesignpatterns.creational.factorymethod.button.Button;
import com.fmalessio.javadesignpatterns.creational.factorymethod.button.impl.WindowsButton;

/**
 * Windows Dialog will produce Windows buttons.
 */
public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
