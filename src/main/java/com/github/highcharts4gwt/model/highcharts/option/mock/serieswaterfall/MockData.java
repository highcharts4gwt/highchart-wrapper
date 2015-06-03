
package com.github.highcharts4gwt.model.highcharts.option.mock.serieswaterfall;

import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.data.ClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.data.MouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.data.MouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.data.RemoveHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.data.SelectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.data.UnselectHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.data.UpdateHandler;


/**
 * An array of data points for the series. For the <code>waterfall</code> series type, points can be given in the following ways:
 *  <ol>
 *  	<li>An array of numerical values. In this case, the numerical values will 
 *  	be interpreted as <code>y</code> options. The <code>x</code> values will be automatically calculated,
 *  	either starting at 0 and incremented by 1, or from <code>pointStart</code> 
 *  	and <code>pointInterval</code> given in the series options. If the axis
 *  	has categories, these will be used.  Example:
 * <pre>data: [0, 5, 3, 5]</pre>
 *  	</li>
 *  	<li><p>An array of arrays with 2 values. In this case, the values correspond to <code>x,y</code>. If the first value is a string, it is
 *  	applied as the name of the point, and the <code>x</code> value is inferred. <pre>data: [
 *     [0, 7], 
 *     [1, 8], 
 *     [2, 3]
 * ]</pre></li>
 * 
 * 
 * <li><p>An array of objects with named values. The objects are
 *  	point configuration objects as seen below. If the total number of data points exceeds the series' <a href='#series<waterfall>.turboThreshold'>turboThreshold</a>, this option is not available.</p>
 * 
 * <pre>data: [{
 *     x: 1,
 *     y: 8,
 *     name: "Point2",
 *     color: "#00FF00"
 * }, {
 *     x: 1,
 *     y: 8,
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
    private String id;
    private boolean isIntermediateSum;
    private boolean isSum;
    private String name;
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

    public void addClickHandler(ClickHandler handler) {
    }

    public void addMouseOutHandler(MouseOutHandler handler) {
    }

    public void addMouseOverHandler(MouseOverHandler handler) {
    }

    public void addRemoveHandler(RemoveHandler handler) {
    }

    public void addSelectHandler(SelectHandler handler) {
    }

    public void addUnselectHandler(UnselectHandler handler) {
    }

    public void addUpdateHandler(UpdateHandler handler) {
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
