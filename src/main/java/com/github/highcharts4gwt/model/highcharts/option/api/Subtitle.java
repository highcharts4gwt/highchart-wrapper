
package com.github.highcharts4gwt.model.highcharts.option.api;


public interface Subtitle {


    String align();

    Subtitle align(String align);

    boolean floating();

    Subtitle floating(boolean floating);

    String style();

    Subtitle style(String styleAsJsonString);

    String text();

    Subtitle text(String text);

    boolean useHTML();

    Subtitle useHTML(boolean useHTML);

    String verticalAlign();

    Subtitle verticalAlign(String verticalAlign);

    double x();

    Subtitle x(double x);

    double y();

    Subtitle y(double y);

    String getFieldAsJsonObject(String fieldName);

    Subtitle setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
