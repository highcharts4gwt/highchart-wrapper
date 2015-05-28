package com.github.highcharts4gwt.model.factory.jso;

import com.github.highcharts4gwt.model.factory.api.HighchartsOptionFactory;
import com.github.highcharts4gwt.model.highcharts.option.api.ChartOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.GlobalOptions;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesArea;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesArearange;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesAreaspline;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesAreasplinerange;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesBar;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesBoxplot;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesBubble;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesColumn;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesColumnrange;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesErrorbar;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesFunnel;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesGauge;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesHeatmap;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesLine;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesPie;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesPolygon;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesPyramid;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesScatter;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesSolidgauge;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesSpline;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesTreemap;
import com.github.highcharts4gwt.model.highcharts.option.api.SeriesWaterfall;
import com.github.highcharts4gwt.model.highcharts.option.api.labels.Item;
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
    public Item createItem()
    {
        return (Item) JavaScriptObject.createObject();
    }

    @Override
    public SeriesArea createSeriesArea()
    {
        return (SeriesArea) JavaScriptObject.createObject();
    }

    @Override
    public SeriesArearange createSeriesArearange()
    {
        return (SeriesArearange) JavaScriptObject.createObject();
    }

    @Override
    public SeriesAreaspline createSeriesAreaspline()
    {
        return (SeriesAreaspline) JavaScriptObject.createObject();
    }

    @Override
    public SeriesAreasplinerange createSeriesAreasplinerange()
    {
        return (SeriesAreasplinerange) JavaScriptObject.createObject();
    }

    @Override
    public SeriesBar createSeriesBar()
    {
        return (SeriesBar) JavaScriptObject.createObject();
    }

    @Override
    public SeriesBoxplot createSeriesBoxplot()
    {
        return (SeriesBoxplot) JavaScriptObject.createObject();
    }

    @Override
    public SeriesBubble createSeriesBubble()
    {
        return (SeriesBubble) JavaScriptObject.createObject();
    }

    @Override
    public SeriesColumn createSeriesColumn()
    {
        return (SeriesColumn) JavaScriptObject.createObject();
    }

    @Override
    public SeriesColumnrange createSeriesColumnrange()
    {
        return (SeriesColumnrange) JavaScriptObject.createObject();
    }

    @Override
    public SeriesErrorbar createSeriesErrorbar()
    {
        return (SeriesErrorbar) JavaScriptObject.createObject();
    }

    @Override
    public SeriesFunnel createSeriesFunnel()
    {
        return (SeriesFunnel) JavaScriptObject.createObject();
    }

    @Override
    public SeriesGauge createSeriesGauge()
    {
        return (SeriesGauge) JavaScriptObject.createObject();
    }

    @Override
    public SeriesHeatmap creSeriesHeatmap()
    {
        return (SeriesHeatmap) JavaScriptObject.createObject();
    }

    @Override
    public SeriesLine createSeriesLine()
    {
        return (SeriesLine) JavaScriptObject.createObject();
    }

    @Override
    public SeriesPie createSeriesPie()
    {
        return (SeriesPie) JavaScriptObject.createObject();
    }

    @Override
    public SeriesPolygon createSeriesPolygon()
    {
        return (SeriesPolygon) JavaScriptObject.createObject();
    }

    @Override
    public SeriesPyramid createSeriesPyramid()
    {
        return (SeriesPyramid) JavaScriptObject.createObject();
    }

    @Override
    public SeriesScatter createSeriesScatter()
    {
        return (SeriesScatter) JavaScriptObject.createObject();
    }

    @Override
    public SeriesSolidgauge createSeriesSolidgauge()
    {
        return (SeriesSolidgauge) JavaScriptObject.createObject();
    }

    @Override
    public SeriesSpline createSeriesSpline()
    {
        return (SeriesSpline) JavaScriptObject.createObject();
    }

    @Override
    public SeriesTreemap createSeriesTreemap()
    {
        return (SeriesTreemap) JavaScriptObject.createObject();
    }

    @Override
    public SeriesWaterfall createSeriesWaterfall()
    {
        return (SeriesWaterfall) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.Data createSeriesAreaData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.Data createSeriesArearangeData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.Data createSeriesAreasplineData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.Data createSeriesAreasplinerangeData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesbar.Data createSeriesBarData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriesbar.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.Data createSeriesBoxplotData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.Data createSeriesBubbleData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.Data createSeriesColumnData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.Data createSeriesColumnrangeData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.Data createSeriesErrorbarData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.Data createSeriesFunnelData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Data createSeriesGaugeData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.Data creSeriesHeatmapData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesline.Data createSeriesLineData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriesline.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriespie.Data createSeriesPieData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriespie.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.Data createSeriesPolygonData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.Data createSeriesPyramidData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.Data createSeriesScatterData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.Data createSeriesSolidgaugeData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.Data createSeriesSplineData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Data createSeriesTreemapData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Data) JavaScriptObject.createObject();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.Data createSeriesWaterfallData()
    {
        return (com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.Data) JavaScriptObject.createObject();
    }
}
