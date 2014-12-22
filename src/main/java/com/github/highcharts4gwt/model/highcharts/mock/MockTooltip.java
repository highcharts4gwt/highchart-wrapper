
package com.github.highcharts4gwt.model.highcharts.mock;

import com.github.highcharts4gwt.model.highcharts.api.Tooltip;

public class MockTooltip
    implements Tooltip
{

    private boolean animation;
    private String backgroundColor;
    private String borderColor;
    private double borderRadius;
    private double borderWidth;
    private String dateTimeLabelFormats;
    private boolean enabled;
    private boolean followPointer;
    private boolean followTouchMove;
    private String footerFormat;
    private String headerFormat;
    private double hideDelay;
    private String pointFormat;
    private boolean shadow;
    private String shape;
    private boolean shared;
    private double snap;
    private String style;
    private boolean useHTML;
    private double valueDecimals;
    private String valuePrefix;
    private String valueSuffix;
    private String xDateFormat;

    public boolean animation() {
        return animation;
    }

    public MockTooltip animation(boolean animation) {
        this.animation = animation;
        return this;
    }

    public String backgroundColor() {
        return backgroundColor;
    }

    public MockTooltip backgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
        return this;
    }

    public String borderColor() {
        return borderColor;
    }

    public MockTooltip borderColor(String borderColor) {
        this.borderColor = borderColor;
        return this;
    }

    public double borderRadius() {
        return borderRadius;
    }

    public MockTooltip borderRadius(double borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public double borderWidth() {
        return borderWidth;
    }

    public MockTooltip borderWidth(double borderWidth) {
        this.borderWidth = borderWidth;
        return this;
    }

    public String dateTimeLabelFormats() {
        return dateTimeLabelFormats;
    }

    public MockTooltip dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString) {
        this.dateTimeLabelFormats = dateTimeLabelFormatsAsJsonString;
        return this;
    }

    public boolean enabled() {
        return enabled;
    }

    public MockTooltip enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public boolean followPointer() {
        return followPointer;
    }

    public MockTooltip followPointer(boolean followPointer) {
        this.followPointer = followPointer;
        return this;
    }

    public boolean followTouchMove() {
        return followTouchMove;
    }

    public MockTooltip followTouchMove(boolean followTouchMove) {
        this.followTouchMove = followTouchMove;
        return this;
    }

    public String footerFormat() {
        return footerFormat;
    }

    public MockTooltip footerFormat(String footerFormat) {
        this.footerFormat = footerFormat;
        return this;
    }

    public String headerFormat() {
        return headerFormat;
    }

    public MockTooltip headerFormat(String headerFormat) {
        this.headerFormat = headerFormat;
        return this;
    }

    public double hideDelay() {
        return hideDelay;
    }

    public MockTooltip hideDelay(double hideDelay) {
        this.hideDelay = hideDelay;
        return this;
    }

    public String pointFormat() {
        return pointFormat;
    }

    public MockTooltip pointFormat(String pointFormat) {
        this.pointFormat = pointFormat;
        return this;
    }

    public boolean shadow() {
        return shadow;
    }

    public MockTooltip shadow(boolean shadow) {
        this.shadow = shadow;
        return this;
    }

    public String shape() {
        return shape;
    }

    public MockTooltip shape(String shape) {
        this.shape = shape;
        return this;
    }

    public boolean shared() {
        return shared;
    }

    public MockTooltip shared(boolean shared) {
        this.shared = shared;
        return this;
    }

    public double snap() {
        return snap;
    }

    public MockTooltip snap(double snap) {
        this.snap = snap;
        return this;
    }

    public String style() {
        return style;
    }

    public MockTooltip style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public boolean useHTML() {
        return useHTML;
    }

    public MockTooltip useHTML(boolean useHTML) {
        this.useHTML = useHTML;
        return this;
    }

    public double valueDecimals() {
        return valueDecimals;
    }

    public MockTooltip valueDecimals(double valueDecimals) {
        this.valueDecimals = valueDecimals;
        return this;
    }

    public String valuePrefix() {
        return valuePrefix;
    }

    public MockTooltip valuePrefix(String valuePrefix) {
        this.valuePrefix = valuePrefix;
        return this;
    }

    public String valueSuffix() {
        return valueSuffix;
    }

    public MockTooltip valueSuffix(String valueSuffix) {
        this.valueSuffix = valueSuffix;
        return this;
    }

    public String xDateFormat() {
        return xDateFormat;
    }

    public MockTooltip xDateFormat(String xDateFormat) {
        this.xDateFormat = xDateFormat;
        return this;
    }

}
