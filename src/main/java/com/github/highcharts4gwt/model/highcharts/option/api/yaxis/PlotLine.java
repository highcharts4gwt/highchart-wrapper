
package com.github.highcharts4gwt.model.highcharts.option.api.yaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.plotlines.Label;


/**
 * An array of objects representing plot lines on the X axis
 * 
 */
public interface PlotLine {


    /**
     * The color of the line.
     * 
     */
    String color();

    /**
     * The color of the line.
     * 
     */
    PlotLine color(String color);

    /**
     * The dashing or dot style for the plot line. For possible values see <a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this overview</a>.
     * 
     */
    String dashStyle();

    /**
     * The dashing or dot style for the plot line. For possible values see <a href="http://jsfiddle.net/gh/get/jquery/1.7.1/highslide-software/highcharts.com/tree/master/samples/highcharts/plotoptions/series-dashstyle-all/">this overview</a>.
     * 
     */
    PlotLine dashStyle(String dashStyle);

    /**
     * An id used for identifying the plot line in Axis.removePlotLine.
     * 
     */
    String id();

    /**
     * An id used for identifying the plot line in Axis.removePlotLine.
     * 
     */
    PlotLine id(String id);

    /**
     * Text labels for the plot bands
     * 
     */
    Label label();

    /**
     * Text labels for the plot bands
     * 
     */
    PlotLine label(Label label);

    /**
     * The position of the line in axis units.
     * 
     */
    double value();

    /**
     * The position of the line in axis units.
     * 
     */
    PlotLine value(double value);

    /**
     * The width or thickness of the plot line.
     * 
     */
    double width();

    /**
     * The width or thickness of the plot line.
     * 
     */
    PlotLine width(double width);

    /**
     * The z index of the plot line within the chart.
     * 
     */
    double zIndex();

    /**
     * The z index of the plot line within the chart.
     * 
     */
    PlotLine zIndex(double zIndex);

    String getFieldAsJsonObject(String fieldName);

    PlotLine setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
