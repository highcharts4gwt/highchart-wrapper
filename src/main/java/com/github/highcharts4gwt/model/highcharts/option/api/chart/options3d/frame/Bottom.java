
package com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame;



/**
 * The bottom of the frame around a 3D chart.
 * 
 */
public interface Bottom {


    /**
     * The color of the panel.
     * 
     */
    String color();

    /**
     * The color of the panel.
     * 
     */
    Bottom color(String color);

    /**
     * The thickness of the panel.
     * 
     */
    double size();

    /**
     * The thickness of the panel.
     * 
     */
    Bottom size(double size);

    String getFieldAsJsonObject(String fieldName);

    Bottom setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
