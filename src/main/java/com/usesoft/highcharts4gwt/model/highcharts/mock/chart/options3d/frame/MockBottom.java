
package com.usesoft.highcharts4gwt.model.highcharts.mock.chart.options3d.frame;

import com.usesoft.highcharts4gwt.model.highcharts.api.chart.options3d.frame.Bottom;

public class MockBottom
    implements Bottom
{

    private String color;
    private double size;

    public String color() {
        return color;
    }

    public MockBottom color(String color) {
        this.color = color;
        return this;
    }

    public double size() {
        return size;
    }

    public MockBottom size(double size) {
        this.size = size;
        return this;
    }

}
