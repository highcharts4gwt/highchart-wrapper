package com.github.highcharts4gwt.model.factory.jso;

import com.github.highcharts4gwt.model.factory.api.HighchartsOptionFactory;
import com.github.highcharts4gwt.model.highcharts.option.api.ChartOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.GlobalOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.labels.Item;
import com.github.highcharts4gwt.model.highcharts.option.api.series.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.PlotLine;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoHighchartsOptionFactory implements HighchartsOptionFactory
{
    @Override
    public ChartOptions createChartOptions()
    {
        return (ChartOptions) JavaScriptObject.createObject();
    }

    @Override
    public GlobalOptions createGlobalOptions()
    {
        return (GlobalOptions) JavaScriptObject.createObject();
    }

    @Override
    public Series createSeries()
    {
        return (Series) JavaScriptObject.createObject();
    }

    @Override
    public PlotLine createXAxisPlotLine()
    {
        return (PlotLine) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotLine createYAxisPlotLine()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotLine) JavaScriptObject.createObject();
    }

    @Override
    public Data createData()
    {
        return (Data) JavaScriptObject.createObject();
    }

    @Override
    public Item createItem()
    {
        return (Item) JavaScriptObject.createObject();
    }
}
