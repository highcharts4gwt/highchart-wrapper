
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesareasplinerange;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.data.DataClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.data.DataMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.data.DataMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.data.DataRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.data.DataSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.data.DataUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.data.DataUpdateHandler;


/**
 * An array of data points for the series. For the <code>areasplinerange</code> series type, points can be given in the following ways:
 *  <ol>
 *  	<li><p>An array of arrays with 3 or 2 values. In this case, the values correspond to <code>x,low,high</code>. If the first value is a string, it is
 *  	applied as the name of the point, and the <code>x</code> value is inferred. The <code>x</code> value can also be omitted, in which case the inner arrays should be of length 2. Then the <code>x</code> value is automatically calculated, either starting at 0 and incremented by 1, or from <code>pointStart</code> 
 *  	and <code>pointInterval</code> given in the series options.</p>
 * <pre>data: [
 *     [0, 0, 5], 
 *     [1, 9, 1], 
 *     [2, 5, 2]
 * ]</pre></li>
 * 
 * 
 * <li><p>An array of objects with named values. The objects are
 *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<areasplinerange>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
 * 
 * <pre>data: [{
 *     x: 1,
 *     low: 5,
 *     high: 0,
 *     name: "Point2",
 *     color: "#00FF00"
 * }, {
 *     x: 1,
 *     low: 4,
 *     high: 1,
 *     name: "Point1",
 *     color: "#FF00FF"
 * }]</pre></li>
 *  </ol>
 * 
 */
public class MockData
    implements Data
{

    private String color;
    private String dataLabels;
    private String drilldown;
    private double high;
    private String id;
    private double low;
    private String name;
    private boolean selected;
    private double x;
    private String genericField;
    private String functionAsString;

    public String color() {
        return color;
    }

    public MockData color(String color) {
        this.color = color;
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

    public double high() {
        return high;
    }

    public MockData high(double high) {
        this.high = high;
        return this;
    }

    public String id() {
        return id;
    }

    public MockData id(String id) {
        this.id = id;
        return this;
    }

    public double low() {
        return low;
    }

    public MockData low(double low) {
        this.low = low;
        return this;
    }

    public String name() {
        return name;
    }

    public MockData name(String name) {
        this.name = name;
        return this;
    }

    public boolean selected() {
        return selected;
    }

    public MockData selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public double x() {
        return x;
    }

    public MockData x(double x) {
        this.x = x;
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
