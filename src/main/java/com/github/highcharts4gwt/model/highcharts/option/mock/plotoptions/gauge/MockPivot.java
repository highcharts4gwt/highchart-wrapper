
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.Pivot;

public class MockPivot
    implements Pivot
{

    private String backgroundColor;
    private String borderColor;
    private double borderWidth;
    private double radius;
    private String genericField;

    public String backgroundColor() {
        return backgroundColor;
    }

    public MockPivot backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockPivot borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockPivot borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public double radius() {
        return radius;
    }

    public MockPivot radius(double radius) {
        this.radius = radius;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockPivot setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
