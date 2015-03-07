
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge;


public interface Dial {


    String backgroundColor();

    Dial backgroundColor(String backgroundColor);

    String baseLength();

    Dial baseLength(String baseLength);

    double baseWidth();

    Dial baseWidth(double baseWidth);

    String borderColor();

    Dial borderColor(String borderColor);

    double borderWidth();

    Dial borderWidth(double borderWidth);

    String radius();

    Dial radius(String radius);

    String rearLength();

    Dial rearLength(String rearLength);

    double topWidth();

    Dial topWidth(double topWidth);

    String getFieldAsJsonObject(String fieldName);

    Dial setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
