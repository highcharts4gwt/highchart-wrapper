
package com.github.highcharts4gwt.model.highcharts.option.api.labels;



/**
 * A HTML label that can be positioned anywhere in the chart area.
 * 
 */
public interface Item {


    /**
     * Inner HTML or text for the label.
     * 
     */
    String html();

    /**
     * Inner HTML or text for the label.
     * 
     */
    Item html(String html);

    /**
     * CSS styles for each label. To position the label, use left and top like this:
     * <pre>style: {
     * 	left: '100px',
     * 	top: '100px'
     * }</pre>
     * 
     */
    String style();

    /**
     * CSS styles for each label. To position the label, use left and top like this:
     * <pre>style: {
     * 	left: '100px',
     * 	top: '100px'
     * }</pre>
     * 
     */
    Item style(String styleAsJsonString);

    String getFieldAsJsonObject(String fieldName);

    Item setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
