
package com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame;



/**
 * The side for the frame around a 3D chart.
 * 
 */
public interface Side {


    /**
     * The color of the panel.
     * 
     */
    String color();

    /**
     * The color of the panel.
     * 
     */
    Side color(String color);

    /**
     * The thickness of the panel.
     * 
     */
    double size();

    /**
     * The thickness of the panel.
     * 
     */
    Side size(double size);

    String getFieldAsJsonObject(String fieldName);

    Side setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
