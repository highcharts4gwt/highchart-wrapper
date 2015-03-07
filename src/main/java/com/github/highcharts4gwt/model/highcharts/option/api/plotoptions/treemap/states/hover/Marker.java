
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.states.hover;


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

    String symbol();

    Marker symbol(String symbol);

    double width();

    Marker width(double width);

    String getFieldAsJsonObject(String fieldName);

    Marker setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
