
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.pyramid;


public interface Zone {


    String color();

    Zone color(String color);

    String dashStyle();

    Zone dashStyle(String dashStyle);

    String fillColor();

    Zone fillColor(String fillColor);

    double value();

    Zone value(double value);

    String getFieldAsJsonObject(String fieldName);

    Zone setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
