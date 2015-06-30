
package com.github.highcharts4gwt.model.highcharts.option.mock.seriescolumn;

import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.FormatterCallback;


/**
 * 
 */
public class MockDataLabels
    implements DataLabels
{

    private String align;
    private boolean allowOverlap;
    private String backgroundColor;
    private String borderColor;
    private double borderRadius;
    private double borderWidth;
    private String color;
    private boolean crop;
    private boolean defer;
    private boolean enabled;
    private String format;
    private boolean inside;
    private String overflow;
    private double padding;
    private double rotation;
    private boolean shadowAsBoolean;
    private String shadowAsJsonString;
    private String shape;
    private String style;
    private boolean useHTML;
    private String verticalAlign;
    private double x;
    private double y;
    private double zIndex;
    private String genericField;
    private String functionAsString;

    public String align() {
        return align;
    }

    public MockDataLabels align(String align) {
        this.align = align;
        return this;
    }

    public boolean allowOverlap() {
        return allowOverlap;
    }

    public MockDataLabels allowOverlap(boolean allowOverlap) {
        this.allowOverlap = allowOverlap;
        return this;
    }

    public String backgroundColor() {
        return backgroundColor;
    }

    public MockDataLabels backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockDataLabels borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderRadius() {
        return borderRadius;
    }

    public MockDataLabels borderRadius(double borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockDataLabels borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String color() {
        return color;
    }

    public MockDataLabels color(String color) {
        this.color = color;
        return this;
    }

    public boolean crop() {
        return crop;
    }

    public MockDataLabels crop(boolean crop) {
        this.crop = crop;
        return this;
    }

    public boolean defer() {
        return defer;
    }

    public MockDataLabels defer(boolean defer) {
        this.defer = defer;
        return this;
    }

    public boolean enabled() {
        return enabled;
    }

    public MockDataLabels enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String format() {
        return format;
    }

    public MockDataLabels format(String format) {
        this.format = format;
        return this;
    }

    public MockDataLabels formatter(FormatterCallback formatter) {
        return this;
    }

    public boolean inside() {
        return inside;
    }

    public MockDataLabels inside(boolean inside) {
        this.inside = inside;
        return this;
    }

    public String overflow() {
        return overflow;
    }

    public MockDataLabels overflow(String overflow) {
        this.overflow = overflow;
        return this;
    }

    public double padding() {
        return padding;
    }

    public MockDataLabels padding(double padding) {
        this.padding = padding;
        return this;
    }

    public double rotation() {
        return rotation;
    }

    public MockDataLabels rotation(double rotation) {
        this.rotation = rotation;
        return this;
    }

    public boolean shadowAsBoolean() {
        return shadowAsBoolean;
    }

    public MockDataLabels shadowAsBoolean(boolean shadowAsBoolean) {
        this.shadowAsBoolean = shadowAsBoolean;
        return this;
    }

    public String shadowAsJsonString() {
        return shadowAsJsonString;
    }

    public MockDataLabels shadowAsJsonString(String shadowAsJsonString) {
        this.shadowAsJsonString = shadowAsJsonString;
        return this;
    }

    public String shape() {
        return shape;
    }

    public MockDataLabels shape(String shape) {
        this.shape = shape;
        return this;
    }

    public String style() {
        return style;
    }

    public MockDataLabels style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public boolean useHTML() {
        return useHTML;
    }

    public MockDataLabels useHTML(boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public String verticalAlign() {
        return verticalAlign;
    }

    public MockDataLabels verticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

    public double x() {
        return x;
    }

    public MockDataLabels x(double x) {
        this.x = x;
        return this;
    }

    public double y() {
        return y;
    }

    public MockDataLabels y(double y) {
        this.y = y;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockDataLabels zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockDataLabels setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockDataLabels setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
