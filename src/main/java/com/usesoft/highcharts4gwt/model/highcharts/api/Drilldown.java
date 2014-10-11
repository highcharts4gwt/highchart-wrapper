
package com.usesoft.highcharts4gwt.model.highcharts.api;

import com.usesoft.highcharts4gwt.model.highcharts.api.drilldown.DrillUpButton;

public interface Drilldown {


    String activeAxisLabelStyle();

    Drilldown activeAxisLabelStyle(String activeAxisLabelStyle);

    String activeDataLabelStyle();

    Drilldown activeDataLabelStyle(String activeDataLabelStyle);

    DrillUpButton drillUpButton();

    Drilldown drillUpButton(DrillUpButton drillUpButton);

}
