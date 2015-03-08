
package com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame;



/**
 * Defines the back panel of the frame around 3D charts.
 * 
 */
public interface Back {


    /**
     * The color of the panel.
     * 
     */
    String color();

    /**
     * The color of the panel.
     * 
     */
    Back color(String color);

    /**
     * Thickness of the panel.
     * 
     */
    double size();

    /**
     * Thickness of the panel.
     * 
     */
    Back size(double size);

    String getFieldAsJsonObject(String fieldName);

    Back setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
