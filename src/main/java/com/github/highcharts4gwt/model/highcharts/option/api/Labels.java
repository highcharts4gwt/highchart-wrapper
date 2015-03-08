
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.highcharts.option.api.labels.Item;


/**
 * HTML labels that can be positioned anywhere in the chart area.
 * 
 */
public interface Labels {


    /**
     * A HTML label that can be positioned anywhere in the chart area.
     * 
     */
    Array<Item> items();

    /**
     * A HTML label that can be positioned anywhere in the chart area.
     * 
     */
    Labels items(Array<Item> items);

    /**
     * Shared CSS styles for all labels. Defaults to:
     * <pre>style: {
     * 	color: '#3E576F'
     * }</pre>
     * 
     */
    String style();

    /**
     * Shared CSS styles for all labels. Defaults to:
     * <pre>style: {
     * 	color: '#3E576F'
     * }</pre>
     * 
     */
    Labels style(String styleAsJsonString);

    String getFieldAsJsonObject(String fieldName);

    Labels setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
