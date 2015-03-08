
package com.github.highcharts4gwt.model.highcharts.object.api;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.object.api.Series;


/**
 * <p>The chart object is the JavaScript object representing a single chart in the web page.The pointer to your chart object is returned when a chart is created using the <code>Highcharts.Chart()</code> constructor:</p><pre>var chart1 = new Highcharts.Chart(options);</pre>
 * 
 */
public interface Chart {


    /**
     * An array of the chart's x axes. If only one x axis, it is referenced by <code>chart.xAxis[0]</code>.
     * 
     */
    com.github.highcharts4gwt.model.array.api.Array<Axis> xAxis();

    /**
     * An array of the chart's y axes. If only one y axis, it is referenced by <code>chart.yAxis[0]</code>.
     * 
     */
    com.github.highcharts4gwt.model.array.api.Array<Axis> yAxis();

    /**
     * An array of all the chart's series.
     * 
     */
    com.github.highcharts4gwt.model.array.api.Array<Series> series();

}
