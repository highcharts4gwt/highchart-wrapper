
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.Tooltip;

public interface Columnrange {


    boolean allowPointSelect();

    Columnrange allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Columnrange animation(boolean animation);

    String borderColor();

    Columnrange borderColor(String borderColor);

    double borderRadius();

    Columnrange borderRadius(double borderRadius);

    double borderWidth();

    Columnrange borderWidth(double borderWidth);

    String color();

    Columnrange color(String color);

    boolean colorByPoint();

    Columnrange colorByPoint(boolean colorByPoint);

    ArrayString colors();

    Columnrange colors(ArrayString colors);

    double cropThreshold();

    Columnrange cropThreshold(double cropThreshold);

    String cursor();

    Columnrange cursor(String cursor);

    DataLabels dataLabels();

    Columnrange dataLabels(DataLabels dataLabels);

    double depth();

    Columnrange depth(double depth);

    String edgeColor();

    Columnrange edgeColor(String edgeColor);

    double edgeWidth();

    Columnrange edgeWidth(double edgeWidth);

    boolean enableMouseTracking();

    Columnrange enableMouseTracking(boolean enableMouseTracking);

    void addColumnrangeAfterAnimateHandler(ColumnrangeAfterAnimateHandler columnrangeAfterAnimateHandler);

    void addColumnrangeCheckboxClickHandler(ColumnrangeCheckboxClickHandler columnrangeCheckboxClickHandler);

    void addColumnrangeClickHandler(ColumnrangeClickHandler columnrangeClickHandler);

    void addColumnrangeHideHandler(ColumnrangeHideHandler columnrangeHideHandler);

    void addColumnrangeLegendItemClickHandler(ColumnrangeLegendItemClickHandler columnrangeLegendItemClickHandler);

    void addColumnrangeMouseOutHandler(ColumnrangeMouseOutHandler columnrangeMouseOutHandler);

    void addColumnrangeMouseOverHandler(ColumnrangeMouseOverHandler columnrangeMouseOverHandler);

    void addColumnrangeShowHandler(ColumnrangeShowHandler columnrangeShowHandler);

    double groupPadding();

    Columnrange groupPadding(double groupPadding);

    double groupZPadding();

    Columnrange groupZPadding(double groupZPadding);

    boolean grouping();

    Columnrange grouping(boolean grouping);

    String linkedTo();

    Columnrange linkedTo(String linkedTo);

    double minPointLength();

    Columnrange minPointLength(double minPointLength);

    Point point();

    Columnrange point(Point point);

    double pointInterval();

    Columnrange pointInterval(double pointInterval);

    String pointIntervalUnit();

    Columnrange pointIntervalUnit(String pointIntervalUnit);

    double pointPadding();

    Columnrange pointPadding(double pointPadding);

    String pointPlacementAsString();

    Columnrange pointPlacementAsString(String pointPlacementAsString);

    double pointPlacementAsNumber();

    Columnrange pointPlacementAsNumber(double pointPlacementAsNumber);

    double pointRange();

    Columnrange pointRange(double pointRange);

    double pointStart();

    Columnrange pointStart(double pointStart);

    double pointWidth();

    Columnrange pointWidth(double pointWidth);

    boolean selected();

    Columnrange selected(boolean selected);

    boolean shadowAsBoolean();

    Columnrange shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Columnrange shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Columnrange showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Columnrange showInLegend(boolean showInLegend);

    States states();

    Columnrange states(States states);

    boolean stickyTracking();

    Columnrange stickyTracking(boolean stickyTracking);

    double threshold();

    Columnrange threshold(double threshold);

    Tooltip tooltip();

    Columnrange tooltip(Tooltip tooltip);

    double turboThreshold();

    Columnrange turboThreshold(double turboThreshold);

    boolean visible();

    Columnrange visible(boolean visible);

    String zoneAxis();

    Columnrange zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Columnrange zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    Columnrange setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
