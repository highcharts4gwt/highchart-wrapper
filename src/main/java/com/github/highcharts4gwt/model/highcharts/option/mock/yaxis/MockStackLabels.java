
package com.github.highcharts4gwt.model.highcharts.option.mock.yaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.StackLabels;


/**
 * The stack labels show the total value for each bar in a stacked column or bar chart. The label will be placed on top of
 * 	positive columns and below negative columns. In case of an inverted column chart or a bar chart the label is placed to 
 * 	the right of positive bars and to the left of negative bars.
 * 
 */
public class MockStackLabels
    implements StackLabels
{

    private String align;
    private boolean enabled;
    private String format;
    private double rotation;
    private String style;
    private String textAlign;
    private boolean useHTML;
    private String verticalAlign;
    private double x;
    private double y;
    private String genericField;
    private String functionAsString;

    public String align() {
        return align;
    }

    public MockStackLabels align(String align) {
        this.align = align;
        return this;
    }

    public boolean enabled() {
        return enabled;
    }

    public MockStackLabels enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String format() {
        return format;
    }

    public MockStackLabels format(String format) {
        this.format = format;
        return this;
    }

    public double rotation() {
        return rotation;
    }

    public MockStackLabels rotation(double rotation) {
        this.rotation = rotation;
        return this;
    }

    public String style() {
        return style;
    }

    public MockStackLabels style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public String textAlign() {
        return textAlign;
    }

    public MockStackLabels textAlign(String textAlign) {
        this.textAlign = textAlign;
        return this;
    }

    public boolean useHTML() {
        return useHTML;
    }

    public MockStackLabels useHTML(boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public String verticalAlign() {
        return verticalAlign;
    }

    public MockStackLabels verticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public double x() {
        return x;
    }

    public MockStackLabels x(double x) {
        this.x = x;
        return this;
    }

    public double y() {
        return y;
    }

    public MockStackLabels y(double y) {
        this.y = y;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockStackLabels setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockStackLabels setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
