
package com.github.highcharts4gwt.model.highcharts.object.api;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.object.api.Series;

public interface Chart {


    com.github.highcharts4gwt.model.array.api.Array<Axis> xAxis();

    com.github.highcharts4gwt.model.array.api.Array<Axis> yAxis();

    com.github.highcharts4gwt.model.array.api.Array<Series> series();

}
