package com.github.highcharts4gwt.model.factory.api;

import com.github.highcharts4gwt.model.highcharts.option.api.ChartOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.GlobalOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.Series;

public interface HighchartsOptionFactory
{
    ChartOptions createChartOptions();
    
    GlobalOptions createGlobalOptions();
    
    Series createSeries();
}
