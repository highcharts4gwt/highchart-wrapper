
package com.github.highcharts4gwt.model.highcharts.object.api;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.object.api.Point;


/**
 * <p>The Series object is the JavaScript representation of each line, area series, pie etc.</p><p>The object can be accessed in a number of ways. All series and point event handlers give a reference to the series object. The <code>chart</code> object has a <code>series</code> property that is a collection of all the chart's series. The <code>point</code> objects also have the same reference.</p><p>Another way to reference the series programmatically is by id. Add an id in the series configuration options, and get the series object by <code>chart.get(id)</code>.</p><p>Configuration options for the series are given in three levels. Options for all series in a chart are given in the <a class="internal" href="#plotOptions.series">plotOptions.series</a> object. Then options for all series of a specific type are given in the plotOptions of that type, for example plotOptions.line. Next, options for one single series are given in <a class="internal" href="#series">the series array</a>.</p>
 * 
 */
public interface Series {


    /**
     * The series' name as given in the options.
     * 
     */
    String name();

    /**
     * Read only. The series' selected state as set by <code>series.select()</code>.
     * 
     */
    boolean selected();

    /**
     * Read only. The series' type, like "line", "area" etc.
     * 
     */
    String type();

    /**
     * Read only. The series' visibility state as set by <code>series.show()</code>, <code>series.hide()</code>, or the initial configuration.
     * 
     */
    boolean visible();

    /**
     * Read only. The chart that the series belongs to.
     * 
     */
    Chart chart();

    /**
     * Read only. An array with the series' data point objects.
     * 
     */
    Array<Point> data();

    /**
     * Read only. The unique xAxis object associated with the series.
     * 
     */
    Axis xAxis();

    /**
     * Read only. The unique yAxis object associated with the series.
     * 
     */
    Axis yAxis();

}
