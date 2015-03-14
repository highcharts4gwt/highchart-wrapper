
package com.github.highcharts4gwt.model.highcharts.option.api.chart;



/**
 * The button that appears after a selection zoom, allowing the user to reset zoom.
 * 
 */
public interface ResetZoomButton {


    /**
     * The position of the button. This is an object that can hold the properties <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>.
     * 
     */
    String position();

    /**
     * The position of the button. This is an object that can hold the properties <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>.
     * 
     */
    ResetZoomButton position(String positionAsJsonString);

    /**
     * What frame the button should be placed related to. Can be either "plot" or "chart".
     * 
     */
    String relativeTo();

    /**
     * What frame the button should be placed related to. Can be either "plot" or "chart".
     * 
     */
    ResetZoomButton relativeTo(String relativeTo);

    /**
     * A collection of attributes for the button. The object takes SVG attributes like  <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the border radius. The theme also supports <code>style</code>, a collection of CSS properties for the text. Equivalent attributes for the hover state are given in <code>theme.states.hover</code>.
     * 
     */
    String theme();

    /**
     * A collection of attributes for the button. The object takes SVG attributes like  <code>fill</code>, <code>stroke</code>, <code>stroke-width</code> or <code>r</code>, the border radius. The theme also supports <code>style</code>, a collection of CSS properties for the text. Equivalent attributes for the hover state are given in <code>theme.states.hover</code>.
     * 
     */
    ResetZoomButton theme(String themeAsJsonString);

    String getFieldAsJsonObject(String fieldName);

    ResetZoomButton setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    ResetZoomButton setFunctionAsString(String fieldName, String functionAsString);

}
