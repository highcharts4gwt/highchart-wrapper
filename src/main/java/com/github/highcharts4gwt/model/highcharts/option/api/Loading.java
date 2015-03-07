
package com.github.highcharts4gwt.model.highcharts.option.api;


public interface Loading {


    double hideDuration();

    Loading hideDuration(double hideDuration);

    String labelStyle();

    Loading labelStyle(String labelStyleAsJsonString);

    double showDuration();

    Loading showDuration(double showDuration);

    String style();

    Loading style(String styleAsJsonString);

    String getFieldAsJsonObject(String fieldName);

    Loading setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
