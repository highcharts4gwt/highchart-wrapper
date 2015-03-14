
package com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d;

import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Back;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Bottom;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame.Side;


/**
 * Provides the option to draw a frame around the charts by defining a bottom, front and back panel.
 * 
 */
public interface Frame {


    /**
     * Defines the back panel of the frame around 3D charts.
     * 
     */
    Back back();

    /**
     * Defines the back panel of the frame around 3D charts.
     * 
     */
    Frame back(Back back);

    /**
     * The bottom of the frame around a 3D chart.
     * 
     */
    Bottom bottom();

    /**
     * The bottom of the frame around a 3D chart.
     * 
     */
    Frame bottom(Bottom bottom);

    /**
     * The side for the frame around a 3D chart.
     * 
     */
    Side side();

    /**
     * The side for the frame around a 3D chart.
     * 
     */
    Frame side(Side side);

    String getFieldAsJsonObject(String fieldName);

    Frame setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Frame setFunctionAsString(String fieldName, String functionAsString);

}
