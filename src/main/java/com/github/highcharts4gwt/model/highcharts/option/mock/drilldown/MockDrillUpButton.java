
package com.github.highcharts4gwt.model.highcharts.option.mock.drilldown;

import com.github.highcharts4gwt.model.highcharts.option.api.drilldown.DrillUpButton;


/**
 * Options for the drill up button that appears when drilling down on a series. The text for the button is defined in <a href="#lang.drillUpText">lang.drillUpText</a>.
 * 
 */
public class MockDrillUpButton
    implements DrillUpButton
{

    private String position;
    private String relativeTo;
    private String theme;
    private String genericField;
    private String functionAsString;

    public String position() {
        return position;
    }

    public MockDrillUpButton position(String positionAsJsonString) {
        this.position = positionAsJsonString;
        return this;
    }

    public String relativeTo() {
        return relativeTo;
    }

    public MockDrillUpButton relativeTo(String relativeTo) {
        this.relativeTo = relativeTo;
        return this;
    }

    public String theme() {
        return theme;
    }

    public MockDrillUpButton theme(String themeAsJsonString) {
        this.theme = themeAsJsonString;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockDrillUpButton setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockDrillUpButton setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
