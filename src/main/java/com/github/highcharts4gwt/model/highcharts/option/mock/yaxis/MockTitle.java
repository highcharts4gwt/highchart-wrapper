
package com.github.highcharts4gwt.model.highcharts.option.mock.yaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.Title;


/**
 * 
 */
public class MockTitle
    implements Title
{

    private String align;
    private String enabled;
    private double margin;
    private double offset;
    private double rotation;
    private String style;
    private String text;
    private String genericField;
    private String functionAsString;

    public String align() {
        return align;
    }

    public MockTitle align(String align) {
        this.align = align;
        return this;
    }

    public String enabled() {
        return enabled;
    }

    public MockTitle enabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    public double margin() {
        return margin;
    }

    public MockTitle margin(double margin) {
        this.margin = margin;
        return this;
    }

    public double offset() {
        return offset;
    }

    public MockTitle offset(double offset) {
        this.offset = offset;
        return this;
    }

    public double rotation() {
        return rotation;
    }

    public MockTitle rotation(double rotation) {
        this.rotation = rotation;
        return this;
    }

    public String style() {
        return style;
    }

    public MockTitle style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public String text() {
        return text;
    }

    public MockTitle text(String text) {
        this.text = text;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockTitle setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockTitle setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
