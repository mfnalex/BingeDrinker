package com.jeff_media.bingeedrinker.bootstrap;

import com.formdev.flatlaf.FlatDarculaLaf;
import com.jeff_media.bingeedrinker.gui.panel.App;

import javax.swing.*;

public class Bootstrap {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }
        new App();
    }
}
