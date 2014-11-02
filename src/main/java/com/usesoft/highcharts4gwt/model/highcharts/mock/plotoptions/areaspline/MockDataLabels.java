
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.areaspline;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.DataLabels;
import com.usesoft.highcharts4gwt.model.highcharts.mock.xaxis.MockLabels;

public class MockDataLabels
    extends MockLabels
    implements DataLabels
{

    private String backgroundColor;
    private String borderColor;
    private Number borderRadius;
    private Number borderWidth;
    private String color;
    private boolean crop;
    private boolean defer;
    private boolean inside;
    private Number padding;
    private boolean shadowAsBoolean;
    private String shadowAsJsonString;
    private String verticalAlign;

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

    public Number borderRadius() {
        return borderRadius;
    }

    public MockDataLabels borderRadius(Number borderRadius) {
        this.borderRadius = borderRadius;
        return this;
    }

    public Number borderWidth() {
        return borderWidth;
    }

    public MockDataLabels borderWidth(Number borderWidth) {
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

    public boolean inside() {
        return inside;
    }

    public MockDataLabels inside(boolean inside) {
        this.inside = inside;
        return this;
    }

    public Number padding() {
        return padding;
    }

    public MockDataLabels padding(Number padding) {
        this.padding = padding;
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

    public String verticalAlign() {
        return verticalAlign;
    }

    public MockDataLabels verticalAlign(String verticalAlign) {
        this.verticalAlign = verticalAlign;
        return this;
    }

}
