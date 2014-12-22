
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions.spline.marker.states;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.spline.marker.states.Select;

public class MockSelect
    implements Select
{

    private boolean enabled;
    private String fillColor;
    private String lineColor;
    private double lineWidth;
    private double radius;

    public boolean enabled() {
        return enabled;
    }

    public MockSelect enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String fillColor() {
        return fillColor;
    }

    public MockSelect fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockSelect lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockSelect lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public double radius() {
        return radius;
    }

    public MockSelect radius(double radius) {
        this.radius = radius;
        return this;
    }

}
