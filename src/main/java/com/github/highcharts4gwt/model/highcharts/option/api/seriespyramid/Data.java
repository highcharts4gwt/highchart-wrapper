
package com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid;

import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.data.DataUpdateHandler;


/**
 * An array of data points for the series. For the <code>pyramid</code> series type, points can be given in the following ways:
 *  <ol>
 *  	<li>An array of numerical values. In this case, the numerical values will 
 *  	be interpreted as <code>y</code> options.  Example:
 * <pre>data: [0, 5, 3, 5]</pre>
 *  	</li>
 *  <li><p>An array of objects with named values. The objects are
 *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<pyramid>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
 * 
 * <pre>data: [{
 *     y: 6,
 *     name: "Point2",
 *     color: "#00FF00"
 * }, {
 *     y: 7,
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
     * The sequential index of the data point in the legend.
     * 
     */
    double legendIndex();

    /**
     * The sequential index of the data point in the legend.
     * 
     */
    Data legendIndex(double legendIndex);

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
