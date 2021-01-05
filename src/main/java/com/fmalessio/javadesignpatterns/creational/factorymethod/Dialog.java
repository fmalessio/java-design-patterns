package com.fmalessio.javadesignpatterns.creational.factorymethod;

import com.fmalessio.javadesignpatterns.creational.factorymethod.button.Button;

public abstract class Dialog {

    private Button button;

    public void renderButton() {
        System.out.println("Rendering specific button");
        this.button = createButton();
    }

    /**
     * Subclasses will override this method in order to create specific button
     * objects.
     */
    public abstract Button createButton();

    public Button getButton() {
        return button;
    }
}
