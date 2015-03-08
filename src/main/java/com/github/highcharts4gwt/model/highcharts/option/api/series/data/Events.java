
package com.github.highcharts4gwt.model.highcharts.option.api.series.data;



/**
 * Individual point events
 * 
 */
public interface Events {


    String getFieldAsJsonObject(String fieldName);

    Events setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
