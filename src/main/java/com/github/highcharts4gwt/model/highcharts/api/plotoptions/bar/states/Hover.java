
package com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.states;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.states.hover.Halo;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.states.hover.Marker;

public interface Hover {


    boolean enabled();

    Hover enabled(boolean enabled);

    Halo halo();

    Hover halo(Halo halo);

    double lineWidth();

    Hover lineWidth(double lineWidth);

    double lineWidthPlus();

    Hover lineWidthPlus(double lineWidthPlus);

    Marker marker();

    Hover marker(Marker marker);

}
