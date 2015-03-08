
package com.github.highcharts4gwt.model.highcharts.option.mock.navigation;

import com.github.highcharts4gwt.model.highcharts.option.api.navigation.ButtonOptions;


/**
 * A collection of options for buttons appearing in the exporting module.
 * 
 */
public class MockButtonOptions
    implements ButtonOptions
{

    private String align;
    private boolean enabled;
    private double height;
    private String symbolFill;
    private double symbolSize;
    private String symbolStroke;
    private double symbolStrokeWidth;
    private double symbolX;
    private double symbolY;
    private String text;
    private String theme;
    private String verticalAlign;
    private double width;
    private double y;
    private String genericField;

    public String align() {
        return align;
    }

    public MockButtonOptions align(String align) {
        this.align = align;
        return this;
    }

    public boolean enabled() {
        return enabled;
    }

    public MockButtonOptions enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public double height() {
        return height;
    }

    public MockButtonOptions height(double height) {
        this.height = height;
        return this;
    }

    public String symbolFill() {
        return symbolFill;
    }

    public MockButtonOptions symbolFill(String symbolFill) {
        this.symbolFill = symbolFill;
        return this;
    }

    public double symbolSize() {
        return symbolSize;
    }

    public MockButtonOptions symbolSize(double symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public String symbolStroke() {
        return symbolStroke;
    }

    public MockButtonOptions symbolStroke(String symbolStroke) {
        this.symbolStroke = symbolStroke;
        return this;
    }

    public double symbolStrokeWidth() {
        return symbolStrokeWidth;
    }

    public MockButtonOptions symbolStrokeWidth(double symbolStrokeWidth) {
        this.symbolStrokeWidth = symbolStrokeWidth;
        return this;
    }

    public double symbolX() {
        return symbolX;
    }

    public MockButtonOptions symbolX(double symbolX) {
        this.symbolX = symbolX;
        return this;
    }

    public double symbolY() {
        return symbolY;
    }

    public MockButtonOptions symbolY(double symbolY) {
        this.symbolY = symbolY;
        return this;
    }

    public String text() {
        return text;
    }

    public MockButtonOptions text(String text) {
        this.text = text;
        return this;
    }

    public String theme() {
        return theme;
    }

    public MockButtonOptions theme(String themeAsJsonString) {
        this.theme = themeAsJsonString;
        return this;
    }

    public String verticalAlign() {
        return verticalAlign;
    }

    public MockButtonOptions verticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public double width() {
        return width;
    }

    public MockButtonOptions width(double width) {
        this.width = width;
        return this;
    }

    public double y() {
        return y;
    }

    public MockButtonOptions y(double y) {
        this.y = y;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockButtonOptions setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
