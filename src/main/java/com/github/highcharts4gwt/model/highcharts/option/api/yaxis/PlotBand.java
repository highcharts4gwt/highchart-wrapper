
package com.github.highcharts4gwt.model.highcharts.option.api.yaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.plotbands.Label;


/**
 * An array of objects defining plot bands on the Y axis.
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
     * In a gauge chart, this option determines the inner radius of the plot band that stretches along the perimeter. It can be given as a percentage string, like <code>"100%"</code>, or as a pixel number, like <code>100</code>. By default, the inner radius is controlled by the <a href="#yAxis.plotBands.thickness">thickness</a> option.
     * 
     */
    double innerRadiusAsNumber();

    /**
     * In a gauge chart, this option determines the inner radius of the plot band that stretches along the perimeter. It can be given as a percentage string, like <code>"100%"</code>, or as a pixel number, like <code>100</code>. By default, the inner radius is controlled by the <a href="#yAxis.plotBands.thickness">thickness</a> option.
     * 
     */
    PlotBand innerRadiusAsNumber(double innerRadiusAsNumber);

    /**
     * In a gauge chart, this option determines the inner radius of the plot band that stretches along the perimeter. It can be given as a percentage string, like <code>"100%"</code>, or as a pixel number, like <code>100</code>. By default, the inner radius is controlled by the <a href="#yAxis.plotBands.thickness">thickness</a> option.
     * 
     */
    String innerRadiusAsString();

    /**
     * In a gauge chart, this option determines the inner radius of the plot band that stretches along the perimeter. It can be given as a percentage string, like <code>"100%"</code>, or as a pixel number, like <code>100</code>. By default, the inner radius is controlled by the <a href="#yAxis.plotBands.thickness">thickness</a> option.
     * 
     */
    PlotBand innerRadiusAsString(String innerRadiusAsString);

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
     * In a gauge chart, this option determines the outer radius of the plot band that stretches along the perimeter. It can be given as a percentage string, like <code>"100%"</code>, or as a pixel number, like <code>100</code>.
     * 
     */
    double outerRadiusAsNumber();

    /**
     * In a gauge chart, this option determines the outer radius of the plot band that stretches along the perimeter. It can be given as a percentage string, like <code>"100%"</code>, or as a pixel number, like <code>100</code>.
     * 
     */
    PlotBand outerRadiusAsNumber(double outerRadiusAsNumber);

    /**
     * In a gauge chart, this option determines the outer radius of the plot band that stretches along the perimeter. It can be given as a percentage string, like <code>"100%"</code>, or as a pixel number, like <code>100</code>.
     * 
     */
    String outerRadiusAsString();

    /**
     * In a gauge chart, this option determines the outer radius of the plot band that stretches along the perimeter. It can be given as a percentage string, like <code>"100%"</code>, or as a pixel number, like <code>100</code>.
     * 
     */
    PlotBand outerRadiusAsString(String outerRadiusAsString);

    /**
     * In a gauge chart, this option sets the width of the plot band stretching along the perimeter. It can be given as a percentage string, like <code>"10%"</code>, or as a pixel number, like <code>10</code>. The default value 10 is the same as the default <a href="#yAxis.tickLength">tickLength</a>, thus making the plot band act as a background for the tick markers.
     * 
     */
    double thicknessAsNumber();

    /**
     * In a gauge chart, this option sets the width of the plot band stretching along the perimeter. It can be given as a percentage string, like <code>"10%"</code>, or as a pixel number, like <code>10</code>. The default value 10 is the same as the default <a href="#yAxis.tickLength">tickLength</a>, thus making the plot band act as a background for the tick markers.
     * 
     */
    PlotBand thicknessAsNumber(double thicknessAsNumber);

    /**
     * In a gauge chart, this option sets the width of the plot band stretching along the perimeter. It can be given as a percentage string, like <code>"10%"</code>, or as a pixel number, like <code>10</code>. The default value 10 is the same as the default <a href="#yAxis.tickLength">tickLength</a>, thus making the plot band act as a background for the tick markers.
     * 
     */
    String thicknessAsString();

    /**
     * In a gauge chart, this option sets the width of the plot band stretching along the perimeter. It can be given as a percentage string, like <code>"10%"</code>, or as a pixel number, like <code>10</code>. The default value 10 is the same as the default <a href="#yAxis.tickLength">tickLength</a>, thus making the plot band act as a background for the tick markers.
     * 
     */
    PlotBand thicknessAsString(String thicknessAsString);

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
