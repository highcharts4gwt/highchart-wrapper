
package com.usesoft.highcharts4gwt.model.highcharts.api;

import com.usesoft.highcharts4gwt.model.highcharts.api.drilldown.DrillUpButton;

public interface Drilldown {


    String activeAxisLabelStyle();

    Drilldown activeAxisLabelStyle(String activeAxisLabelStyleAsJsonString);

    String activeDataLabelStyle();

    Drilldown activeDataLabelStyle(String activeDataLabelStyleAsJsonString);

    DrillUpButton drillUpButton();

    Drilldown drillUpButton(DrillUpButton drillUpButton);

}
