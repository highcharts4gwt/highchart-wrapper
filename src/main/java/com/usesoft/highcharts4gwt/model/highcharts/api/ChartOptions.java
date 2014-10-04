
package com.usesoft.highcharts4gwt.model.highcharts.api;

import com.usesoft.highcharts4gwt.model.array.api.Array;
import com.usesoft.highcharts4gwt.model.highcharts.api.Chart;
import com.usesoft.highcharts4gwt.model.highcharts.api.Credits;
import com.usesoft.highcharts4gwt.model.highcharts.api.Drilldown;
import com.usesoft.highcharts4gwt.model.highcharts.api.Exporting;
import com.usesoft.highcharts4gwt.model.highcharts.api.Global;
import com.usesoft.highcharts4gwt.model.highcharts.api.Labels;
import com.usesoft.highcharts4gwt.model.highcharts.api.Lang;
import com.usesoft.highcharts4gwt.model.highcharts.api.Legend;
import com.usesoft.highcharts4gwt.model.highcharts.api.Loading;
import com.usesoft.highcharts4gwt.model.highcharts.api.Navigation;
import com.usesoft.highcharts4gwt.model.highcharts.api.NoData;
import com.usesoft.highcharts4gwt.model.highcharts.api.PlotOptions;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.Subtitle;
import com.usesoft.highcharts4gwt.model.highcharts.api.Title;
import com.usesoft.highcharts4gwt.model.highcharts.api.Tooltip;
import com.usesoft.highcharts4gwt.model.highcharts.api.XAxis;
import com.usesoft.highcharts4gwt.model.highcharts.api.YAxis;

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

    XAxis xAxis();

    ChartOptions xAxis(XAxis xAxis);

    YAxis yAxis();

    ChartOptions yAxis(YAxis yAxis);

    Title title();

    ChartOptions title(Title title);

    Navigation navigation();

    ChartOptions navigation(Navigation navigation);

    Exporting exporting();

    ChartOptions exporting(Exporting exporting);

    Subtitle subtitle();

    ChartOptions subtitle(Subtitle subtitle);

    Tooltip tooltip();

    ChartOptions tooltip(Tooltip tooltip);

    NoData noData();

    ChartOptions noData(NoData noData);

    Array<Series> series();

    ChartOptions series(Array<Series> series);

    Lang lang();

    ChartOptions lang(Lang lang);

    Credits credits();

    ChartOptions credits(Credits credits);

    Loading loading();

    ChartOptions loading(Loading loading);

    Labels labels();

    ChartOptions labels(Labels labels);

}
