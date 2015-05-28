
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.Chart;
import com.github.highcharts4gwt.model.highcharts.option.api.ChartOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.Credits;
import com.github.highcharts4gwt.model.highcharts.option.api.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.Drilldown;
import com.github.highcharts4gwt.model.highcharts.option.api.Exporting;
import com.github.highcharts4gwt.model.highcharts.option.api.Labels;
import com.github.highcharts4gwt.model.highcharts.option.api.Legend;
import com.github.highcharts4gwt.model.highcharts.option.api.Loading;
import com.github.highcharts4gwt.model.highcharts.option.api.Navigation;
import com.github.highcharts4gwt.model.highcharts.option.api.NoData;
import com.github.highcharts4gwt.model.highcharts.option.api.Pane;
import com.github.highcharts4gwt.model.highcharts.option.api.PlotOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.Subtitle;
import com.github.highcharts4gwt.model.highcharts.option.api.Title;
import com.github.highcharts4gwt.model.highcharts.option.api.Tooltip;
import com.github.highcharts4gwt.model.highcharts.option.api.XAxis;
import com.github.highcharts4gwt.model.highcharts.option.api.YAxis;


/**
 * 
 */
public class MockChartOptions
    implements ChartOptions
{

    private Drilldown drilldown;
    private Legend legend;
    private Chart chart;
    private PlotOptions plotOptions;
    private XAxis xAxis;
    private YAxis yAxis;
    private Exporting exporting;
    private Navigation navigation;
    private Subtitle subtitle;
    private Title title;
    private Tooltip tooltip;
    private NoData noData;
    private Pane pane;
    private ArrayString colors;
    private Data data;
    private Credits credits;
    private Loading loading;
    private Labels labels;
    private Array<Object> series;
    private String genericField;
    private String functionAsString;

    public Drilldown drilldown() {
        return drilldown;
    }

    public MockChartOptions drilldown(Drilldown drilldown) {
        this.drilldown = drilldown;
        return this;
    }

    public Legend legend() {
        return legend;
    }

    public MockChartOptions legend(Legend legend) {
        this.legend = legend;
        return this;
    }

    public Chart chart() {
        return chart;
    }

    public MockChartOptions chart(Chart chart) {
        this.chart = chart;
        return this;
    }

    public PlotOptions plotOptions() {
        return plotOptions;
    }

    public MockChartOptions plotOptions(PlotOptions plotOptions) {
        this.plotOptions = plotOptions;
        return this;
    }

    public XAxis xAxis() {
        return xAxis;
    }

    public MockChartOptions xAxis(XAxis xAxis) {
        this.xAxis = xAxis;
        return this;
    }

    public YAxis yAxis() {
        return yAxis;
    }

    public MockChartOptions yAxis(YAxis yAxis) {
        this.yAxis = yAxis;
        return this;
    }

    public Exporting exporting() {
        return exporting;
    }

    public MockChartOptions exporting(Exporting exporting) {
        this.exporting = exporting;
        return this;
    }

    public Navigation navigation() {
        return navigation;
    }

    public MockChartOptions navigation(Navigation navigation) {
        this.navigation = navigation;
        return this;
    }

    public Subtitle subtitle() {
        return subtitle;
    }

    public MockChartOptions subtitle(Subtitle subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    public Title title() {
        return title;
    }

    public MockChartOptions title(Title title) {
        this.title = title;
        return this;
    }

    public Tooltip tooltip() {
        return tooltip;
    }

    public MockChartOptions tooltip(Tooltip tooltip) {
        this.tooltip = tooltip;
        return this;
    }

    public NoData noData() {
        return noData;
    }

    public MockChartOptions noData(NoData noData) {
        this.noData = noData;
        return this;
    }

    public Pane pane() {
        return pane;
    }

    public MockChartOptions pane(Pane pane) {
        this.pane = pane;
        return this;
    }

    public ArrayString colors() {
        return colors;
    }

    public MockChartOptions colors(ArrayString colors) {
        this.colors = colors;
        return this;
    }

    public Data data() {
        return data;
    }

    public MockChartOptions data(Data data) {
        this.data = data;
        return this;
    }

    public Credits credits() {
        return credits;
    }

    public MockChartOptions credits(Credits credits) {
        this.credits = credits;
        return this;
    }

    public Loading loading() {
        return loading;
    }

    public MockChartOptions loading(Loading loading) {
        this.loading = loading;
        return this;
    }

    public Labels labels() {
        return labels;
    }

    public MockChartOptions labels(Labels labels) {
        this.labels = labels;
        return this;
    }

    public Array<Object> series() {
        return series;
    }

    public MockChartOptions series(Array<Object> series) {
        this.series = series;
        return this;
    }

    public String getFieldAsJsonObject(String fieldName) {
        return genericField;
    }

    public MockChartOptions setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject) {
        this.genericField = fieldValueAsJsonObject;
        return this;
    }

    public String getFunctionAsString(String fieldName) {
        return functionAsString;
    }

    public MockChartOptions setFunctionAsString(String fieldName, String functionAsString) {
        this.functionAsString = functionAsString;
        return this;
    }

}
