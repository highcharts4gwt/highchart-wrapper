
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.Labels;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotBand;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotLine;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.StackLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.Title;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisAfterBreaksHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisAfterSetExtremesHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisPointBreakHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisSetExtremesHandler;

public interface YAxis {


    boolean allowDecimals();

    YAxis allowDecimals(boolean allowDecimals);

    String alternateGridColor();

    YAxis alternateGridColor(String alternateGridColor);

    ArrayNumber breaks();

    YAxis breaks(ArrayNumber breaks);

    ArrayString categories();

    YAxis categories(ArrayString categories);

    double ceiling();

    YAxis ceiling(double ceiling);

    String dateTimeLabelFormats();

    YAxis dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString);

    boolean endOnTick();

    YAxis endOnTick(boolean endOnTick);

    void addYAxisAfterBreaksHandler(YAxisAfterBreaksHandler yAxisAfterBreaksHandler);

    void addYAxisAfterSetExtremesHandler(YAxisAfterSetExtremesHandler yAxisAfterSetExtremesHandler);

    void addYAxisPointBreakHandler(YAxisPointBreakHandler yAxisPointBreakHandler);

    void addYAxisSetExtremesHandler(YAxisSetExtremesHandler yAxisSetExtremesHandler);

    double floor();

    YAxis floor(double floor);

    String gridLineColor();

    YAxis gridLineColor(String gridLineColor);

    String gridLineDashStyle();

    YAxis gridLineDashStyle(String gridLineDashStyle);

    String gridLineInterpolation();

    YAxis gridLineInterpolation(String gridLineInterpolation);

    double gridLineWidth();

    YAxis gridLineWidth(double gridLineWidth);

    double gridZIndex();

    YAxis gridZIndex(double gridZIndex);

    String id();

    YAxis id(String id);

    Labels labels();

    YAxis labels(Labels labels);

    String lineColor();

    YAxis lineColor(String lineColor);

    double lineWidth();

    YAxis lineWidth(double lineWidth);

    double linkedTo();

    YAxis linkedTo(double linkedTo);

    double max();

    YAxis max(double max);

    String maxColor();

    YAxis maxColor(String maxColor);

    double maxPadding();

    YAxis maxPadding(double maxPadding);

    double maxZoom();

    YAxis maxZoom(double maxZoom);

    double min();

    YAxis min(double min);

    String minColor();

    YAxis minColor(String minColor);

    double minPadding();

    YAxis minPadding(double minPadding);

    double minRange();

    YAxis minRange(double minRange);

    double minTickInterval();

    YAxis minTickInterval(double minTickInterval);

    String minorGridLineColor();

    YAxis minorGridLineColor(String minorGridLineColor);

    String minorGridLineDashStyle();

    YAxis minorGridLineDashStyle(String minorGridLineDashStyle);

    double minorGridLineWidth();

    YAxis minorGridLineWidth(double minorGridLineWidth);

    String minorTickColor();

    YAxis minorTickColor(String minorTickColor);

    String minorTickIntervalAsString();

    YAxis minorTickIntervalAsString(String minorTickIntervalAsString);

    double minorTickIntervalAsNumber();

    YAxis minorTickIntervalAsNumber(double minorTickIntervalAsNumber);

    double minorTickLength();

    YAxis minorTickLength(double minorTickLength);

    String minorTickPosition();

    YAxis minorTickPosition(String minorTickPosition);

    double minorTickWidth();

    YAxis minorTickWidth(double minorTickWidth);

    double offset();

    YAxis offset(double offset);

    boolean opposite();

    YAxis opposite(boolean opposite);

    com.github.highcharts4gwt.model.array.api.Array<PlotBand> plotBands();

    YAxis plotBands(com.github.highcharts4gwt.model.array.api.Array<PlotBand> plotBands);

    com.github.highcharts4gwt.model.array.api.Array<PlotLine> plotLines();

    YAxis plotLines(com.github.highcharts4gwt.model.array.api.Array<PlotLine> plotLines);

    boolean reversed();

    YAxis reversed(boolean reversed);

    boolean reversedStacks();

    YAxis reversedStacks(boolean reversedStacks);

    boolean showEmpty();

    YAxis showEmpty(boolean showEmpty);

    boolean showFirstLabel();

    YAxis showFirstLabel(boolean showFirstLabel);

    boolean showLastLabel();

    YAxis showLastLabel(boolean showLastLabel);

    StackLabels stackLabels();

    YAxis stackLabels(StackLabels stackLabels);

    double startOfWeek();

    YAxis startOfWeek(double startOfWeek);

    boolean startOnTick();

    YAxis startOnTick(boolean startOnTick);

    double tickAmount();

    YAxis tickAmount(double tickAmount);

    String tickColor();

    YAxis tickColor(String tickColor);

    double tickInterval();

    YAxis tickInterval(double tickInterval);

    double tickLength();

    YAxis tickLength(double tickLength);

    double tickPixelInterval();

    YAxis tickPixelInterval(double tickPixelInterval);

    String tickPosition();

    YAxis tickPosition(String tickPosition);

    ArrayNumber tickPositions();

    YAxis tickPositions(ArrayNumber tickPositions);

    double tickWidth();

    YAxis tickWidth(double tickWidth);

    String tickmarkPlacement();

    YAxis tickmarkPlacement(String tickmarkPlacement);

    Title title();

    YAxis title(Title title);

    String type();

    YAxis type(String type);

    ArrayNumber units();

    YAxis units(ArrayNumber units);

}
