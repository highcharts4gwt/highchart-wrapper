
package com.github.highcharts4gwt.model.highcharts.object.api;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.object.api.Chart;

public interface Series {


    String name();

    boolean selected();

    String type();

    boolean visible();

    Chart chart();

    Axis xAxis();

    Axis yAxis();

}
