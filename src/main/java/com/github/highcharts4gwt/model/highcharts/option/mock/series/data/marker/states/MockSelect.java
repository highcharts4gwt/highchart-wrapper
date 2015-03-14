
package com.github.highcharts4gwt.model.highcharts.option.mock.series.data.marker.states;

import com.github.highcharts4gwt.model.highcharts.option.api.series.data.marker.states.Select;


/**
 * The appearance of the point marker when selected. In order to allow a point to be 
 * 		selected, set the <code>series.allowPointSelect</code> option to true.
 * 
 */
public class MockSelect
    implements Select
{

    private boolean enabled;
    private String fillColor;
    private String lineColor;
    private double lineWidth;
    private double radius;
    private String genericField;
    private String functionAsString;

    public boolean enabled() {
        return enabled;
    }

    public MockSelect enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String fillColor() {
        return fillColor;
    }

    public MockSelect fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockSelect lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockSelect lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public double radius() {
        return radius;
    }

    public MockSelect radius(double radius) {
        this.radius = radius;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSelect setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockSelect setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
