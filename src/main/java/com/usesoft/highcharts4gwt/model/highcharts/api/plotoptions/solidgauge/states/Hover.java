
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.states;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.solidgauge.states.hover.Marker;

public interface Hover {


    boolean enabled();

    Hover enabled(boolean enabled);

    Number lineWidth();

    Hover lineWidth(Number lineWidth);

    Number lineWidthPlus();

    Hover lineWidthPlus(Number lineWidthPlus);

    Marker marker();

    Hover marker(Marker marker);

}