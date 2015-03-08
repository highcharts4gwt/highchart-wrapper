
package com.github.highcharts4gwt.model.highcharts.option.api;



/**
 * Highchart by default puts a credits label in the lower right corner of the chart.
 * 		This can be changed using these options.
 * 
 */
public interface Credits {


    /**
     * Whether to show the credits text.
     * 
     */
    boolean enabled();

    /**
     * Whether to show the credits text.
     * 
     */
    Credits enabled(boolean enabled);

    /**
     * The URL for the credits label.
     * 
     */
    String href();

    /**
     * The URL for the credits label.
     * 
     */
    Credits href(String href);

    /**
     * Position configuration for the credits label. Supported properties are  <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>. Defaults to 
     * <pre>position: {
     * 	align: 'right',
     * 	x: -10,
     * 	verticalAlign: 'bottom',
     * 	y: -5
     * }</pre>
     * 
     */
    String position();

    /**
     * Position configuration for the credits label. Supported properties are  <code>align</code>, <code>verticalAlign</code>, <code>x</code> and <code>y</code>. Defaults to 
     * <pre>position: {
     * 	align: 'right',
     * 	x: -10,
     * 	verticalAlign: 'bottom',
     * 	y: -5
     * }</pre>
     * 
     */
    Credits position(String positionAsJsonString);

    /**
     * CSS styles for the credits label. Defaults to:
     * <pre>style: {
     * 	cursor: 'pointer',
     * 	color: '#909090',
     * 	fontSize: '10px'
     * 
     * }</pre>
     * 
     */
    String style();

    /**
     * CSS styles for the credits label. Defaults to:
     * <pre>style: {
     * 	cursor: 'pointer',
     * 	color: '#909090',
     * 	fontSize: '10px'
     * 
     * }</pre>
     * 
     */
    Credits style(String styleAsJsonString);

    /**
     * The text for the credits label.
     * 
     */
    String text();

    /**
     * The text for the credits label.
     * 
     */
    Credits text(String text);

    String getFieldAsJsonObject(String fieldName);

    Credits setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
