
package com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.states;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.states.hover.Halo;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.states.hover.Marker;


/**
 * Options for the hovered series
 * 
 */
public interface Hover {


    /**
     * Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the legend.			.
     * 
     */
    boolean enabled();

    /**
     * Enable separate styles for the hovered series to visualize that the user hovers either the series itself or the legend.			.
     * 
     */
    Hover enabled(boolean enabled);

    /**
     * Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice in pie charts. By default the halo is filled by the current point or series color with an opacity of 0.25. The halo can be disabled by setting the <code>halo</code> option to <code>false</code>.
     * 
     */
    Halo halo();

    /**
     * Options for the halo appearing around the hovered point in line-type series as well as outside the hovered slice in pie charts. By default the halo is filled by the current point or series color with an opacity of 0.25. The halo can be disabled by setting the <code>halo</code> option to <code>false</code>.
     * 
     */
    Hover halo(Halo halo);

    /**
     * Pixel with of the graph line.
     * 
     */
    double lineWidth();

    /**
     * Pixel with of the graph line.
     * 
     */
    Hover lineWidth(double lineWidth);

    /**
     * The additional line width for the graph of a hovered series.
     * 
     */
    double lineWidthPlus();

    /**
     * The additional line width for the graph of a hovered series.
     * 
     */
    Hover lineWidthPlus(double lineWidthPlus);

    /**
     * 
     */
    Marker marker();

    /**
     * 
     */
    Hover marker(Marker marker);

    String getFieldAsJsonObject(String fieldName);

    Hover setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Hover setFunctionAsString(String fieldName, String functionAsString);

}
