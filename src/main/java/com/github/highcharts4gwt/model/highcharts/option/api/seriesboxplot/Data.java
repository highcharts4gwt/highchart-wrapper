
package com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.RemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.SelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.UnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.UpdateHandler;


/**
 * An array of data points for the series. For the <code>boxplot</code> series type, points can be given in the following ways:
 *  <ol>
 *  	<li><p>An array of arrays with 6 or 5 values. In this case, the values correspond to <code>x,low,q1,median,q3,high</code>. If the first value is a string, it is
 *  	applied as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in which case the inner arrays should be of length 5. Then the <code>x</code> value is automatically calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code> 
 *  	and <code>pointInterval</code> given in the series options.</p>
 * <pre>data: [
 *     [0, 3, 0, 10, 3, 5], 
 *     [1, 7, 8, 7, 2, 9], 
 *     [2, 6, 9, 5, 1, 3]
 * ]</pre></li>
 * 
 * 
 * <li><p>An array of objects with named values. The objects are
 *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<boxplot>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
 * 
 * <pre>data: [{
 *     x: 1,
 *     low: 4,
 *     q1: 9,
 *     median: 9,
 *     q3: 1,
 *     high: 10,
 *     name: "Point2",
 *     color: "#00FF00"
 * }, {
 *     x: 1,
 *     low: 5,
 *     q1: 7,
 *     median: 3,
 *     q3: 6,
 *     high: 2,
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
     * The <code>high</code> value for each data point, signifying the highest value in the sample set. The top whisker is drawn here.
     * 
     */
    double high();

    /**
     * The <code>high</code> value for each data point, signifying the highest value in the sample set. The top whisker is drawn here.
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
     * The <code>low</code> value for each data point, signifying the lowest value in the sample set. The bottom whisker is drawn here.
     * 
     */
    double low();

    /**
     * The <code>low</code> value for each data point, signifying the lowest value in the sample set. The bottom whisker is drawn here.
     * 
     */
    Data low(double low);

    /**
     * The median for each data point. This is drawn as a line through the middle area of the box.
     * 
     */
    double median();

    /**
     * The median for each data point. This is drawn as a line through the middle area of the box.
     * 
     */
    Data median(double median);

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
     * The lower quartile for each data point. This is the bottom of the box.
     * 
     */
    double q1();

    /**
     * The lower quartile for each data point. This is the bottom of the box.
     * 
     */
    Data q1(double q1);

    /**
     * The higher quartile for each data point. This is the top of the box.
     * 
     */
    double q3();

    /**
     * The higher quartile for each data point. This is the top of the box.
     * 
     */
    Data q3(double q3);

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

    String getFieldAsJsonObject(String fieldName);

    Data setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Data setFunctionAsString(String fieldName, String functionAsString);

}
