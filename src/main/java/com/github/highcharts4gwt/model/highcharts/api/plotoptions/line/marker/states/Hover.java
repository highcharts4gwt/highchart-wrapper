
package com.github.highcharts4gwt.model.highcharts.api.plotoptions.line.marker.states;


public interface Hover {


    boolean enabled();

    Hover enabled(boolean enabled);

    String fillColor();

    Hover fillColor(String fillColor);

    String lineColor();

    Hover lineColor(String lineColor);

    double lineWidth();

    Hover lineWidth(double lineWidth);

    double lineWidthPlus();

    Hover lineWidthPlus(double lineWidthPlus);

    double radius();

    Hover radius(double radius);

    double radiusPlus();

    Hover radiusPlus(double radiusPlus);

}
