package com.jeff_media.bingeedrinker.gui.panel;

import com.jeff_media.bingeedrinker.data.Sex;

import javax.swing.*;
import java.util.EnumMap;

public class SexPanel extends JPanel {

    private final EnumMap<Sex, JRadioButton> buttons = new EnumMap<Sex, JRadioButton>(Sex.class);

    public SexPanel() {
        ButtonGroup group = new ButtonGroup();

        for(Sex sex : Sex.values()) {
            JRadioButton button = new JRadioButton(sex.getDisplayName());
            buttons.put(sex, button);
            group.add(button);
            add(button);
        }

        buttons.get(Sex.values()[0]).setSelected(true);
    }

    public Sex getSelectedSex() {
        return buttons.entrySet()
                .stream()
                .filter(entry -> entry.getValue().isSelected())
                .findFirst()
                .orElseThrow()
                .getKey();
    }
}
