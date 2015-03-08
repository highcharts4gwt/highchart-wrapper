
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.Loading;


/**
 * The loading options control the appearance of the loading screen that covers the 
 * 	plot area on chart operations. This screen only appears after an explicit call
 * 	to <code>chart.showLoading()</code>. It is a utility for developers to communicate
 * 	to the end user that something is going on, for example while retrieving new data
 * 	via an XHR connection. The "Loading..." text itself is not part of this configuration
 * 	object, but part of the <code>lang</code> object.
 * 
 */
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
