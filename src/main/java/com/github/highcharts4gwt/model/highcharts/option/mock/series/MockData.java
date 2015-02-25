
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

}
