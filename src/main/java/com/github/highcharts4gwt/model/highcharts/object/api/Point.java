
package com.github.highcharts4gwt.model.highcharts.object.api;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;


/**
 * <p>The Point object is the JavaScript representation of each data point</p><p>The object can be accessed in a number of ways. In all point event handlers the point object is <code>this</code>. In the <code>series</code> object all the points are accessed by the <code>series.data</code> array.</p><p>Another way to reference the point programmatically is by id. Add an id in the point configuration options, and get the point object by <code>chart.get(id)</code>.</p>
 * 
 */
public interface Point {


    /**
     * The series object associated with the point.
     * 
     */
    Series series();

    /**
     * The percentage for points in a stacked series or pies.
     * 
     */
    double percentage();

    /**
     * Whether the point is selected or not.
     * 
     */
    boolean selected();

    /**
     * The x value for the point.
     * 
     */
    double x();

    /**
     * The y value for the point.
     * 
     */
    double y();

    /**
     * For categorized axes this property holds the category name for the point. For other axis it holds the x value.
     * 
     */
    String categoryAsString();

    /**
     * For categorized axes this property holds the category name for the point. For other axis it holds the x value.
     * 
     */
    double categoryAsNumber();

}
