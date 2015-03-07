
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.highcharts.option.api.drilldown.DrillUpButton;

public interface Drilldown {


    String activeAxisLabelStyle();

    Drilldown activeAxisLabelStyle(String activeAxisLabelStyleAsJsonString);

    String activeDataLabelStyle();

    Drilldown activeDataLabelStyle(String activeDataLabelStyleAsJsonString);

    boolean animationAsBoolean();

    Drilldown animationAsBoolean(boolean animationAsBoolean);

    String animationAsJsonString();

    Drilldown animationAsJsonString(String animationAsJsonString);

    DrillUpButton drillUpButton();

    Drilldown drillUpButton(DrillUpButton drillUpButton);

    String getFieldAsJsonObject(String fieldName);

    Drilldown setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
