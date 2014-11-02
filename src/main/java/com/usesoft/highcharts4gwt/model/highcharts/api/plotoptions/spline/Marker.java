
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.spline.marker.States;

public interface Marker {


    boolean enabled();

    Marker enabled(boolean enabled);

    String fillColor();

    Marker fillColor(String fillColor);

    Number height();

    Marker height(Number height);

    String lineColor();

    Marker lineColor(String lineColor);

    Number lineWidth();

    Marker lineWidth(Number lineWidth);

    Number radius();

    Marker radius(Number radius);

    States states();

    Marker states(States states);

    String symbol();

    Marker symbol(String symbol);

    Number width();

    Marker width(Number width);

}
