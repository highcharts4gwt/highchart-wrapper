
package com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.data.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.data.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.data.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.data.RemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.data.SelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.data.UnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.data.UpdateHandler;


/**
 * An array of data points for the series. For the <code>bubble</code> series type, points can be given in the following ways:
 *  <ol>
 *  	<li><p>An array of arrays with 3 or 2 values. In this case, the values correspond to <code>x,y,z</code>. If the first value is a string, it is
 *  	applied as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in which case the inner arrays should be of length 2. Then the <code>x</code> value is automatically calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code> 
 *  	and <code>pointInterval</code> given in the series options.</p>
 * <pre>data: [
 *     [0, 1, 2], 
 *     [1, 5, 5], 
 *     [2, 0, 2]
 * ]</pre></li>
 * 
 * 
 * <li><p>An array of objects with named values. The objects are
 *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<bubble>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
 * 
 * <pre>data: [{
 *     x: 1,
 *     y: 1,
 *     z: 1,
 *     name: "Point2",
 *     color: "#00FF00"
 * }, {
 *     x: 1,
 *     y: 5,
 *     z: 4,
 *     name: "Point1",
 *     color: "#FF00FF"
 * }]</pre></li>
 *  </ol>
 * 
 */
public interface Data {


    /**
     * Individual color for the point. By default the color is pulled from the global <code>colors</code> array.
     * 
     */
    String color();

    /**
     * Individual color for the point. By default the color is pulled from the global <code>colors</code> array.
     * 
     */
    Data color(String color);

    /**
     * Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
     * 
     */
    String dataLabels();

    /**
     * Individual data label for each point. The options are the same as the ones for  <a class="internal" href="#plotOptions.series.dataLabels">plotOptions.series.dataLabels</a>
     * 
     */
    Data dataLabels(String dataLabelsAsJsonString);

    /**
     * The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to use for a drilldown for this point.
     * 
     */
    String drilldown();

    /**
     * The <code>id</code> of a series in the <a href="#drilldown.series">drilldown.series</a> array to use for a drilldown for this point.
     * 
     */
    Data drilldown(String drilldown);

    void addClickHandler(ClickHandler clickHandler);

    void addMouseOutHandler(MouseOutHandler mouseOutHandler);

    void addMouseOverHandler(MouseOverHandler mouseOverHandler);

    void addRemoveHandler(RemoveHandler removeHandler);

    void addSelectHandler(SelectHandler selectHandler);

    void addUnselectHandler(UnselectHandler unselectHandler);

    void addUpdateHandler(UpdateHandler updateHandler);

    /**
     * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
     * 
     */
    String id();

    /**
     * An id for the point. This can be used after render time to get a pointer to the point object through <code>chart.get()</code>.
     * 
     */
    Data id(String id);

    /**
     * <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>
     * 
     * <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
     * 
     */
    String name();

    /**
     * <p>The name of the point as shown in the legend, tooltip, dataLabel etc.</p>
     * 
     * <p>If the <a href="#xAxis.type">xAxis.type</a> is set to <code>category</code>, and no <a href="#xAxis.categories">categories</a> option exists, the category will be pulled from the <code>point.name</code> of the last series defined. For multiple series, best practice however is to define <code>xAxis.categories</code>.</p>
     * 
     */
    Data name(String name);

    /**
     * Whether the data point is selected initially.
     * 
     */
    boolean selected();

    /**
     * Whether the data point is selected initially.
     * 
     */
    Data selected(boolean selected);

    /**
     * The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
     * 
     */
    double x();

    /**
     * The x value of the point. For datetime axes, the X value is the timestamp in milliseconds since 1970.
     * 
     */
    Data x(double x);

    /**
     * The y value of the point.
     * 
     */
    double y();

    /**
     * The y value of the point.
     * 
     */
    Data y(double y);

    /**
     * The size value for each bubble. The bubbles' diameters are computed based on the <code>z</code>, and controlled by series options like <code>minSize</code>, <code>maxSize</code>, <code>sizeBy</code>, <code>zMin</code> and <code>zMax</code>.
     * 
     */
    double z();

    /**
     * The size value for each bubble. The bubbles' diameters are computed based on the <code>z</code>, and controlled by series options like <code>minSize</code>, <code>maxSize</code>, <code>sizeBy</code>, <code>zMin</code> and <code>zMax</code>.
     * 
     */
    Data z(double z);

    String getFieldAsJsonObject(String fieldName);

    Data setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Data setFunctionAsString(String fieldName, String functionAsString);

}
