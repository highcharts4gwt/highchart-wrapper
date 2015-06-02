
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesgauge;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Dial;


/**
 * Options for the dial or arrow pointer of the gauge.
 * 
 */
public class MockDial
    implements Dial
{

    private String backgroundColor;
    private String baseLength;
    private double baseWidth;
    private String borderColor;
    private double borderWidth;
    private String radius;
    private String rearLength;
    private double topWidth;
    private String genericField;
    private String functionAsString;

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

    public double baseWidth() {
        return baseWidth;
    }

    public MockDial baseWidth(double baseWidth) {
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

    public double borderWidth() {
        return borderWidth;
    }

    public MockDial borderWidth(double borderWidth) {
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

    public double topWidth() {
        return topWidth;
    }

    public MockDial topWidth(double topWidth) {
        this.topWidth = topWidth;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockDial setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockDial setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
