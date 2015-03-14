
package com.github.highcharts4gwt.model.highcharts.option.mock.exporting.buttons;

import com.github.highcharts4gwt.model.highcharts.option.api.exporting.buttons.ContextButton;


/**
 * Options for the export button.
 * 
 */
public class MockContextButton
    implements ContextButton
{

    private String align;
    private boolean enabled;
    private double height;
    private String menuItems;
    private String symbol;
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
    private double x;
    private double y;
    private String genericField;
    private String functionAsString;

    public String align() {
        return align;
    }

    public MockContextButton align(String align) {
        this.align = align;
        return this;
    }

    public boolean enabled() {
        return enabled;
    }

    public MockContextButton enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public double height() {
        return height;
    }

    public MockContextButton height(double height) {
        this.height = height;
        return this;
    }

    public String menuItems() {
        return menuItems;
    }

    public MockContextButton menuItems(String menuItemsAsJsonStringArray) {
        this.menuItems = menuItemsAsJsonStringArray;
        return this;
    }

    public String symbol() {
        return symbol;
    }

    public MockContextButton symbol(String symbol) {
        this.symbol = symbol;
        return this;
    }

    public String symbolFill() {
        return symbolFill;
    }

    public MockContextButton symbolFill(String symbolFill) {
        this.symbolFill = symbolFill;
        return this;
    }

    public double symbolSize() {
        return symbolSize;
    }

    public MockContextButton symbolSize(double symbolSize) {
        this.symbolSize = symbolSize;
        return this;
    }

    public String symbolStroke() {
        return symbolStroke;
    }

    public MockContextButton symbolStroke(String symbolStroke) {
        this.symbolStroke = symbolStroke;
        return this;
    }

    public double symbolStrokeWidth() {
        return symbolStrokeWidth;
    }

    public MockContextButton symbolStrokeWidth(double symbolStrokeWidth) {
        this.symbolStrokeWidth = symbolStrokeWidth;
        return this;
    }

    public double symbolX() {
        return symbolX;
    }

    public MockContextButton symbolX(double symbolX) {
        this.symbolX = symbolX;
        return this;
    }

    public double symbolY() {
        return symbolY;
    }

    public MockContextButton symbolY(double symbolY) {
        this.symbolY = symbolY;
        return this;
    }

    public String text() {
        return text;
    }

    public MockContextButton text(String text) {
        this.text = text;
        return this;
    }

    public String theme() {
        return theme;
    }

    public MockContextButton theme(String themeAsJsonString) {
        this.theme = themeAsJsonString;
        return this;
    }

    public String verticalAlign() {
        return verticalAlign;
    }

    public MockContextButton verticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public double width() {
        return width;
    }

    public MockContextButton width(double width) {
        this.width = width;
        return this;
    }

    public double x() {
        return x;
    }

    public MockContextButton x(double x) {
        this.x = x;
        return this;
    }

    public double y() {
        return y;
    }

    public MockContextButton y(double y) {
        this.y = y;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockContextButton setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockContextButton setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
