package com.github.highcharts4gwt.model.factory.jso;

import com.github.highcharts4gwt.model.factory.api.HighchartsOptionFactory;
import com.github.highcharts4gwt.model.highcharts.option.api.ChartOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.GlobalOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.Series;
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
}
