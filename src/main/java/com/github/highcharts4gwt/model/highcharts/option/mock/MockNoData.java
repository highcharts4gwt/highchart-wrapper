
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.NoData;


/**
 * Options for displaying a message like "No data to display". This feature requires the file <code>no-data-to-display.js</code> to be loaded in the page. The actual text to display is set in the <a href="#lang.noData">lang.noData</a> option.
 * 
 */
public class MockNoData
    implements NoData
{

    private String attr;
    private String position;
    private String style;
    private String genericField;
    private String functionAsString;

    public String attr() {
        return attr;
    }

    public MockNoData attr(String attrAsJsonString) {
        this.attr = attrAsJsonString;
        return this;
    }

    public String position() {
        return position;
    }

    public MockNoData position(String positionAsJsonString) {
        this.position = positionAsJsonString;
        return this;
    }

    public String style() {
        return style;
    }

    public MockNoData style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockNoData setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockNoData setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
