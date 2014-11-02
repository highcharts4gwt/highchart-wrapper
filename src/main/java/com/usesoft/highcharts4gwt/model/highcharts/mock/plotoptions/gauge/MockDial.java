
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.gauge;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.gauge.Dial;

public class MockDial
    implements Dial
{

    private String backgroundColor;
    private String baseLength;
    private Number baseWidth;
    private String borderColor;
    private Number borderWidth;
    private String radius;
    private String rearLength;
    private Number topWidth;

    public String backgroundColor() {
        return backgroundColor;
    }

    public MockDial backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String baseLength() {
        return baseLength;
    }

    public MockDial baseLength(String baseLength) {
        this.baseLength = baseLength;
        return this;
    }

    public Number baseWidth() {
        return baseWidth;
    }

    public MockDial baseWidth(Number baseWidth) {
        this.baseWidth = baseWidth;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockDial borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public Number borderWidth() {
        return borderWidth;
    }

    public MockDial borderWidth(Number borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String radius() {
        return radius;
    }

    public MockDial radius(String radius) {
        this.radius = radius;
        return this;
    }

    public String rearLength() {
        return rearLength;
    }

    public MockDial rearLength(String rearLength) {
        this.rearLength = rearLength;
        return this;
    }

    public Number topWidth() {
        return topWidth;
    }

    public MockDial topWidth(Number topWidth) {
        this.topWidth = topWidth;
        return this;
    }

}
