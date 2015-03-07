
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.Chart;
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
import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.Subtitle;
import com.github.highcharts4gwt.model.highcharts.option.api.Title;
import com.github.highcharts4gwt.model.highcharts.option.api.Tooltip;
import com.github.highcharts4gwt.model.highcharts.option.api.XAxis;
import com.github.highcharts4gwt.model.highcharts.option.api.YAxis;

public interface ChartOptions {


    Drilldown drilldown();

    ChartOptions drilldown(Drilldown drilldown);

    Legend legend();

    ChartOptions legend(Legend legend);

    Chart chart();

    ChartOptions chart(Chart chart);

    PlotOptions plotOptions();

    ChartOptions plotOptions(PlotOptions plotOptions);

    XAxis xAxis();

    ChartOptions xAxis(XAxis xAxis);

    YAxis yAxis();

    ChartOptions yAxis(YAxis yAxis);

    Navigation navigation();

    ChartOptions navigation(Navigation navigation);

    Title title();

    ChartOptions title(Title title);

    Exporting exporting();

    ChartOptions exporting(Exporting exporting);

    Subtitle subtitle();

    ChartOptions subtitle(Subtitle subtitle);

    Tooltip tooltip();

    ChartOptions tooltip(Tooltip tooltip);

    NoData noData();

    ChartOptions noData(NoData noData);

    Pane pane();

    ChartOptions pane(Pane pane);

    Array<Series> series();

    ChartOptions series(Array<Series> series);

    ArrayString colors();

    ChartOptions colors(ArrayString colors);

    Data data();

    ChartOptions data(Data data);

    Credits credits();

    ChartOptions credits(Credits credits);

    Loading loading();

    ChartOptions loading(Loading loading);

    Labels labels();

    ChartOptions labels(Labels labels);

    String getFieldAsJsonObject(String fieldName);

    ChartOptions setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
