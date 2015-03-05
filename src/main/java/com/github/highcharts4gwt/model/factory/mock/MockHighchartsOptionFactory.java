package com.github.highcharts4gwt.model.factory.mock;

import com.github.highcharts4gwt.model.factory.api.HighchartsOptionFactory;
import com.github.highcharts4gwt.model.highcharts.option.api.ChartOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.GlobalOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.labels.Item;
import com.github.highcharts4gwt.model.highcharts.option.api.series.Data;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.PlotLine;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockChartOptions;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockGlobalOptions;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeries;
import com.github.highcharts4gwt.model.highcharts.option.mock.labels.MockItem;
import com.github.highcharts4gwt.model.highcharts.option.mock.series.MockData;
import com.github.highcharts4gwt.model.highcharts.option.mock.xaxis.MockPlotLine;

public class MockHighchartsOptionFactory implements HighchartsOptionFactory
{

    @Override
    public ChartOptions createChartOptions()
    {
        return new MockChartOptions();
    }

    @Override
    public GlobalOptions createGlobalOptions()
    {
        return new MockGlobalOptions();
    }

    @Override
    public Series createSeries()
    {
        return new MockSeries();
    }

    @Override
    public PlotLine createXAxisPlotLine()
    {
        return new MockPlotLine();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotLine createYAxisPlotLine()
    {
        return new com.github.highcharts4gwt.model.highcharts.option.mock.yaxis.MockPlotLine();
    }

    @Override
    public Data createData()
    {
        return new MockData();
    }

    @Override
    public Item createItem()
    {
        return new MockItem();
    }

}
