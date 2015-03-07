
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.series.Data;

public class MockSeries
    implements Series
{

    private Array<Data> dataAsArrayObject;
    private ArrayNumber dataAsArrayNumber;
    private String dataURL;
    private String id;
    private double index;
    private double legendIndex;
    private String name;
    private String stackAsString;
    private double stackAsNumber;
    private String type;
    private double xAxisAsNumber;
    private String xAxisAsString;
    private double yAxisAsNumber;
    private String yAxisAsString;
    private double zIndex;
    private String genericField;

    public Array<Data> dataAsArrayObject() {
        return dataAsArrayObject;
    }

    public MockSeries dataAsArrayObject(Array<Data> dataAsArrayObject) {
        this.dataAsArrayObject = dataAsArrayObject;
        return this;
    }

    public ArrayNumber dataAsArrayNumber() {
        return dataAsArrayNumber;
    }

    public MockSeries dataAsArrayNumber(ArrayNumber dataAsArrayNumber) {
        this.dataAsArrayNumber = dataAsArrayNumber;
        return this;
    }

    public String dataURL() {
        return dataURL;
    }

    public MockSeries dataURL(String dataURL) {
        this.dataURL = dataURL;
        return this;
    }

    public String id() {
        return id;
    }

    public MockSeries id(String id) {
        this.id = id;
        return this;
    }

    public double index() {
        return index;
    }

    public MockSeries index(double index) {
        this.index = index;
        return this;
    }

    public double legendIndex() {
        return legendIndex;
    }

    public MockSeries legendIndex(double legendIndex) {
        this.legendIndex = legendIndex;
        return this;
    }

    public String name() {
        return name;
    }

    public MockSeries name(String name) {
        this.name = name;
        return this;
    }

    public String stackAsString() {
        return stackAsString;
    }

    public MockSeries stackAsString(String stackAsString) {
        this.stackAsString = stackAsString;
        return this;
    }

    public double stackAsNumber() {
        return stackAsNumber;
    }

    public MockSeries stackAsNumber(double stackAsNumber) {
        this.stackAsNumber = stackAsNumber;
        return this;
    }

    public String type() {
        return type;
    }

    public MockSeries type(String type) {
        this.type = type;
        return this;
    }

    public double xAxisAsNumber() {
        return xAxisAsNumber;
    }

    public MockSeries xAxisAsNumber(double xAxisAsNumber) {
        this.xAxisAsNumber = xAxisAsNumber;
        return this;
    }

    public String xAxisAsString() {
        return xAxisAsString;
    }

    public MockSeries xAxisAsString(String xAxisAsString) {
        this.xAxisAsString = xAxisAsString;
        return this;
    }

    public double yAxisAsNumber() {
        return yAxisAsNumber;
    }

    public MockSeries yAxisAsNumber(double yAxisAsNumber) {
        this.yAxisAsNumber = yAxisAsNumber;
        return this;
    }

    public String yAxisAsString() {
        return yAxisAsString;
    }

    public MockSeries yAxisAsString(String yAxisAsString) {
        this.yAxisAsString = yAxisAsString;
        return this;
    }

    public double zIndex() {
        return zIndex;
    }

    public MockSeries zIndex(double zIndex) {
        this.zIndex = zIndex;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockSeries setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

}
