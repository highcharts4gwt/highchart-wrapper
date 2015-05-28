package com.github.highcharts4gwt.model.factory.api;

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

public interface HighchartsOptionFactory
{
    ChartOptions createChartOptions();
    
    GlobalOptions createGlobalOptions();
    
    SeriesArea createSeriesArea();
    SeriesArearange createSeriesArearange();
    SeriesAreaspline createSeriesAreaspline();
    SeriesAreasplinerange createSeriesAreasplinerange();
    SeriesBar createSeriesBar();
    SeriesBoxplot createSeriesBoxplot();
    SeriesBubble createSeriesBubble();
    SeriesColumn createSeriesColumn();
    SeriesColumnrange createSeriesColumnrange();
    SeriesErrorbar createSeriesErrorbar();
    SeriesFunnel createSeriesFunnel();
    SeriesGauge createSeriesGauge();
    SeriesHeatmap creSeriesHeatmap();
    SeriesLine createSeriesLine();
    SeriesPie createSeriesPie();
    SeriesPolygon createSeriesPolygon();
    SeriesPyramid createSeriesPyramid();
    SeriesScatter createSeriesScatter();
    SeriesSolidgauge createSeriesSolidgauge();
    SeriesSpline createSeriesSpline();
    SeriesTreemap createSeriesTreemap();
    SeriesWaterfall createSeriesWaterfall();
    
    PlotLine createXAxisPlotLine();
    
    com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotLine createYAxisPlotLine();
    
    com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.Data createSeriesAreaData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.Data createSeriesArearangeData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.Data createSeriesAreasplineData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.Data createSeriesAreasplinerangeData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriesbar.Data createSeriesBarData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.Data createSeriesBoxplotData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.Data createSeriesBubbleData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.Data createSeriesColumnData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.Data createSeriesColumnrangeData();
    com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.Data createSeriesErrorbarData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.Data createSeriesFunnelData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.Data createSeriesGaugeData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.Data creSeriesHeatmapData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriesline.Data createSeriesLineData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriespie.Data createSeriesPieData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.Data createSeriesPolygonData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriespyramid.Data createSeriesPyramidData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.Data createSeriesScatterData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.Data createSeriesSolidgaugeData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.Data createSeriesSplineData();
    com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.Data createSeriesTreemapData();
    com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.Data createSeriesWaterfallData();
    
    Item createItem();
}
