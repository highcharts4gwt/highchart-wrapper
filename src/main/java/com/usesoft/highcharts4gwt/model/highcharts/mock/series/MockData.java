
package com.usesoft.highcharts4gwt.model.highcharts.mock.series;

import com.usesoft.highcharts4gwt.model.highcharts.api.series.Data;
import com.usesoft.highcharts4gwt.model.highcharts.api.series.data.Events;
import com.usesoft.highcharts4gwt.model.highcharts.api.series.data.Marker;

public class MockData
    implements Data
{

    private String color;
    private String dataLabels;
    private String drilldown;
    private Events events;
    private String id;
    private boolean isIntermediateSum;
    private boolean isSum;
    private Number legendIndex;
    private Marker marker;
    private String name;
    private boolean sliced;
    private Number x;
    private Number y;

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

    public Events events() {
        return events;
    }

    public MockData events(Events events) {
        this.events = events;
        return this;
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

    public Number legendIndex() {
        return legendIndex;
    }

    public MockData legendIndex(Number legendIndex) {
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

    public boolean sliced() {
        return sliced;
    }

    public MockData sliced(boolean sliced) {
        this.sliced = sliced;
        return this;
    }

    public Number x() {
        return x;
    }

    public MockData x(Number x) {
        this.x = x;
        return this;
    }

    public Number y() {
        return y;
    }

    public MockData y(Number y) {
        this.y = y;
        return this;
    }

}
