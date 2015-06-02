
package com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.point;



/**
 * Events for each single point
 * 
 */
public interface Events {


    String getFieldAsJsonObject(String fieldName);

    Events setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Events setFunctionAsString(String fieldName, String functionAsString);

}
