package com.fmalessio.javadesignpatterns.creational.factorymethod.impl;

import com.fmalessio.javadesignpatterns.creational.factorymethod.Dialog;
import com.fmalessio.javadesignpatterns.creational.factorymethod.button.Button;
import com.fmalessio.javadesignpatterns.creational.factorymethod.button.impl.HtmlButton;

/**
 * HTML Dialog will produce HTML buttons.
 */
public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}