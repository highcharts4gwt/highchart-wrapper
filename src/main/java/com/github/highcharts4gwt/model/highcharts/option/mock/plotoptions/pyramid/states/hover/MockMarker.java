
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.pyramid.states.hover;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid.states.hover.Marker;

public class MockMarker
    implements Marker
{

    private boolean enabled;
    private String fillColor;
    private double height;
    private String lineColor;
    private double lineWidth;
    private double radius;
    private String symbol;
    private double width;

    public boolean enabled() {
        return enabled;
    }

    public MockMarker enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String fillColor() {
        return fillColor;
    }

    public MockMarker fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public double height() {
        return height;
    }

    public MockMarker height(double height) {
        this.height = height;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockMarker lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockMarker lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public double radius() {
        return radius;
    }

    public MockMarker radius(double radius) {
        this.radius = radius;
        return this;
    }

    public String symbol() {
        return symbol;
    }

    public MockMarker symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public double width() {
        return width;
    }

    public MockMarker width(double width) {
        this.width = width;
        return this;
    }

}
