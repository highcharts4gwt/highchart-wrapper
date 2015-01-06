
package com.github.highcharts4gwt.model.highcharts.option.mock.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.Tooltip;

public class MockTooltip
    implements Tooltip
{

    private String dateTimeLabelFormats;
    private boolean followPointer;
    private boolean followTouchMove;
    private String footerFormat;
    private String headerFormat;
    private double hideDelay;
    private String pointFormat;
    private String shape;
    private double valueDecimals;
    private String valuePrefix;
    private String valueSuffix;
    private String xDateFormat;

    public String dateTimeLabelFormats() {
        return dateTimeLabelFormats;
    }

    public MockTooltip dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString) {
        this.dateTimeLabelFormats = dateTimeLabelFormatsAsJsonString;
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

    public String shape() {
        return shape;
    }

    public MockTooltip shape(String shape) {
        this.shape = shape;
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
