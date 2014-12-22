
package com.github.highcharts4gwt.model.highcharts.mock.chart.options3d.frame;

import com.github.highcharts4gwt.model.highcharts.api.chart.options3d.frame.Back;

public class MockBack
    implements Back
{

    private String color;
    private double size;

    public String color() {
        return color;
    }

    public MockBack color(String color) {
        this.color = color;
        return this;
    }

    public double size() {
        return size;
    }

    public MockBack size(double size) {
        this.size = size;
        return this;
    }

}
