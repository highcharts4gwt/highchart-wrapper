
package com.github.highcharts4gwt.model.highcharts.api;


public interface Loading {


    double hideDuration();

    Loading hideDuration(double hideDuration);

    String labelStyle();

    Loading labelStyle(String labelStyleAsJsonString);

    double showDuration();

    Loading showDuration(double showDuration);

    String style();

    Loading style(String styleAsJsonString);

}
