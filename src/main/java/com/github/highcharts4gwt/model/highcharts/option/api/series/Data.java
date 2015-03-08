
package com.github.highcharts4gwt.model.highcharts.option.api.series;

import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.DataUpdateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.series.data.Marker;


/**
 * An array of data points for the series. The points can be given in three ways:
 *  <ol>
 *  	<li>An array of numerical values. In this case, the numerical values will 
 *  	be interpreted as y values, and x values will be automatically calculated,
 *  	either starting at 0 and incrementing by 1, or from <code>pointStart</code> 
 *  	and <code>pointInterval</code> given in the plotOptions. If the axis is
 *  	has categories, these will be used. This option is not available for range series. Example:
 * <pre>data: [0, 5, 3, 5]</pre>
 *  	</li>
 *  	<li><p>An array of arrays with two values. In this case, the first value is the
 *  	x value and the second is the y value. If the first value is a string, it is
 *  	applied as the name of the point, and the x value is incremented following
 *  	the above rules.</p>
 * <p>For range series, the arrays will be interpreted as <code>[x, low, high]</code>. In this cases, the X value can be skipped altogether to make use of <code>pointStart</code> and <code>pointRange</code>.</p>
 * 
 *  Example:
 * <pre>data: [[5, 2], [6, 3], [8, 2]]</pre></li>
 * 
 * 
 * <li><p>An array of objects with named values. In this case the objects are
 *  	point configuration objects as seen below.</p>
 * 
 * <p>Range series values are given by <code>low</code> and <code>high</code>.</p>
 * 
 * Example:
 * <pre>data: [{
 * 	name: 'Point 1',
 * 	color: '#00FF00',
 * 	y: 0
 * }, {
 * 	name: 'Point 2',
 * 	color: '#FF00FF',
 * 	y: 5
 * }]</pre></li>
 *  </ol>
 * 
 * <p>Note that line series and derived types like spline and area, require data to be sorted by X because it interpolates mouse coordinates for the tooltip. Column and scatter series, where each point has its own mouse event, does not require sorting.</p>
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
     * Only for treemap. Serves a purpose only if a colorAxis object is defined in the chart options. This value will decide which color the point gets from the scale of the colorAxis.
     * 
     */
    double colorValue();

    /**
     * Only for treemap. Serves a purpose only if a colorAxis object is defined in the chart options. This value will decide which color the point gets from the scale of the colorAxis.
     * 
     */
    Data colorValue(double colorValue);

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

    void addDataClickHandler(DataClickHandler dataClickHandler);

    void addDataMouseOutHandler(DataMouseOutHandler dataMouseOutHandler);

    void addDataMouseOverHandler(DataMouseOverHandler dataMouseOverHandler);

    void addDataRemoveHandler(DataRemoveHandler dataRemoveHandler);

    void addDataSelectHandler(DataSelectHandler dataSelectHandler);

    void addDataUnselectHandler(DataUnselectHandler dataUnselectHandler);

    void addDataUpdateHandler(DataUpdateHandler dataUpdateHandler);

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
     * Waterfall series only. When this property is true, the points acts as a summary column for the values added or substracted since the last intermediate sum, or since the start of the series. The <code>y</code> value is ignored.
     * 
     */
    boolean isIntermediateSum();

    /**
     * Waterfall series only. When this property is true, the points acts as a summary column for the values added or substracted since the last intermediate sum, or since the start of the series. The <code>y</code> value is ignored.
     * 
     */
    Data isIntermediateSum(boolean isIntermediateSum);

    /**
     * Waterfall series only. When this property is true, the point display the total sum across the entire series. The <code>y</code> value is ignored.
     * 
     */
    boolean isSum();

    /**
     * Waterfall series only. When this property is true, the point display the total sum across the entire series. The <code>y</code> value is ignored.
     * 
     */
    Data isSum(boolean isSum);

    /**
     * Pies only. The sequential index of the pie slice in the legend.			.
     * 
     */
    double legendIndex();

    /**
     * Pies only. The sequential index of the pie slice in the legend.			.
     * 
     */
    Data legendIndex(double legendIndex);

    /**
     * 
     */
    Marker marker();

    /**
     * 
     */
    Data marker(Marker marker);

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
     * Only for treemap. Use this option to build a tree structure. The value should be the id of the point which is the parent. If no points has a matching id, or this option is undefined, then the parent will be set to the root.
     * 
     */
    String parent();

    /**
     * Only for treemap. Use this option to build a tree structure. The value should be the id of the point which is the parent. If no points has a matching id, or this option is undefined, then the parent will be set to the root.
     * 
     */
    Data parent(String parent);

    /**
     * Pie series only. Whether to display a slice offset from the center.
     * 
     */
    boolean sliced();

    /**
     * Pie series only. Whether to display a slice offset from the center.
     * 
     */
    Data sliced(boolean sliced);

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

}
