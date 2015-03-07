
package com.github.highcharts4gwt.model.highcharts.option.api.drilldown;


public interface DrillUpButton {


    String position();

    DrillUpButton position(String positionAsJsonString);

    String relativeTo();

    DrillUpButton relativeTo(String relativeTo);

    String theme();

    DrillUpButton theme(String themeAsJsonString);

    String getFieldAsJsonObject(String fieldName);

    DrillUpButton setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
