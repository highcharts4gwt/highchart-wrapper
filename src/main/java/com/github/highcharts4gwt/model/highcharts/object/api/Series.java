
package com.github.highcharts4gwt.model.highcharts.object.api;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.object.api.Chart;
import com.github.highcharts4gwt.model.highcharts.object.api.Point;

public interface Series {


    String name();

    boolean selected();

    String type();

    boolean visible();

    Chart chart();

    Array<Point> data();

    Axis xAxis();

    Axis yAxis();

}
