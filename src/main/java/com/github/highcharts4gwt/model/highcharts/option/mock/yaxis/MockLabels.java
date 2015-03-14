
package com.github.highcharts4gwt.model.highcharts.option.mock.yaxis;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.Labels;


/**
 * 
 */
public class MockLabels
    implements Labels
{

    private String align;
    private ArrayNumber autoRotation;
    private double distance;
    private boolean enabled;
    private String format;
    private double maxStaggerLines;
    private String overflow;
    private double padding;
    private double rotation;
    private double staggerLines;
    private double step;
    private String style;
    private boolean useHTML;
    private double x;
    private double y;
    private double zIndex;
    private String genericField;
    private String functionAsString;

    public String align() {
        return align;
    }

    public MockLabels align(String align) {
        this.align = align;
        return this;
    }

    public ArrayNumber autoRotation() {
        return autoRotation;
    }

    public MockLabels autoRotation(ArrayNumber autoRotation) {
        this.autoRotation = autoRotation;
        return this;
    }

    public double distance() {
        return distance;
    }

    public MockLabels distance(double distance) {
        this.distance = distance;
        return this;
    }

    public boolean enabled() {
        return enabled;
    }

    public MockLabels enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String format() {
        return format;
    }

    public MockLabels format(String format) {
        this.format = format;
        return this;
    }

    public double maxStaggerLines() {
        return maxStaggerLines;
    }

    public MockLabels maxStaggerLines(double maxStaggerLines) {
        this.maxStaggerLines = maxStaggerLines;
        return this;
    }

    public String overflow() {
        return overflow;
    }

    public MockLabels overflow(String overflow) {
        this.overflow = overflow;
        return this;
    }

    public double padding() {
        return padding;
    }

    public MockLabels padding(double padding) {
        this.padding = padding;
        return this;
    }

    public double rotation() {
        return rotation;
    }

    public MockLabels rotation(double rotation) {
        this.rotation = rotation;
        return this;
    }

    public double staggerLines() {
        return staggerLines;
    }

    public MockLabels staggerLines(double staggerLines) {
        this.staggerLines = staggerLines;
        return this;
    }

    public double step() {
        return step;
    }

    public MockLabels step(double step) {
        this.step = step;
        return this;
    }

    public String style() {
        return style;
    }

    public MockLabels style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public boolean useHTML() {
        return useHTML;
    }

    public MockLabels useHTML(boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public double x() {
        return x;
    }

    public MockLabels x(double x) {
        this.x = x;
        return this;
    }

    public double y() {
        return y;
    }

    public MockLabels y(double y) {
        this.y = y;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockLabels zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockLabels setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockLabels setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
