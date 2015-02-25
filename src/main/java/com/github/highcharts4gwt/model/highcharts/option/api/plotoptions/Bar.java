
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.BarShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bar.Tooltip;

public interface Bar {


    boolean allowPointSelect();

    Bar allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Bar animation(boolean animation);

    String borderColor();

    Bar borderColor(String borderColor);

    double borderRadius();

    Bar borderRadius(double borderRadius);

    double borderWidth();

    Bar borderWidth(double borderWidth);

    String color();

    Bar color(String color);

    boolean colorByPoint();

    Bar colorByPoint(boolean colorByPoint);

    ArrayString colors();

    Bar colors(ArrayString colors);

    double cropThreshold();

    Bar cropThreshold(double cropThreshold);

    String cursor();

    Bar cursor(String cursor);

    DataLabels dataLabels();

    Bar dataLabels(DataLabels dataLabels);

    double depth();

    Bar depth(double depth);

    String edgeColor();

    Bar edgeColor(String edgeColor);

    double edgeWidth();

    Bar edgeWidth(double edgeWidth);

    boolean enableMouseTracking();

    Bar enableMouseTracking(boolean enableMouseTracking);

    void addBarAfterAnimateHandler(BarAfterAnimateHandler barAfterAnimateHandler);

    void addBarCheckboxClickHandler(BarCheckboxClickHandler barCheckboxClickHandler);

    void addBarClickHandler(BarClickHandler barClickHandler);

    void addBarHideHandler(BarHideHandler barHideHandler);

    void addBarLegendItemClickHandler(BarLegendItemClickHandler barLegendItemClickHandler);

    void addBarMouseOutHandler(BarMouseOutHandler barMouseOutHandler);

    void addBarMouseOverHandler(BarMouseOverHandler barMouseOverHandler);

    void addBarShowHandler(BarShowHandler barShowHandler);

    double groupPadding();

    Bar groupPadding(double groupPadding);

    double groupZPadding();

    Bar groupZPadding(double groupZPadding);

    boolean grouping();

    Bar grouping(boolean grouping);

    String linkedTo();

    Bar linkedTo(String linkedTo);

    double minPointLength();

    Bar minPointLength(double minPointLength);

    String negativeColor();

    Bar negativeColor(String negativeColor);

    Point point();

    Bar point(Point point);

    double pointInterval();

    Bar pointInterval(double pointInterval);

    String pointIntervalUnit();

    Bar pointIntervalUnit(String pointIntervalUnit);

    double pointPadding();

    Bar pointPadding(double pointPadding);

    String pointPlacementAsString();

    Bar pointPlacementAsString(String pointPlacementAsString);

    double pointPlacementAsNumber();

    Bar pointPlacementAsNumber(double pointPlacementAsNumber);

    double pointRange();

    Bar pointRange(double pointRange);

    double pointStart();

    Bar pointStart(double pointStart);

    double pointWidth();

    Bar pointWidth(double pointWidth);

    boolean selected();

    Bar selected(boolean selected);

    boolean shadowAsBoolean();

    Bar shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Bar shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Bar showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Bar showInLegend(boolean showInLegend);

    String stacking();

    Bar stacking(String stacking);

    States states();

    Bar states(States states);

    boolean stickyTracking();

    Bar stickyTracking(boolean stickyTracking);

    double threshold();

    Bar threshold(double threshold);

    Tooltip tooltip();

    Bar tooltip(Tooltip tooltip);

    double turboThreshold();

    Bar turboThreshold(double turboThreshold);

    boolean visible();

    Bar visible(boolean visible);

    String zoneAxis();

    Bar zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Bar zones(ArrayNumber zones);

}
