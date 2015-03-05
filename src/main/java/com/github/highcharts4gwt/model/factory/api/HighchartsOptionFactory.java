package com.github.highcharts4gwt.model.factory.api;

import com.github.highcharts4gwt.model.highcharts.option.api.ChartOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.GlobalOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.labels.Item;
import com.github.highcharts4gwt.model.highcharts.option.api.series.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.PlotLine;

public interface HighchartsOptionFactory
{
    ChartOptions createChartOptions();
    
    GlobalOptions createGlobalOptions();
    
    Series createSeries();
    
    PlotLine createXAxisPlotLine();
    
    com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotLine createYAxisPlotLine();
    
    Data createData();
    
    Item createItem();
}
