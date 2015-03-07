
package com.github.highcharts4gwt.model.highcharts.option.mock.chart.options3d.frame;

import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Back;

public class MockBack
    implements Back
{

    private String color;
    private double size;
    private String genericField;

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

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockBack setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
