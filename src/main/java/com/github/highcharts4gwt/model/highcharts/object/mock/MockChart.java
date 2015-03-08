
package com.github.highcharts4gwt.model.highcharts.object.mock;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.object.api.Series;


/**
 * <p>The chart object is the JavaScript object representing a single chart in the web page.The pointer to your chart object is returned when a chart is created using the <code>Highcharts.Chart()</code> constructor:</p><pre>var chart1 = new Highcharts.Chart(options);</pre>
 * 
 */
public class MockChart
    implements Chart
{

    private com.github.highcharts4gwt.model.array.api.Array<Axis> xAxis;
    private com.github.highcharts4gwt.model.array.api.Array<Axis> yAxis;
    private com.github.highcharts4gwt.model.array.api.Array<Series> series;

    public com.github.highcharts4gwt.model.array.api.Array<Axis> xAxis() {
        return xAxis;
    }

    public com.github.highcharts4gwt.model.array.api.Array<Axis> yAxis() {
        return yAxis;
    }

    public com.github.highcharts4gwt.model.array.api.Array<Series> series() {
        return series;
    }

}
