
package com.github.highcharts4gwt.model.highcharts.option.mock.seriesboxplot;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.DataClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.DataMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.DataMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.DataRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.DataSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.DataUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.data.DataUpdateHandler;


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
public class MockData
    implements Data
{

    private String color;
    private String dataLabels;
    private String drilldown;
    private double high;
    private String id;
    private double low;
    private double median;
    private String name;
    private double q1;
    private double q3;
    private boolean selected;
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

    public double median() {
        return median;
    }

    public MockData median(double median) {
        this.median = median;
        return this;
    }

    public String name() {
        return name;
    }

    public MockData name(String name) {
        this.name = name;
        return this;
    }

    public double q1() {
        return q1;
    }

    public MockData q1(double q1) {
        this.q1 = q1;
        return this;
    }

    public double q3() {
        return q3;
    }

    public MockData q3(double q3) {
        this.q3 = q3;
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
