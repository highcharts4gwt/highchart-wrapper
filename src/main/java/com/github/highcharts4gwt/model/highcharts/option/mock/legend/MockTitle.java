
package com.github.highcharts4gwt.model.highcharts.option.mock.legend;

import com.github.highcharts4gwt.model.highcharts.option.api.legend.Title;


/**
 * A title to be added on top of the legend.
 * 
 */
public class MockTitle
    implements Title
{

    private String style;
    private String text;
    private String genericField;
    private String functionAsString;

    public String style() {
        return style;
    }

    public MockTitle style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public String text() {
        return text;
    }

    public MockTitle text(String text) {
        this.text = text;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockTitle setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockTitle setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
