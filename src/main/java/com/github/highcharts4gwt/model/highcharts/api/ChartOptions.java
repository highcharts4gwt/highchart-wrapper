
package com.github.highcharts4gwt.model.highcharts.api;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.api.Chart;
import com.github.highcharts4gwt.model.highcharts.api.Credits;
import com.github.highcharts4gwt.model.highcharts.api.Data;
import com.github.highcharts4gwt.model.highcharts.api.Drilldown;
import com.github.highcharts4gwt.model.highcharts.api.Exporting;
import com.github.highcharts4gwt.model.highcharts.api.Global;
import com.github.highcharts4gwt.model.highcharts.api.Labels;
import com.github.highcharts4gwt.model.highcharts.api.Lang;
import com.github.highcharts4gwt.model.highcharts.api.Legend;
import com.github.highcharts4gwt.model.highcharts.api.Loading;
import com.github.highcharts4gwt.model.highcharts.api.Navigation;
import com.github.highcharts4gwt.model.highcharts.api.NoData;
import com.github.highcharts4gwt.model.highcharts.api.Pane;
import com.github.highcharts4gwt.model.highcharts.api.PlotOptions;
import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.Subtitle;
import com.github.highcharts4gwt.model.highcharts.api.Title;
import com.github.highcharts4gwt.model.highcharts.api.Tooltip;
import com.github.highcharts4gwt.model.highcharts.api.XAxis;
import com.github.highcharts4gwt.model.highcharts.api.YAxis;

public interface ChartOptions {


    Global global();

    ChartOptions global(Global global);

    Drilldown drilldown();

    ChartOptions drilldown(Drilldown drilldown);

    Legend legend();

    ChartOptions legend(Legend legend);

    Chart chart();

    ChartOptions chart(Chart chart);

    PlotOptions plotOptions();

    ChartOptions plotOptions(PlotOptions plotOptions);

    YAxis yAxis();

    ChartOptions yAxis(YAxis yAxis);

    XAxis xAxis();

    ChartOptions xAxis(XAxis xAxis);

    Navigation navigation();

    ChartOptions navigation(Navigation navigation);

    Title title();

    ChartOptions title(Title title);

    Subtitle subtitle();

    ChartOptions subtitle(Subtitle subtitle);

    Exporting exporting();

    ChartOptions exporting(Exporting exporting);

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

    Lang lang();

    ChartOptions lang(Lang lang);

    Credits credits();

    ChartOptions credits(Credits credits);

    Loading loading();

    ChartOptions loading(Loading loading);

    Labels labels();

    ChartOptions labels(Labels labels);

}
