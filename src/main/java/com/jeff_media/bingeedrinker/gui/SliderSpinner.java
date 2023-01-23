package com.jeff_media.bingeedrinker.gui;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderSpinner {

    private final JSpinner spinner = new JSpinner();
    private final JSlider slider = new JSlider();

    public SliderSpinner(int min, int max, int defaultValue, int stepSize) {
        this(min, max, defaultValue);
        spinner.setModel(new SpinnerNumberModel(defaultValue, min, max, stepSize));
    }

    private SliderSpinner(int min, int max, int defaultValue) {
        SpinnerSliderListener.connect(spinner, slider);
        slider.setMinimum(min);
        slider.setMaximum(max);
        slider.setValue(defaultValue);
        spinner.setValue(defaultValue);
    }

    public JSpinner getSpinner() {
        return spinner;
    }

    public JSlider getSlider() {
        return slider;
    }


    public static class SpinnerSliderListener implements ChangeListener {

        private final JSpinner spinner;
        private final JSlider slider;

        private SpinnerSliderListener(JSpinner spinner, JSlider slider) {
            this.spinner = spinner;
            this.slider = slider;
        }

        @Override
        public void stateChanged(ChangeEvent e) {
            if(e.getSource() == spinner) {
                slider.setValue((int) spinner.getValue());
            } else if(e.getSource() == slider) {
                spinner.setValue(slider.getValue());
            }
        }

        public static void connect(JSpinner spinner, JSlider slider) {
            SpinnerSliderListener listener = new SpinnerSliderListener(spinner, slider);
            spinner.addChangeListener(listener);
            slider.addChangeListener(listener);
        }
    }
}
