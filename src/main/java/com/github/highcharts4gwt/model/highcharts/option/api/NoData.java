
package com.github.highcharts4gwt.model.highcharts.option.api;



/**
 * Options for displaying a message like "No data to display". This feature requires the file <code>no-data-to-display.js</code> to be loaded in the page. The actual text to display is set in the <a href="#lang.noData">lang.noData</a> option.
 * 
 */
public interface NoData {


    /**
     * An object of additional SVG attributes for the no-data label.
     * 
     */
    String attr();

    /**
     * An object of additional SVG attributes for the no-data label.
     * 
     */
    NoData attr(String attrAsJsonString);

    /**
     * The position of the no-data label, relative to the plot area.
     * 
     */
    String position();

    /**
     * The position of the no-data label, relative to the plot area.
     * 
     */
    NoData position(String positionAsJsonString);

    /**
     * CSS styles for the no-data label.
     * 
     */
    String style();

    /**
     * CSS styles for the no-data label.
     * 
     */
    NoData style(String styleAsJsonString);

    String getFieldAsJsonObject(String fieldName);

    NoData setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    NoData setFunctionAsString(String fieldName, String functionAsString);

}
