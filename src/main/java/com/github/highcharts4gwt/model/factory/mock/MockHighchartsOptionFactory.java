package com.github.highcharts4gwt.model.factory.mock;

import com.github.highcharts4gwt.model.factory.api.HighchartsOptionFactory;
import com.github.highcharts4gwt.model.highcharts.option.api.ChartOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.GlobalOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockChartOptions;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockGlobalOptions;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeries;

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

}
