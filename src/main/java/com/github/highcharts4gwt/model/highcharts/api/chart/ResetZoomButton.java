
package com.github.highcharts4gwt.model.highcharts.api.chart;


public interface ResetZoomButton {


    String position();

    ResetZoomButton position(String positionAsJsonString);

    String relativeTo();

    ResetZoomButton relativeTo(String relativeTo);

    String theme();

    ResetZoomButton theme(String themeAsJsonString);

}
