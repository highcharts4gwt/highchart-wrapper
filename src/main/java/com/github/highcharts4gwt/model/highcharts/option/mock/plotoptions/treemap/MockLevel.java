
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.treemap;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Level;

public class MockLevel
    implements Level
{

    private String borderColor;
    private String borderDashStyle;
    private double borderWidth;
    private String color;
    private String dataLabels;
    private String layoutAlgorithm;
    private String layoutStartingDirection;
    private double level;
    private String genericField;

    public String borderColor() {
        return borderColor;
    }

    public MockLevel borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public String borderDashStyle() {
        return borderDashStyle;
    }

    public MockLevel borderDashStyle(String borderDashStyle) {
        this.borderDashStyle = borderDashStyle;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockLevel borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String color() {
        return color;
    }

    public MockLevel color(String color) {
        this.color = color;
        return this;
    }

    public String dataLabels() {
        return dataLabels;
    }

    public MockLevel dataLabels(String dataLabelsAsJsonString) {
        this.dataLabels = dataLabelsAsJsonString;
        return this;
    }

    public String layoutAlgorithm() {
        return layoutAlgorithm;
    }

    public MockLevel layoutAlgorithm(String layoutAlgorithm) {
        this.layoutAlgorithm = layoutAlgorithm;
        return this;
    }

    public String layoutStartingDirection() {
        return layoutStartingDirection;
    }

    public MockLevel layoutStartingDirection(String layoutStartingDirection) {
        this.layoutStartingDirection = layoutStartingDirection;
        return this;
    }

    public double level() {
        return level;
    }

    public MockLevel level(double level) {
        this.level = level;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockLevel setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
