
package com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap;

import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.RemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.SelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.UnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.UpdateHandler;


/**
 * An array of data points for the series. For the <code>treemap</code> series type, points can be given in the following ways:
 *  <ol>
 *  	<li>An array of numerical values. In this case, the numerical values will 
 *  	be interpreted as <code>value</code> options.  Example:
 * <pre>data: [0, 5, 3, 5]</pre>
 *  	</li>
 *  <li><p>An array of objects with named values. The objects are
 *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<treemap>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
 * 
 * <pre>data: [{
 *     value: 7,
 *     name: "Point2",
 *     color: "#00FF00"
 * }, {
 *     value: 2,
 *     name: "Point1",
 *     color: "#FF00FF"
 * }]</pre></li>
 *  </ol>
 * 
 */
public interface Data {


    /**
     * The color of the point. In heat maps the point color is rarely set explicitly, as we use the color to denote the <code>value</code>. Options for this are set in the <a href="#colorAxis">colorAxis</a> configuration.
     * 
     */
    String color();

    /**
     * The color of the point. In heat maps the point color is rarely set explicitly, as we use the color to denote the <code>value</code>. Options for this are set in the <a href="#colorAxis">colorAxis</a> configuration.
     * 
     */
    Data color(String color);

    /**
     * Serves a purpose only if a colorAxis object is defined in the chart options. This value will decide which color the point gets from the scale of the colorAxis.
     * 
     */
    double colorValue();

    /**
     * Serves a purpose only if a colorAxis object is defined in the chart options. This value will decide which color the point gets from the scale of the colorAxis.
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
     * The value of the point, resulting in a relative area of the point in the treemap.
     * 
     */
    double value();

    /**
     * The value of the point, resulting in a relative area of the point in the treemap.
     * 
     */
    Data value(double value);

    String getFieldAsJsonObject(String fieldName);

    Data setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Data setFunctionAsString(String fieldName, String functionAsString);

}
