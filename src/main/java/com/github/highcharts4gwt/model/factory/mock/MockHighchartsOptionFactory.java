package com.github.highcharts4gwt.model.factory.mock;

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
import com.github.highcharts4gwt.model.highcharts.option.mock.MockChartOptions;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockGlobalOptions;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesArea;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesArearange;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesAreaspline;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesAreasplinerange;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesBar;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesBoxplot;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesBubble;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesColumn;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesColumnrange;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesErrorbar;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesFunnel;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesGauge;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesHeatmap;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesLine;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesPie;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesPolygon;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesPyramid;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesScatter;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesSolidgauge;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesSpline;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesTreemap;
import com.github.highcharts4gwt.model.highcharts.option.mock.MockSeriesWaterfall;
import com.github.highcharts4gwt.model.highcharts.option.mock.labels.MockItem;
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
    public Item createItem()
    {
        return new MockItem();
    }

    @Override
    public SeriesArea createSeriesArea()
    {
        return new MockSeriesArea();
    }

    @Override
    public SeriesArearange createSeriesArearange()
    {
        return new MockSeriesArearange();
    }

    @Override
    public SeriesAreaspline createSeriesAreaspline()
    {
        return new MockSeriesAreaspline();
    }

    @Override
    public SeriesAreasplinerange createSeriesAreasplinerange()
    {
        return new MockSeriesAreasplinerange();
    }

    @Override
    public SeriesBar createSeriesBar()
    {
        return new MockSeriesBar();
    }

    @Override
    public SeriesBoxplot createSeriesBoxplot()
    {
        return new MockSeriesBoxplot();
    }

    @Override
    public SeriesBubble createSeriesBubble()
    {
        return new MockSeriesBubble();
    }

    @Override
    public SeriesColumn createSeriesColumn()
    {
        return new MockSeriesColumn();
    }

    @Override
    public SeriesColumnrange createSeriesColumnrange()
    {
        return new MockSeriesColumnrange();
    }

    @Override
    public SeriesErrorbar createSeriesErrorbar()
    {
        return new MockSeriesErrorbar();
    }

    @Override
    public SeriesFunnel createSeriesFunnel()
    {
        return new MockSeriesFunnel();
    }

    @Override
    public SeriesGauge createSeriesGauge()
    {
        return new MockSeriesGauge();
    }

    @Override
    public SeriesHeatmap creSeriesHeatmap()
    {
        return new MockSeriesHeatmap();
    }

    @Override
    public SeriesLine createSeriesLine()
    {
        return new MockSeriesLine();
    }

    @Override
    public SeriesPie createSeriesPie()
    {
        return new MockSeriesPie();
    }

    @Override
    public SeriesPolygon createSeriesPolygon()
    {
        return new MockSeriesPolygon();
    }

    @Override
    public SeriesPyramid createSeriesPyramid()
    {
        return new MockSeriesPyramid();
    }

    @Override
    public SeriesScatter createSeriesScatter()
    {
        return new MockSeriesScatter();
    }

    @Override
    public SeriesSolidgauge createSeriesSolidgauge()
    {
        return new MockSeriesSolidgauge();
    }

    @Override
    public SeriesSpline createSeriesSpline()
    {
        return new MockSeriesSpline();
    }

    @Override
    public SeriesTreemap createSeriesTreemap()
    {
        return new MockSeriesTreemap();
    }

    @Override
    public SeriesWaterfall createSeriesWaterfall()
    {
        return new MockSeriesWaterfall();
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.Data createSeriesAreaData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.Data createSeriesArearangeData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.Data createSeriesAreasplineData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.Data createSeriesAreasplinerangeData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesbar.Data createSeriesBarData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.Data createSeriesBoxplotData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.Data createSeriesBubbleData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.Data createSeriesColumnData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.Data createSeriesColumnrangeData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.Data createSeriesErrorbarData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.Data createSeriesFunnelData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Data createSeriesGaugeData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.Data creSeriesHeatmapData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesline.Data createSeriesLineData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriespie.Data createSeriesPieData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.Data createSeriesPolygonData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.Data createSeriesPyramidData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.Data createSeriesScatterData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.Data createSeriesSolidgaugeData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.Data createSeriesSplineData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Data createSeriesTreemapData()
    {
        return null;
    }

    @Override
    public com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.Data createSeriesWaterfallData()
    {
        return null;
    }

}
