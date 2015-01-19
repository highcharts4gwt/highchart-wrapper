
package com.github.highcharts4gwt.model.highcharts.object.mock;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.object.api.Series;

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
