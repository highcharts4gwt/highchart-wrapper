
package com.github.highcharts4gwt.model.highcharts.option.api.chart;

import com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.Frame;


/**
 * Options to render charts in 3 dimensions. This feature requires <code>highcharts-3d.js</code>, found in the download package or online at <a href="http://code.highcharts.com/highcharts-3d.js">code.highcharts.com/highcharts-3d.js</a>.
 * 
 */
public interface Options3d {


    /**
     * One of the two rotation angles for the chart.
     * 
     */
    double alpha();

    /**
     * One of the two rotation angles for the chart.
     * 
     */
    Options3d alpha(double alpha);

    /**
     * One of the two rotation angles for the chart.
     * 
     */
    double beta();

    /**
     * One of the two rotation angles for the chart.
     * 
     */
    Options3d beta(double beta);

    /**
     * The total depth of the chart.
     * 
     */
    double depth();

    /**
     * The total depth of the chart.
     * 
     */
    Options3d depth(double depth);

    /**
     * Wether to render the chart using the 3D functionality.
     * 
     */
    boolean enabled();

    /**
     * Wether to render the chart using the 3D functionality.
     * 
     */
    Options3d enabled(boolean enabled);

    /**
     * Provides the option to draw a frame around the charts by defining a bottom, front and back panel.
     * 
     */
    Frame frame();

    /**
     * Provides the option to draw a frame around the charts by defining a bottom, front and back panel.
     * 
     */
    Options3d frame(Frame frame);

    /**
     * Defines the distance the viewer is standing in front of the chart, this setting is important to calculate the perspective effect in column and scatter charts.
     * It is not used for 3D pie charts.
     * 
     */
    double viewDistance();

    /**
     * Defines the distance the viewer is standing in front of the chart, this setting is important to calculate the perspective effect in column and scatter charts.
     * It is not used for 3D pie charts.
     * 
     */
    Options3d viewDistance(double viewDistance);

    String getFieldAsJsonObject(String fieldName);

    Options3d setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
