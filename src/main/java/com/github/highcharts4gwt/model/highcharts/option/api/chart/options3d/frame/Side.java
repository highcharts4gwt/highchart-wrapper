
package com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame;


public interface Side {


    String color();

    Side color(String color);

    double size();

    Side size(double size);

    String getFieldAsJsonObject(String fieldName);

    Side setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
