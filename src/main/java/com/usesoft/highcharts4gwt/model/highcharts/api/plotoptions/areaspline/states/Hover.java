
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.states;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.states.hover.Halo;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.areaspline.states.hover.Marker;

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
