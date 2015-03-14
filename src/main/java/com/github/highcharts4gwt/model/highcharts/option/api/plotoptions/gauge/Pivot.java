
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge;



/**
 * Options for the pivot or the center point of the gauge.
 * 
 */
public interface Pivot {


    /**
     * The background color or fill of the pivot.
     * 
     */
    String backgroundColor();

    /**
     * The background color or fill of the pivot.
     * 
     */
    Pivot backgroundColor(String backgroundColor);

    /**
     * The border or stroke color of the pivot. In able to change this, the borderWidth must also be set to something other than the default 0.
     * 
     */
    String borderColor();

    /**
     * The border or stroke color of the pivot. In able to change this, the borderWidth must also be set to something other than the default 0.
     * 
     */
    Pivot borderColor(String borderColor);

    /**
     * The border or stroke width of the pivot.
     * 
     */
    double borderWidth();

    /**
     * The border or stroke width of the pivot.
     * 
     */
    Pivot borderWidth(double borderWidth);

    /**
     * The pixel radius of the pivot.
     * 
     */
    double radius();

    /**
     * The pixel radius of the pivot.
     * 
     */
    Pivot radius(double radius);

    String getFieldAsJsonObject(String fieldName);

    Pivot setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Pivot setFunctionAsString(String fieldName, String functionAsString);

}
