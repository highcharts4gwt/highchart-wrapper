
package com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar;

import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.data.DataClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.data.DataMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.data.DataMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.data.DataRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.data.DataSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.data.DataUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.data.DataUpdateHandler;


/**
 * An array of data points for the series. For the <code>errorbar</code> series type, points can be given in the following ways:
 *  <ol>
 *  	<li><p>An array of arrays with 3 or 2 values. In this case, the values correspond to <code>x,low,high</code>. If the first value is a string, it is
 *  	applied as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in which case the inner arrays should be of length 2. Then the <code>x</code> value is automatically calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code> 
 *  	and <code>pointInterval</code> given in the series options.</p>
 * <pre>data: [
 *     [0, 10, 2], 
 *     [1, 1, 8], 
 *     [2, 4, 5]
 * ]</pre></li>
 * 
 * 
 * <li><p>An array of objects with named values. The objects are
 *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<errorbar>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
 * 
 * <pre>data: [{
 *     x: 1,
 *     low: 0,
 *     high: 0,
 *     name: "Point2",
 *     color: "#00FF00"
 * }, {
 *     x: 1,
 *     low: 5,
 *     high: 5,
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

    void addDataClickHandler(DataClickHandler dataClickHandler);

    void addDataMouseOutHandler(DataMouseOutHandler dataMouseOutHandler);

    void addDataMouseOverHandler(DataMouseOverHandler dataMouseOverHandler);

    void addDataRemoveHandler(DataRemoveHandler dataRemoveHandler);

    void addDataSelectHandler(DataSelectHandler dataSelectHandler);

    void addDataUnselectHandler(DataUnselectHandler dataUnselectHandler);

    void addDataUpdateHandler(DataUpdateHandler dataUpdateHandler);

    /**
     * The high or maximum value for each data point.
     * 
     */
    double high();

    /**
     * The high or maximum value for each data point.
     * 
     */
    Data high(double high);

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
     * The low or minimum value for each data point.
     * 
     */
    double low();

    /**
     * The low or minimum value for each data point.
     * 
     */
    Data low(double low);

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

    String getFieldAsJsonObject(String fieldName);

    Data setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Data setFunctionAsString(String fieldName, String functionAsString);

}
