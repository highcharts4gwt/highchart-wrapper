
package com.github.highcharts4gwt.model.highcharts.option.mock.xaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.PlotBand;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.plotbands.Label;


/**
 * <p>An array of colored bands stretching across the plot area marking an interval on the axis.</p>
 * 
 * <p>In a gauge, a plot band on the Y axis (value axis) will stretch along the perimeter of the gauge.</p>
 * 
 */
public class MockPlotBand
    implements PlotBand
{

    private String borderColor;
    private double borderWidth;
    private String color;
    private double from;
    private String id;
    private Label label;
    private double to;
    private double zIndex;
    private String genericField;
    private String functionAsString;

    public String borderColor() {
        return borderColor;
    }

    public MockPlotBand borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockPlotBand borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String color() {
        return color;
    }

    public MockPlotBand color(String color) {
        this.color = color;
        return this;
    }

    public double from() {
        return from;
    }

    public MockPlotBand from(double from) {
        this.from = from;
        return this;
    }

    public String id() {
        return id;
    }

    public MockPlotBand id(String id) {
        this.id = id;
        return this;
    }

    public Label label() {
        return label;
    }

    public MockPlotBand label(Label label) {
        this.label = label;
        return this;
    }

    public double to() {
        return to;
    }

    public MockPlotBand to(double to) {
        this.to = to;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockPlotBand zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockPlotBand setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockPlotBand setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
