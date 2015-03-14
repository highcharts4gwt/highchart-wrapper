
package com.github.highcharts4gwt.model.highcharts.option.mock.chart.options3d.frame;

import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Bottom;


/**
 * The bottom of the frame around a 3D chart.
 * 
 */
public class MockBottom
    implements Bottom
{

    private String color;
    private double size;
    private String genericField;
    private String functionAsString;

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

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockBottom setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockBottom setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
