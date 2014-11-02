
package com.usesoft.highcharts4gwt.model.highcharts.mock.chart.options3d.frame;

import com.usesoft.highcharts4gwt.model.highcharts.api.chart.options3d.frame.Side;

public class MockSide
    implements Side
{

    private String color;
    private Number size;

    public String color() {
        return color;
    }

    public MockSide color(String color) {
        this.color = color;
        return this;
    }

    public Number size() {
        return size;
    }

    public MockSide size(Number size) {
        this.size = size;
        return this;
    }

}
