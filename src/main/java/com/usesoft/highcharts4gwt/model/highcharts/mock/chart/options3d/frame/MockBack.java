
package com.usesoft.highcharts4gwt.model.highcharts.mock.chart.options3d.frame;

import com.usesoft.highcharts4gwt.model.highcharts.api.chart.options3d.frame.Back;

public class MockBack
    implements Back
{

    private String color;
    private Number size;

    public String color() {
        return color;
    }

    public MockBack color(String color) {
        this.color = color;
        return this;
    }

    public Number size() {
        return size;
    }

    public MockBack size(Number size) {
        this.size = size;
        return this;
    }

}
