
package com.usesoft.highcharts4gwt.model.highcharts.api;

import com.usesoft.highcharts4gwt.model.array.api.Array;
import com.usesoft.highcharts4gwt.model.array.api.ArrayNumber;
import com.usesoft.highcharts4gwt.model.array.api.ArrayString;
import com.usesoft.highcharts4gwt.model.highcharts.api.xaxis.Events;
import com.usesoft.highcharts4gwt.model.highcharts.api.xaxis.Labels;
import com.usesoft.highcharts4gwt.model.highcharts.api.xaxis.PlotBand;
import com.usesoft.highcharts4gwt.model.highcharts.api.xaxis.PlotLine;
import com.usesoft.highcharts4gwt.model.highcharts.api.xaxis.Title;

public interface XAxis {


    boolean allowDecimals();

    XAxis allowDecimals(boolean allowDecimals);

    String alternateGridColor();

    XAxis alternateGridColor(String alternateGridColor);

    ArrayString categories();

    XAxis categories(ArrayString categories);

    Number ceiling();

    XAxis ceiling(Number ceiling);

    String dateTimeLabelFormats();

    XAxis dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString);

    boolean endOnTick();

    XAxis endOnTick(boolean endOnTick);

    Events events();

    XAxis events(Events events);

    Number floor();

    XAxis floor(Number floor);

    String gridLineColor();

    XAxis gridLineColor(String gridLineColor);

    String gridLineDashStyle();

    XAxis gridLineDashStyle(String gridLineDashStyle);

    Number gridLineWidth();

    XAxis gridLineWidth(Number gridLineWidth);

    Number gridZIndex();

    XAxis gridZIndex(Number gridZIndex);

    String id();

    XAxis id(String id);

    Labels labels();

    XAxis labels(Labels labels);

    String lineColor();

    XAxis lineColor(String lineColor);

    Number lineWidth();

    XAxis lineWidth(Number lineWidth);

    Number linkedTo();

    XAxis linkedTo(Number linkedTo);

    Number max();

    XAxis max(Number max);

    Number maxPadding();

    XAxis maxPadding(Number maxPadding);

    Number maxZoom();

    XAxis maxZoom(Number maxZoom);

    Number min();

    XAxis min(Number min);

    Number minPadding();

    XAxis minPadding(Number minPadding);

    Number minRange();

    XAxis minRange(Number minRange);

    Number minTickInterval();

    XAxis minTickInterval(Number minTickInterval);

    String minorGridLineColor();

    XAxis minorGridLineColor(String minorGridLineColor);

    String minorGridLineDashStyle();

    XAxis minorGridLineDashStyle(String minorGridLineDashStyle);

    Number minorGridLineWidth();

    XAxis minorGridLineWidth(Number minorGridLineWidth);

    String minorTickColor();

    XAxis minorTickColor(String minorTickColor);

    Number minorTickInterval();

    XAxis minorTickInterval(Number minorTickInterval);

    Number minorTickLength();

    XAxis minorTickLength(Number minorTickLength);

    String minorTickPosition();

    XAxis minorTickPosition(String minorTickPosition);

    Number minorTickWidth();

    XAxis minorTickWidth(Number minorTickWidth);

    Number offset();

    XAxis offset(Number offset);

    boolean opposite();

    XAxis opposite(boolean opposite);

    Array<PlotBand> plotBands();

    XAxis plotBands(Array<PlotBand> plotBands);

    Array<PlotLine> plotLines();

    XAxis plotLines(Array<PlotLine> plotLines);

    boolean reversed();

    XAxis reversed(boolean reversed);

    boolean showEmpty();

    XAxis showEmpty(boolean showEmpty);

    boolean showFirstLabel();

    XAxis showFirstLabel(boolean showFirstLabel);

    boolean showLastLabel();

    XAxis showLastLabel(boolean showLastLabel);

    Number startOfWeek();

    XAxis startOfWeek(Number startOfWeek);

    boolean startOnTick();

    XAxis startOnTick(boolean startOnTick);

    String tickColor();

    XAxis tickColor(String tickColor);

    Number tickInterval();

    XAxis tickInterval(Number tickInterval);

    Number tickLength();

    XAxis tickLength(Number tickLength);

    Number tickPixelInterval();

    XAxis tickPixelInterval(Number tickPixelInterval);

    String tickPosition();

    XAxis tickPosition(String tickPosition);

    ArrayNumber tickPositions();

    XAxis tickPositions(ArrayNumber tickPositions);

    Number tickWidth();

    XAxis tickWidth(Number tickWidth);

    String tickmarkPlacement();

    XAxis tickmarkPlacement(String tickmarkPlacement);

    Title title();

    XAxis title(Title title);

    String type();

    XAxis type(String type);

}
