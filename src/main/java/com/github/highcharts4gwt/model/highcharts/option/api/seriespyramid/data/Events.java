
package com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data;



/**
 * Individual point events
 * 
 */
public interface Events {


    String getFieldAsJsonObject(String fieldName);

    Events setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Events setFunctionAsString(String fieldName, String functionAsString);

}
