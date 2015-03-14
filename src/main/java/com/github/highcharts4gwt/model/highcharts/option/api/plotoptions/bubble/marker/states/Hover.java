
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.marker.states;



/**
 * 
 */
public interface Hover {


    /**
     * Enable or disable the point marker.
     * 
     */
    boolean enabled();

    /**
     * Enable or disable the point marker.
     * 
     */
    Hover enabled(boolean enabled);

    /**
     * The fill color of the marker in hover state.
     * 
     */
    String fillColor();

    /**
     * The fill color of the marker in hover state.
     * 
     */
    Hover fillColor(String fillColor);

    /**
     * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
     * 
     */
    String lineColor();

    /**
     * The color of the point marker's outline. When <code>null</code>, the series' or point's color is used.
     * 
     */
    Hover lineColor(String lineColor);

    /**
     * The width of the point marker's outline.
     * 
     */
    double lineWidth();

    /**
     * The width of the point marker's outline.
     * 
     */
    Hover lineWidth(double lineWidth);

    /**
     * The additional line width for a hovered point.
     * 
     */
    double lineWidthPlus();

    /**
     * The additional line width for a hovered point.
     * 
     */
    Hover lineWidthPlus(double lineWidthPlus);

    /**
     * The radius of the point marker. In hover state, it defaults to the normal state's radius + 2 as per the <a href="#plotOptions.series.marker.states.hover.radiusPlus">radiusPlus</a> option.
     * 
     */
    double radius();

    /**
     * The radius of the point marker. In hover state, it defaults to the normal state's radius + 2 as per the <a href="#plotOptions.series.marker.states.hover.radiusPlus">radiusPlus</a> option.
     * 
     */
    Hover radius(double radius);

    /**
     * The number of pixels to increase the radius of the hovered point.
     * 
     */
    double radiusPlus();

    /**
     * The number of pixels to increase the radius of the hovered point.
     * 
     */
    Hover radiusPlus(double radiusPlus);

    String getFieldAsJsonObject(String fieldName);

    Hover setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Hover setFunctionAsString(String fieldName, String functionAsString);

}
