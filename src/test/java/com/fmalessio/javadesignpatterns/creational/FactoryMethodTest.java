package com.fmalessio.javadesignpatterns.creational;

import com.fmalessio.javadesignpatterns.creational.factorymethod.Dialog;
import com.fmalessio.javadesignpatterns.creational.factorymethod.impl.HtmlDialog;
import com.fmalessio.javadesignpatterns.creational.factorymethod.impl.WindowsDialog;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class FactoryMethodTest {

    private static final String SPECTED_HTML_MSJ = "HTML Click! Button says - 'Hello World!'";
    private static final String SPECTED_WIN_MSJ = "Windows Click! Button says - 'Hello World!'";

    @Test
    void htmlButtonTest() {
        Dialog dialog = new HtmlDialog();
        dialog.renderButton();
        assert (dialog.getButton().onClick()).equals(SPECTED_HTML_MSJ);
    }

    @Test
    void windowsButtonTest() {
        Dialog dialog = new WindowsDialog();
        dialog.renderButton();
        assert (dialog.getButton().onClick()).equals(SPECTED_WIN_MSJ);
    }

    @Test
    void configByOsTest() {
        Dialog dialog;
        String clickSpected;
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
            clickSpected = SPECTED_WIN_MSJ;
        } else {
            dialog = new HtmlDialog();
            clickSpected = SPECTED_HTML_MSJ;
        }
        dialog.renderButton();
        assert (dialog.getButton().onClick()).equals(clickSpected);
    }
}
