
package com.github.highcharts4gwt.model.highcharts.api.plotoptions.area;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.area.marker.States;

public interface Marker {


    boolean enabled();

    Marker enabled(boolean enabled);

    String fillColor();

    Marker fillColor(String fillColor);

    double height();

    Marker height(double height);

    String lineColor();

    Marker lineColor(String lineColor);

    double lineWidth();

    Marker lineWidth(double lineWidth);

    double radius();

    Marker radius(double radius);

    States states();

    Marker states(States states);

    String symbol();

    Marker symbol(String symbol);

    double width();

    Marker width(double width);

}
