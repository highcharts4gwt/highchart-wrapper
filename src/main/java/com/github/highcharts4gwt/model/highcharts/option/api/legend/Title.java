
package com.github.highcharts4gwt.model.highcharts.option.api.legend;



/**
 * A title to be added on top of the legend.
 * 
 */
public interface Title {


    /**
     * Generic CSS styles for the legend title. Defaults to:
     * <pre>style: {
     *    fontWeight: 'bold'
     * }</pre>
     * 
     */
    String style();

    /**
     * Generic CSS styles for the legend title. Defaults to:
     * <pre>style: {
     *    fontWeight: 'bold'
     * }</pre>
     * 
     */
    Title style(String styleAsJsonString);

    /**
     * A text or HTML string for the title.
     * 
     */
    String text();

    /**
     * A text or HTML string for the title.
     * 
     */
    Title text(String text);

    String getFieldAsJsonObject(String fieldName);

    Title setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Title setFunctionAsString(String fieldName, String functionAsString);

}
