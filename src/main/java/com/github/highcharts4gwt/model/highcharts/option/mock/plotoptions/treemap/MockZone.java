
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.treemap;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Zone;

public class MockZone
    implements Zone
{

    private String color;
    private String dashStyle;
    private String fillColor;
    private double value;

    public String color() {
        return color;
    }

    public MockZone color(String color) {
        this.color = color;
        return this;
    }

    public String dashStyle() {
        return dashStyle;
    }

    public MockZone dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public String fillColor() {
        return fillColor;
    }

    public MockZone fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public double value() {
        return value;
    }

    public MockZone value(double value) {
        this.value = value;
        return this;
    }

}
