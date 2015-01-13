
package com.github.highcharts4gwt.model.highcharts.object.api;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;

public interface Point {


    Series series();

    double percentage();

    boolean selected();

    double x();

    double y();

    String categoryAsString();

    double categoryAsNumber();

}
