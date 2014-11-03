
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.gauge;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Pivot;

public class MockPivot
    implements Pivot
{

    private String backgroundColor;
    private String borderColor;
    private double borderWidth;
    private double radius;

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

}
