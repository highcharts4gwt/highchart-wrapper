
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area;



/**
 * An array defining zones within a series.
 * 
 */
public interface Zone {


    /**
     * Defines the color of the series.
     * 
     */
    String color();

    /**
     * Defines the color of the series.
     * 
     */
    Zone color(String color);

    /**
     * A name for the dash style to use for the graph.
     * 
     */
    String dashStyle();

    /**
     * A name for the dash style to use for the graph.
     * 
     */
    Zone dashStyle(String dashStyle);

    /**
     * Defines the fill color for the series (in area type series)
     * 
     */
    String fillColor();

    /**
     * Defines the fill color for the series (in area type series)
     * 
     */
    Zone fillColor(String fillColor);

    /**
     * The value up to where the zone extends, if undefined the zones stretches to the last value in the series.
     * 
     */
    double value();

    /**
     * The value up to where the zone extends, if undefined the zones stretches to the last value in the series.
     * 
     */
    Zone value(double value);

    String getFieldAsJsonObject(String fieldName);

    Zone setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Zone setFunctionAsString(String fieldName, String functionAsString);

}
