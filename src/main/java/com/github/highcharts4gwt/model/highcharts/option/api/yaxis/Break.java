
package com.github.highcharts4gwt.model.highcharts.option.api.yaxis;


public interface Break {


    double breakSize();

    Break breakSize(double breakSize);

    double from();

    Break from(double from);

    double repeat();

    Break repeat(double repeat);

    double to();

    Break to(double to);

    String getFieldAsJsonObject(String fieldName);

    Break setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
