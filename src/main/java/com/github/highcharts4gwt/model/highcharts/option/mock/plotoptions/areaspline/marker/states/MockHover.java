
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.areaspline.marker.states;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.marker.states.Hover;

public class MockHover
    implements Hover
{

    private boolean enabled;
    private String fillColor;
    private String lineColor;
    private double lineWidth;
    private double lineWidthPlus;
    private double radius;
    private double radiusPlus;
    private String genericField;

    public boolean enabled() {
        return enabled;
    }

    public MockHover enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String fillColor() {
        return fillColor;
    }

    public MockHover fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockHover lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockHover lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public double lineWidthPlus() {
        return lineWidthPlus;
    }

    public MockHover lineWidthPlus(double lineWidthPlus) {
        this.lineWidthPlus = lineWidthPlus;
        return this;
    }

    public double radius() {
        return radius;
    }

    public MockHover radius(double radius) {
        this.radius = radius;
        return this;
    }

    public double radiusPlus() {
        return radiusPlus;
    }

    public MockHover radiusPlus(double radiusPlus) {
        this.radiusPlus = radiusPlus;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockHover setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
