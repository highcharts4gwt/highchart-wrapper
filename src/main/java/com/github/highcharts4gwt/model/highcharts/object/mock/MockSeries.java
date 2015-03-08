
package com.github.highcharts4gwt.model.highcharts.object.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.object.api.Series;


/**
 * <p>The Series object is the JavaScript representation of each line, area series, pie etc.</p><p>The object can be accessed in a number of ways. All series and point event handlers give a reference to the series object. The <code>chart</code> object has a <code>series</code> property that is a collection of all the chart's series. The <code>point</code> objects also have the same reference.</p><p>Another way to reference the series programmatically is by id. Add an id in the series configuration options, and get the series object by <code>chart.get(id)</code>.</p><p>Configuration options for the series are given in three levels. Options for all series in a chart are given in the <a class="internal" href="#plotOptions.series">plotOptions.series</a> object. Then options for all series of a specific type are given in the plotOptions of that type, for example plotOptions.line. Next, options for one single series are given in <a class="internal" href="#series">the series array</a>.</p>
 * 
 */
public class MockSeries
    implements Series
{

    private String name;
    private boolean selected;
    private String type;
    private boolean visible;
    private Chart chart;
    private Array<Point> data;
    private Axis xAxis;
    private Axis yAxis;

    public String name() {
        return name;
    }

    public boolean selected() {
        return selected;
    }

    public String type() {
        return type;
    }

    public boolean visible() {
        return visible;
    }

    public Chart chart() {
        return chart;
    }

    public Array<Point> data() {
        return data;
    }

    public Axis xAxis() {
        return xAxis;
    }

    public Axis yAxis() {
        return yAxis;
    }

}
