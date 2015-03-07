
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.Labels;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.PlotBand;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.PlotLine;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.Title;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.XAxisAfterBreaksHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.XAxisAfterSetExtremesHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.XAxisPointBreakHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.XAxisSetExtremesHandler;

public interface XAxis {


    boolean allowDecimals();

    XAxis allowDecimals(boolean allowDecimals);

    String alternateGridColor();

    XAxis alternateGridColor(String alternateGridColor);

    ArrayNumber breaks();

    XAxis breaks(ArrayNumber breaks);

    ArrayString categories();

    XAxis categories(ArrayString categories);

    double ceiling();

    XAxis ceiling(double ceiling);

    String dateTimeLabelFormats();

    XAxis dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString);

    boolean endOnTick();

    XAxis endOnTick(boolean endOnTick);

    void addXAxisAfterBreaksHandler(XAxisAfterBreaksHandler xAxisAfterBreaksHandler);

    void addXAxisAfterSetExtremesHandler(XAxisAfterSetExtremesHandler xAxisAfterSetExtremesHandler);

    void addXAxisPointBreakHandler(XAxisPointBreakHandler xAxisPointBreakHandler);

    void addXAxisSetExtremesHandler(XAxisSetExtremesHandler xAxisSetExtremesHandler);

    double floor();

    XAxis floor(double floor);

    String gridLineColor();

    XAxis gridLineColor(String gridLineColor);

    String gridLineDashStyle();

    XAxis gridLineDashStyle(String gridLineDashStyle);

    double gridLineWidth();

    XAxis gridLineWidth(double gridLineWidth);

    double gridZIndex();

    XAxis gridZIndex(double gridZIndex);

    String id();

    XAxis id(String id);

    Labels labels();

    XAxis labels(Labels labels);

    String lineColor();

    XAxis lineColor(String lineColor);

    double lineWidth();

    XAxis lineWidth(double lineWidth);

    double linkedTo();

    XAxis linkedTo(double linkedTo);

    double max();

    XAxis max(double max);

    double maxPadding();

    XAxis maxPadding(double maxPadding);

    double maxZoom();

    XAxis maxZoom(double maxZoom);

    double min();

    XAxis min(double min);

    double minPadding();

    XAxis minPadding(double minPadding);

    double minRange();

    XAxis minRange(double minRange);

    double minTickInterval();

    XAxis minTickInterval(double minTickInterval);

    String minorGridLineColor();

    XAxis minorGridLineColor(String minorGridLineColor);

    String minorGridLineDashStyle();

    XAxis minorGridLineDashStyle(String minorGridLineDashStyle);

    double minorGridLineWidth();

    XAxis minorGridLineWidth(double minorGridLineWidth);

    String minorTickColor();

    XAxis minorTickColor(String minorTickColor);

    String minorTickIntervalAsString();

    XAxis minorTickIntervalAsString(String minorTickIntervalAsString);

    double minorTickIntervalAsNumber();

    XAxis minorTickIntervalAsNumber(double minorTickIntervalAsNumber);

    double minorTickLength();

    XAxis minorTickLength(double minorTickLength);

    String minorTickPosition();

    XAxis minorTickPosition(String minorTickPosition);

    double minorTickWidth();

    XAxis minorTickWidth(double minorTickWidth);

    double offset();

    XAxis offset(double offset);

    boolean opposite();

    XAxis opposite(boolean opposite);

    com.github.highcharts4gwt.model.array.api.Array<PlotBand> plotBands();

    XAxis plotBands(com.github.highcharts4gwt.model.array.api.Array<PlotBand> plotBands);

    com.github.highcharts4gwt.model.array.api.Array<PlotLine> plotLines();

    XAxis plotLines(com.github.highcharts4gwt.model.array.api.Array<PlotLine> plotLines);

    boolean reversed();

    XAxis reversed(boolean reversed);

    boolean showEmpty();

    XAxis showEmpty(boolean showEmpty);

    boolean showFirstLabel();

    XAxis showFirstLabel(boolean showFirstLabel);

    boolean showLastLabel();

    XAxis showLastLabel(boolean showLastLabel);

    double startOfWeek();

    XAxis startOfWeek(double startOfWeek);

    boolean startOnTick();

    XAxis startOnTick(boolean startOnTick);

    double tickAmount();

    XAxis tickAmount(double tickAmount);

    String tickColor();

    XAxis tickColor(String tickColor);

    double tickInterval();

    XAxis tickInterval(double tickInterval);

    double tickLength();

    XAxis tickLength(double tickLength);

    double tickPixelInterval();

    XAxis tickPixelInterval(double tickPixelInterval);

    String tickPosition();

    XAxis tickPosition(String tickPosition);

    ArrayNumber tickPositions();

    XAxis tickPositions(ArrayNumber tickPositions);

    double tickWidth();

    XAxis tickWidth(double tickWidth);

    String tickmarkPlacement();

    XAxis tickmarkPlacement(String tickmarkPlacement);

    Title title();

    XAxis title(Title title);

    String type();

    XAxis type(String type);

    ArrayNumber units();

    XAxis units(ArrayNumber units);

    String getFieldAsJsonObject(String fieldName);

    XAxis setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
