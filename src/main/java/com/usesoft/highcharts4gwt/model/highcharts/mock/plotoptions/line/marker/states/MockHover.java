
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.line.marker.states;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.line.marker.states.Hover;

public class MockHover
    implements Hover
{

    private boolean enabled;
    private String fillColor;
    private String lineColor;
    private Number lineWidth;
    private Number lineWidthPlus;
    private Number radius;
    private Number radiusPlus;

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

    public Number lineWidth() {
        return lineWidth;
    }

    public MockHover lineWidth(Number lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public Number lineWidthPlus() {
        return lineWidthPlus;
    }

    public MockHover lineWidthPlus(Number lineWidthPlus) {
        this.lineWidthPlus = lineWidthPlus;
        return this;
    }

    public Number radius() {
        return radius;
    }

    public MockHover radius(Number radius) {
        this.radius = radius;
        return this;
    }

    public Number radiusPlus() {
        return radiusPlus;
    }

    public MockHover radiusPlus(Number radiusPlus) {
        this.radiusPlus = radiusPlus;
        return this;
    }

}
