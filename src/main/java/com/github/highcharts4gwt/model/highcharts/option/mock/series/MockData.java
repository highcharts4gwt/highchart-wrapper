
package com.github.highcharts4gwt.model.highcharts.option.mock.series;

import com.github.highcharts4gwt.model.highcharts.option.api.series.Data;
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
public class MockData
    implements Data
{

    private String color;
    private double colorValue;
    private String dataLabels;
    private String drilldown;
    private String id;
    private boolean isIntermediateSum;
    private boolean isSum;
    private double legendIndex;
    private Marker marker;
    private String name;
    private String parent;
    private boolean sliced;
    private double x;
    private double y;
    private String genericField;
    private String functionAsString;

    public String color() {
        return color;
    }

    public MockData color(String color) {
        this.color = color;
        return this;
    }

    public double colorValue() {
        return colorValue;
    }

    public MockData colorValue(double colorValue) {
        this.colorValue = colorValue;
        return this;
    }

    public String dataLabels() {
        return dataLabels;
    }

    public MockData dataLabels(String dataLabelsAsJsonString) {
        this.dataLabels = dataLabelsAsJsonString;
        return this;
    }

    public String drilldown() {
        return drilldown;
    }

    public MockData drilldown(String drilldown) {
        this.drilldown = drilldown;
        return this;
    }

    public void addDataClickHandler(DataClickHandler handler) {
    }

    public void addDataMouseOutHandler(DataMouseOutHandler handler) {
    }

    public void addDataMouseOverHandler(DataMouseOverHandler handler) {
    }

    public void addDataRemoveHandler(DataRemoveHandler handler) {
    }

    public void addDataSelectHandler(DataSelectHandler handler) {
    }

    public void addDataUnselectHandler(DataUnselectHandler handler) {
    }

    public void addDataUpdateHandler(DataUpdateHandler handler) {
    }

    public String id() {
        return id;
    }

    public MockData id(String id) {
        this.id = id;
        return this;
    }

    public boolean isIntermediateSum() {
        return isIntermediateSum;
    }

    public MockData isIntermediateSum(boolean isIntermediateSum) {
        this.isIntermediateSum = isIntermediateSum;
        return this;
    }

    public boolean isSum() {
        return isSum;
    }

    public MockData isSum(boolean isSum) {
        this.isSum = isSum;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockData legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public Marker marker() {
        return marker;
    }

    public MockData marker(Marker marker) {
        this.marker = marker;
        return this;
    }

    public String name() {
        return name;
    }

    public MockData name(String name) {
        this.name = name;
        return this;
    }

    public String parent() {
        return parent;
    }

    public MockData parent(String parent) {
        this.parent = parent;
        return this;
    }

    public boolean sliced() {
        return sliced;
    }

    public MockData sliced(boolean sliced) {
        this.sliced = sliced;
        return this;
    }

    public double x() {
        return x;
    }

    public MockData x(double x) {
        this.x = x;
        return this;
    }

    public double y() {
        return y;
    }

    public MockData y(double y) {
        this.y = y;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockData setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockData setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
