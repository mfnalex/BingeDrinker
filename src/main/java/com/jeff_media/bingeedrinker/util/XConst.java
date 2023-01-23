package com.jeff_media.bingeedrinker.util;

import java.awt.*;

public class XConst extends GridBagConstraints {

    public XConst() {
        fill = GridBagConstraints.HORIZONTAL;
        //anchor = GridBagConstraints.FIRST_LINE_START;
        gridx = 0;
        gridy = 0;
        weightx = 0;
        weighty = 0;
        gridwidth = 1;
        gridheight = 1;
        insets = new Insets(5, 5, 5, 5);
    }

    /**
     * Resets width, height, weightx and weighty
     */
    private XConst r() {
        weightx = 0;
        weighty = 0;
        gridheight = 1;
        gridwidth = 1;
        return this;
    }

    /**
     * Sets x to 0 and y to the next line
     */
    public XConst cr() {
        r();
        gridy++;
        gridx = 0;
        return this;
    }

    public XConst w(double weightWidth, double weightHeight) {
        weightx = weightWidth;
        weighty = weightHeight;
        return this;
    }

    public XConst s(int spanWidth, int spanHeight) {
        gridwidth = spanWidth;
        gridheight = spanHeight;
        return this;
    }

    public XConst n() {
        r();
        gridx++;
        return this;
    }

}
