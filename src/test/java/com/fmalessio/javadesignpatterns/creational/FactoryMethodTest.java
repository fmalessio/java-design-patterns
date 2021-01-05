package com.fmalessio.javadesignpatterns.creational;

import com.fmalessio.javadesignpatterns.creational.factorymethod.Dialog;
import com.fmalessio.javadesignpatterns.creational.factorymethod.impl.HtmlDialog;
import com.fmalessio.javadesignpatterns.creational.factorymethod.impl.WindowsDialog;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FactoryMethodTest {
    @Test
    void htmlButtonTest() {
        Dialog dialog = new HtmlDialog();
        dialog.renderButton();
        assert (dialog.getButton().onClick()).equals("HTML Click! Button says - 'Hello World!'");
    }

    @Test
    void windowsButtonTest() {
        Dialog dialog = new WindowsDialog();
        dialog.renderButton();
        assert (dialog.getButton().onClick()).equals("Windows Click! Button says - 'Hello World!'");
    }

    @Test
    void configByOsTest() {
        Dialog dialog;
        String clickSpected;
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
            clickSpected = "Windows Click! Button says - 'Hello World!'";
        } else {
            dialog = new HtmlDialog();
            clickSpected = "HTML Click! Button says - 'Hello World!'";
        }
        dialog.renderButton();
        assert (dialog.getButton().onClick()).equals(clickSpected);
    }
}
