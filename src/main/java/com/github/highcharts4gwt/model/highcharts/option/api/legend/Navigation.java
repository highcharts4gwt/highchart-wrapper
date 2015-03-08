
package com.github.highcharts4gwt.model.highcharts.option.api.legend;



/**
 * Options for the paging or navigation appearing when the legend is overflown. When <a href="#legend.useHTML">legend.useHTML</a> is enabled, navigation is disabled.
 * 
 */
public interface Navigation {


    /**
     * The color for the active up or down arrow in the legend page navigation.
     * 
     */
    String activeColor();

    /**
     * The color for the active up or down arrow in the legend page navigation.
     * 
     */
    Navigation activeColor(String activeColor);

    /**
     * How to animate the pages when navigating up or down. A value of <code>true</code> applies the default navigation given in  the chart.animation option. Additional options can be given as an object containing values for easing and duration.  .
     * 
     */
    boolean animationAsBoolean();

    /**
     * How to animate the pages when navigating up or down. A value of <code>true</code> applies the default navigation given in  the chart.animation option. Additional options can be given as an object containing values for easing and duration.  .
     * 
     */
    Navigation animationAsBoolean(boolean animationAsBoolean);

    /**
     * How to animate the pages when navigating up or down. A value of <code>true</code> applies the default navigation given in  the chart.animation option. Additional options can be given as an object containing values for easing and duration.  .
     * 
     */
    String animationAsJsonString();

    /**
     * How to animate the pages when navigating up or down. A value of <code>true</code> applies the default navigation given in  the chart.animation option. Additional options can be given as an object containing values for easing and duration.  .
     * 
     */
    Navigation animationAsJsonString(String animationAsJsonString);

    /**
     * The pixel size of the up and down arrows in the legend paging navigation.  .
     * 
     */
    double arrowSize();

    /**
     * The pixel size of the up and down arrows in the legend paging navigation.  .
     * 
     */
    Navigation arrowSize(double arrowSize);

    /**
     * The color of the inactive up or down arrow in the legend page navigation.  .
     * 
     */
    String inactiveColor();

    /**
     * The color of the inactive up or down arrow in the legend page navigation.  .
     * 
     */
    Navigation inactiveColor(String inactiveColor);

    /**
     * Text styles for the legend page navigation.
     * 
     */
    String style();

    /**
     * Text styles for the legend page navigation.
     * 
     */
    Navigation style(String styleAsJsonString);

    String getFieldAsJsonObject(String fieldName);

    Navigation setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
