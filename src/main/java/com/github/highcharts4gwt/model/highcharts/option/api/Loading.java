
package com.github.highcharts4gwt.model.highcharts.option.api;



/**
 * The loading options control the appearance of the loading screen that covers the 
 * 	plot area on chart operations. This screen only appears after an explicit call
 * 	to <code>chart.showLoading()</code>. It is a utility for developers to communicate
 * 	to the end user that something is going on, for example while retrieving new data
 * 	via an XHR connection. The "Loading..." text itself is not part of this configuration
 * 	object, but part of the <code>lang</code> object.
 * 
 */
public interface Loading {


    /**
     * The duration in milliseconds of the fade out effect.
     * 
     */
    double hideDuration();

    /**
     * The duration in milliseconds of the fade out effect.
     * 
     */
    Loading hideDuration(double hideDuration);

    /**
     * CSS styles for the loading label <code>span</code>.
     * 
     */
    String labelStyle();

    /**
     * CSS styles for the loading label <code>span</code>.
     * 
     */
    Loading labelStyle(String labelStyleAsJsonString);

    /**
     * The duration in milliseconds of the fade in effect.
     * 
     */
    double showDuration();

    /**
     * The duration in milliseconds of the fade in effect.
     * 
     */
    Loading showDuration(double showDuration);

    /**
     * CSS styles for the loading screen that covers the plot area. Defaults to:
     * <pre>style: {
     * 	position: 'absolute',
     * 	backgroundColor: 'white',
     * 	opacity: 0.5,
     * 	textAlign: 'center'
     * }</pre>
     * 
     */
    String style();

    /**
     * CSS styles for the loading screen that covers the plot area. Defaults to:
     * <pre>style: {
     * 	position: 'absolute',
     * 	backgroundColor: 'white',
     * 	opacity: 0.5,
     * 	textAlign: 'center'
     * }</pre>
     * 
     */
    Loading style(String styleAsJsonString);

    String getFieldAsJsonObject(String fieldName);

    Loading setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
