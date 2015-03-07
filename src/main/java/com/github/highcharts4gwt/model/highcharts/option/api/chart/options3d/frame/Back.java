
package com.github.highcharts4gwt.model.highcharts.option.api.chart.options3d.frame;


public interface Back {


    String color();

    Back color(String color);

    double size();

    Back size(double size);

    String getFieldAsJsonObject(String fieldName);

    Back setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
