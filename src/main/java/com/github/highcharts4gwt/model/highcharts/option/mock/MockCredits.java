
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.highcharts.option.api.Credits;


/**
 * Highchart by default puts a credits label in the lower right corner of the chart.
 * 		This can be changed using these options.
 * 
 */
public class MockCredits
    implements Credits
{

    private boolean enabled;
    private String href;
    private String position;
    private String style;
    private String text;
    private String genericField;
    private String functionAsString;

    public boolean enabled() {
        return enabled;
    }

    public MockCredits enabled(boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    public String href() {
        return href;
    }

    public MockCredits href(String href) {
        this.href = href;
        return this;
    }

    public String position() {
        return position;
    }

    public MockCredits position(String positionAsJsonString) {
        this.position = positionAsJsonString;
        return this;
    }

    public String style() {
        return style;
    }

    public MockCredits style(String styleAsJsonString) {
        this.style = styleAsJsonString;
        return this;
    }

    public String text() {
        return text;
    }

    public MockCredits text(String text) {
        this.text = text;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockCredits setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockCredits setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
