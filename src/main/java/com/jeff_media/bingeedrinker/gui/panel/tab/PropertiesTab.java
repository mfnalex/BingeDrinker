package com.jeff_media.bingeedrinker.gui.panel.tab;

import com.jeff_media.bingeedrinker.gui.SliderSpinner;
import com.jeff_media.bingeedrinker.gui.panel.SexPanel;
import com.jeff_media.bingeedrinker.util.XConst;

import javax.swing.*;
import java.awt.*;
import java.util.stream.IntStream;

public class PropertiesTab extends JPanel {

    private static final int MIN_AGE = 18, MAX_AGE = 99, MIN_WEIGHT = 30, MAX_WEIGHT = 200, MIN_HEIGHT = 100, MAX_HEIGHT = 250;

    private final SexPanel sexPanel = new SexPanel();

    private final SpinnerListModel ageModel = new SpinnerListModel(IntStream.range(MIN_AGE, MAX_AGE + 1).boxed().toList());
    private final JSlider ageSlider = new JSlider(MIN_AGE, MAX_AGE, MIN_AGE);
    private final JSpinner ageSpinner = new JSpinner(ageModel);

    private final SpinnerListModel weightModel = new SpinnerListModel(IntStream.range(MIN_WEIGHT, MAX_WEIGHT).boxed().toList());
    private final JSlider weightSlider = new JSlider(MIN_WEIGHT, MAX_WEIGHT, MIN_WEIGHT);
    private final JSpinner weightSpinner = new JSpinner(weightModel);

    private final SpinnerListModel heightModel = new SpinnerListModel(IntStream.range(MIN_HEIGHT, MAX_HEIGHT + 1).boxed().toList());
    private final JSlider heightSlider = new JSlider(MIN_HEIGHT, MAX_HEIGHT, MIN_HEIGHT);
    private final JSpinner heightSpinner = new JSpinner(heightModel);


    public PropertiesTab() {
        setLayout(new GridBagLayout());
        XConst x = new XConst();

        /* Sex */
        add(new JLabel("Sex"), x);
        JPanel sexPanelContainer = new JPanel(new BorderLayout());
        sexPanelContainer.add(sexPanel, BorderLayout.WEST);
        add(sexPanelContainer, x.n().s(3,1).w(1,0));

        /* Age */
        add(new JLabel("Age"), x.cr());
        add(ageSlider, x.n().w(1,0));
        add(ageSpinner, x.n());
        add(new JLabel("Years"), x.n());
        SliderSpinner.SpinnerSliderListener.connect(ageSpinner, ageSlider);

        /* Weight */
        add(new JLabel("Weight"), x.cr());
        add(weightSlider, x.n().w(1,0));
        add(weightSpinner, x.n());
        add(new JLabel("kg"), x.n());
        SliderSpinner.SpinnerSliderListener.connect(weightSpinner, weightSlider);


        /* Height */
        add(new JLabel("Height"), x.cr());
        add(heightSlider, x.n().w(1,0));
        add(heightSpinner, x.n());
        add(new JLabel("cm"), x.n());
        SliderSpinner.SpinnerSliderListener.connect(heightSpinner, heightSlider);

        /* Separator */
        add(new JSeparator(), x.cr().s(4,1));

        /* Drinking habits */
        SliderSpinner sliderSpinner = new SliderSpinner(0, 10, 0, 0.5);
        add(new JLabel("Drinks per week"), x.cr());
        add(sliderSpinner.getSlider(), x.n().w(1,0));
        add(sliderSpinner.getSpinner(), x.n());
//        add(new JLabel("Test"), x.cr());
//        add(new JSlider(), x.n().w(1,0));
//        add(new JSpinner(), x.n());
//        add(new JLabel("t/s"), x.n());
        SliderSpinner.SpinnerSliderListener.connect(heightSpinner, heightSlider);

    }

}
