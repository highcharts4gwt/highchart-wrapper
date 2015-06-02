
package com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid;



/**
 * 
 */
public interface Events {


    String getFieldAsJsonObject(String fieldName);

    Events setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Events setFunctionAsString(String fieldName, String functionAsString);

}
