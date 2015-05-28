
package com.github.highcharts4gwt.model.highcharts.option.api.xaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.plotbands.Label;


/**
 * <p>An array of colored bands stretching across the plot area marking an interval on the axis.</p>
 * 
 * <p>In a gauge, a plot band on the Y axis (value axis) will stretch along the perimeter of the gauge.</p>
 * 
 */
public interface PlotBand {


    /**
     * Border color for the plot band. Also requires <code>borderWidth</code> to be set.
     * 
     */
    String borderColor();

    /**
     * Border color for the plot band. Also requires <code>borderWidth</code> to be set.
     * 
     */
    PlotBand borderColor(String borderColor);

    /**
     * Border width for the plot band.  Also requires <code>borderColor</code> to be set.
     * 
     */
    double borderWidth();

    /**
     * Border width for the plot band.  Also requires <code>borderColor</code> to be set.
     * 
     */
    PlotBand borderWidth(double borderWidth);

    /**
     * The color of the plot band.
     * 
     */
    String color();

    /**
     * The color of the plot band.
     * 
     */
    PlotBand color(String color);

    /**
     * The start position of the plot band in axis units.
     * 
     */
    double from();

    /**
     * The start position of the plot band in axis units.
     * 
     */
    PlotBand from(double from);

    /**
     * An id used for identifying the plot band in Axis.removePlotBand.
     * 
     */
    String id();

    /**
     * An id used for identifying the plot band in Axis.removePlotBand.
     * 
     */
    PlotBand id(String id);

    /**
     * Text labels for the plot bands
     * 
     */
    Label label();

    /**
     * Text labels for the plot bands
     * 
     */
    PlotBand label(Label label);

    /**
     * The end position of the plot band in axis units.
     * 
     */
    double to();

    /**
     * The end position of the plot band in axis units.
     * 
     */
    PlotBand to(double to);

    /**
     * The z index of the plot band within the chart, relative to other elements. Using the same z index as another element may give unpredictable results, as the last rendered element will be on top. Values from 0 to 20 make sense.
     * 
     */
    double zIndex();

    /**
     * The z index of the plot band within the chart, relative to other elements. Using the same z index as another element may give unpredictable results, as the last rendered element will be on top. Values from 0 to 20 make sense.
     * 
     */
    PlotBand zIndex(double zIndex);

    String getFieldAsJsonObject(String fieldName);

    PlotBand setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    PlotBand setFunctionAsString(String fieldName, String functionAsString);

}
