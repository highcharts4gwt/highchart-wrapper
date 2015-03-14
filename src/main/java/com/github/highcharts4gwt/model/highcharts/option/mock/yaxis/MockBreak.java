
package com.github.highcharts4gwt.model.highcharts.option.mock.yaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.Break;


/**
 * An array defining breaks in the axis, the sections defined will be left out and all the points shifted closer to each other. Requires that the broken-axis.js module is loaded.
 * 
 */
public class MockBreak
    implements Break
{

    private double breakSize;
    private double from;
    private double repeat;
    private double to;
    private String genericField;
    private String functionAsString;

    public double breakSize() {
        return breakSize;
    }

    public MockBreak breakSize(double breakSize) {
        this.breakSize = breakSize;
        return this;
    }

    public double from() {
        return from;
    }

    public MockBreak from(double from) {
        this.from = from;
        return this;
    }

    public double repeat() {
        return repeat;
    }

    public MockBreak repeat(double repeat) {
        this.repeat = repeat;
        return this;
    }

    public double to() {
        return to;
    }

    public MockBreak to(double to) {
        this.to = to;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockBreak setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockBreak setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
