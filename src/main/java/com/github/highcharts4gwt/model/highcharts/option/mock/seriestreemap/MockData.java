
package com.github.highcharts4gwt.model.highcharts.option.mock.seriestreemap;

import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.DataClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.DataMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.DataMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.DataRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.DataSelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.DataUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.data.DataUpdateHandler;


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
public class MockData
    implements Data
{

    private String color;
    private double colorValue;
    private String dataLabels;
    private String drilldown;
    private String id;
    private String name;
    private String parent;
    private boolean selected;
    private double value;
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

    public boolean selected() {
        return selected;
    }

    public MockData selected(boolean selected) {
        this.selected = selected;
        return this;
    }

    public double value() {
        return value;
    }

    public MockData value(double value) {
        this.value = value;
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
