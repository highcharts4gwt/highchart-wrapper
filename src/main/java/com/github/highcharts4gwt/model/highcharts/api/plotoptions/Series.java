
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.DataLabels;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.Marker;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.Point;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.SeriesShowHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.States;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.series.Tooltip;

public interface Series {


    boolean allowPointSelect();

    Series allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Series animation(boolean animation);

    String color();

    Series color(String color);

    boolean connectEnds();

    Series connectEnds(boolean connectEnds);

    boolean connectNulls();

    Series connectNulls(boolean connectNulls);

    double cropThreshold();

    Series cropThreshold(double cropThreshold);

    String cursor();

    Series cursor(String cursor);

    String dashStyle();

    Series dashStyle(String dashStyle);

    DataLabels dataLabels();

    Series dataLabels(DataLabels dataLabels);

    boolean enableMouseTracking();

    Series enableMouseTracking(boolean enableMouseTracking);

    void addSeriesAfterAnimateHandler(SeriesAfterAnimateHandler seriesAfterAnimateHandler);

    void addSeriesCheckboxClickHandler(SeriesCheckboxClickHandler seriesCheckboxClickHandler);

    void addSeriesClickHandler(SeriesClickHandler seriesClickHandler);

    void addSeriesHideHandler(SeriesHideHandler seriesHideHandler);

    void addSeriesLegendItemClickHandler(SeriesLegendItemClickHandler seriesLegendItemClickHandler);

    void addSeriesMouseOutHandler(SeriesMouseOutHandler seriesMouseOutHandler);

    void addSeriesMouseOverHandler(SeriesMouseOverHandler seriesMouseOverHandler);

    void addSeriesShowHandler(SeriesShowHandler seriesShowHandler);

    double lineWidth();

    Series lineWidth(double lineWidth);

    String linkedTo();

    Series linkedTo(String linkedTo);

    Marker marker();

    Series marker(Marker marker);

    String negativeColor();

    Series negativeColor(String negativeColor);

    Point point();

    Series point(Point point);

    double pointInterval();

    Series pointInterval(double pointInterval);

    String pointPlacementAsString();

    Series pointPlacementAsString(String pointPlacementAsString);

    double pointPlacementAsNumber();

    Series pointPlacementAsNumber(double pointPlacementAsNumber);

    double pointStart();

    Series pointStart(double pointStart);

    boolean selected();

    Series selected(boolean selected);

    boolean shadowAsBoolean();

    Series shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Series shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Series showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Series showInLegend(boolean showInLegend);

    String stacking();

    Series stacking(String stacking);

    States states();

    Series states(States states);

    boolean stickyTracking();

    Series stickyTracking(boolean stickyTracking);

    double threshold();

    Series threshold(double threshold);

    Tooltip tooltip();

    Series tooltip(Tooltip tooltip);

    double turboThreshold();

    Series turboThreshold(double turboThreshold);

    boolean visible();

    Series visible(boolean visible);

}
