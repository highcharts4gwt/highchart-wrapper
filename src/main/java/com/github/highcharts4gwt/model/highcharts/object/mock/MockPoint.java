
package com.github.highcharts4gwt.model.highcharts.object.mock;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.object.api.Series;


/**
 * <p>The Point object is the JavaScript representation of each data point</p><p>The object can be accessed in a number of ways. In all point event handlers the point object is <code>this</code>. In the <code>series</code> object all the points are accessed by the <code>series.data</code> array.</p><p>Another way to reference the point programmatically is by id. Add an id in the point configuration options, and get the point object by <code>chart.get(id)</code>.</p>
 * 
 */
public class MockPoint
    implements Point
{

    private Series series;
    private double percentage;
    private boolean selected;
    private double x;
    private double y;
    private String categoryAsString;
    private double categoryAsNumber;

    public Series series() {
        return series;
    }

    public double percentage() {
        return percentage;
    }

    public boolean selected() {
        return selected;
    }

    public double x() {
        return x;
    }

    public double y() {
        return y;
    }

    public String categoryAsString() {
        return categoryAsString;
    }

    public double categoryAsNumber() {
        return categoryAsNumber;
    }

}
