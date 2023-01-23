package com.jeff_media.bingeedrinker.gui.panel;

import com.jeff_media.bingeedrinker.gui.panel.tab.PropertiesTab;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class App extends JFrame {

    private static final Border EMPTY_BORDER = BorderFactory.createEmptyBorder(5,5,5,5);

    private final JPanel panel = new JPanel(new BorderLayout());
    private final JTabbedPane tabs = new JTabbedPane();
    private final PropertiesTab propertiesTab = new PropertiesTab();

    public App() {
        super("Binge Drinker");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        setContentPane(panel);
        panel.add(tabs);
        addTab("Properties", propertiesTab);

        pack();
    }

    private void addTab(String title, JPanel panel) {
        JPanel container = new JPanel(new BorderLayout());
        container.add(panel, BorderLayout.NORTH);
        JScrollPane scrollPane = new JScrollPane(container);
        scrollPane.setBorder(EMPTY_BORDER);
        tabs.add(title, scrollPane);
    }
}
