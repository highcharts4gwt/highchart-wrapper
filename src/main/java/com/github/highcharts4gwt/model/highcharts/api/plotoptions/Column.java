
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.ColumnShowHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.DataLabels;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.Point;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.States;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.column.Tooltip;

public interface Column {


    boolean allowPointSelect();

    Column allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Column animation(boolean animation);

    String borderColor();

    Column borderColor(String borderColor);

    double borderRadius();

    Column borderRadius(double borderRadius);

    double borderWidth();

    Column borderWidth(double borderWidth);

    String color();

    Column color(String color);

    boolean colorByPoint();

    Column colorByPoint(boolean colorByPoint);

    ArrayString colors();

    Column colors(ArrayString colors);

    double cropThreshold();

    Column cropThreshold(double cropThreshold);

    String cursor();

    Column cursor(String cursor);

    DataLabels dataLabels();

    Column dataLabels(DataLabels dataLabels);

    double depth();

    Column depth(double depth);

    String edgeColor();

    Column edgeColor(String edgeColor);

    double edgeWidth();

    Column edgeWidth(double edgeWidth);

    boolean enableMouseTracking();

    Column enableMouseTracking(boolean enableMouseTracking);

    void addColumnAfterAnimateHandler(ColumnAfterAnimateHandler columnAfterAnimateHandler);

    void addColumnCheckboxClickHandler(ColumnCheckboxClickHandler columnCheckboxClickHandler);

    void addColumnClickHandler(ColumnClickHandler columnClickHandler);

    void addColumnHideHandler(ColumnHideHandler columnHideHandler);

    void addColumnLegendItemClickHandler(ColumnLegendItemClickHandler columnLegendItemClickHandler);

    void addColumnMouseOutHandler(ColumnMouseOutHandler columnMouseOutHandler);

    void addColumnMouseOverHandler(ColumnMouseOverHandler columnMouseOverHandler);

    void addColumnShowHandler(ColumnShowHandler columnShowHandler);

    double groupPadding();

    Column groupPadding(double groupPadding);

    double groupZPadding();

    Column groupZPadding(double groupZPadding);

    boolean grouping();

    Column grouping(boolean grouping);

    String linkedTo();

    Column linkedTo(String linkedTo);

    double minPointLength();

    Column minPointLength(double minPointLength);

    String negativeColor();

    Column negativeColor(String negativeColor);

    Point point();

    Column point(Point point);

    double pointInterval();

    Column pointInterval(double pointInterval);

    double pointPadding();

    Column pointPadding(double pointPadding);

    String pointPlacementAsString();

    Column pointPlacementAsString(String pointPlacementAsString);

    double pointPlacementAsNumber();

    Column pointPlacementAsNumber(double pointPlacementAsNumber);

    double pointRange();

    Column pointRange(double pointRange);

    double pointStart();

    Column pointStart(double pointStart);

    double pointWidth();

    Column pointWidth(double pointWidth);

    boolean selected();

    Column selected(boolean selected);

    boolean shadowAsBoolean();

    Column shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Column shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Column showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Column showInLegend(boolean showInLegend);

    String stacking();

    Column stacking(String stacking);

    States states();

    Column states(States states);

    boolean stickyTracking();

    Column stickyTracking(boolean stickyTracking);

    double threshold();

    Column threshold(double threshold);

    Tooltip tooltip();

    Column tooltip(Tooltip tooltip);

    double turboThreshold();

    Column turboThreshold(double turboThreshold);

    boolean visible();

    Column visible(boolean visible);

}
