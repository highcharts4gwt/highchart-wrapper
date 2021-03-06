
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.series;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.series.Zone;


/**
 * An array defining zones within a series.
 * 
 */
public class MockZone
    implements Zone
{

    private String color;
    private String dashStyle;
    private String fillColor;
    private double value;
    private String genericField;
    private String functionAsString;

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

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockZone setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockZone setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
