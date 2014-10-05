
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.states;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.states.hover.Halo;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid.states.hover.Marker;

public interface Hover {


    boolean enabled();

    Hover enabled(boolean enabled);

    Halo halo();

    Hover halo(Halo halo);

    Number lineWidth();

    Hover lineWidth(Number lineWidth);

    Number lineWidthPlus();

    Hover lineWidthPlus(Number lineWidthPlus);

    Marker marker();

    Hover marker(Marker marker);

}
