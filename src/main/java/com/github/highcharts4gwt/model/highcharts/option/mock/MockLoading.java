
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.Loading;

public class MockLoading
    implements Loading
{

    private double hideDuration;
    private String labelStyle;
    private double showDuration;
    private String style;
    private String genericField;

    public double hideDuration() {
        return hideDuration;
    }

    public MockLoading hideDuration(double hideDuration) {
        this.hideDuration = hideDuration;
        return this;
    }

    public String labelStyle() {
        return labelStyle;
    }

    public MockLoading labelStyle(String labelStyleAsJsonString) {
        this.labelStyle = labelStyleAsJsonString;
        return this;
    }

    public double showDuration() {
        return showDuration;
    }

    public MockLoading showDuration(double showDuration) {
        this.showDuration = showDuration;
        return this;
    }

    public String style() {
        return style;
    }

    public MockLoading style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockLoading setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
