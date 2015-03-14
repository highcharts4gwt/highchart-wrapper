
package com.github.highcharts4gwt.model.highcharts.option.mock.chart.options3d;

import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.Frame;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Back;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Bottom;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Side;


/**
 * Provides the option to draw a frame around the charts by defining a bottom, front and back panel.
 * 
 */
public class MockFrame
    implements Frame
{

    private Back back;
    private Bottom bottom;
    private Side side;
    private String genericField;
    private String functionAsString;

    public Back back() {
        return back;
    }

    public MockFrame back(Back back) {
        this.back = back;
        return this;
    }

    public Bottom bottom() {
        return bottom;
    }

    public MockFrame bottom(Bottom bottom) {
        this.bottom = bottom;
        return this;
    }

    public Side side() {
        return side;
    }

    public MockFrame side(Side side) {
        this.side = side;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockFrame setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockFrame setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
