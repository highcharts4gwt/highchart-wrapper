
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.Tooltip;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallShowHandler;

public interface Waterfall {


    boolean allowPointSelect();

    Waterfall allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Waterfall animation(boolean animation);

    String borderColor();

    Waterfall borderColor(String borderColor);

    double borderRadius();

    Waterfall borderRadius(double borderRadius);

    double borderWidth();

    Waterfall borderWidth(double borderWidth);

    String color();

    Waterfall color(String color);

    boolean colorByPoint();

    Waterfall colorByPoint(boolean colorByPoint);

    ArrayString colors();

    Waterfall colors(ArrayString colors);

    String cursor();

    Waterfall cursor(String cursor);

    String dashStyle();

    Waterfall dashStyle(String dashStyle);

    DataLabels dataLabels();

    Waterfall dataLabels(DataLabels dataLabels);

    double depth();

    Waterfall depth(double depth);

    String edgeColor();

    Waterfall edgeColor(String edgeColor);

    double edgeWidth();

    Waterfall edgeWidth(double edgeWidth);

    boolean enableMouseTracking();

    Waterfall enableMouseTracking(boolean enableMouseTracking);

    void addWaterfallAfterAnimateHandler(WaterfallAfterAnimateHandler waterfallAfterAnimateHandler);

    void addWaterfallCheckboxClickHandler(WaterfallCheckboxClickHandler waterfallCheckboxClickHandler);

    void addWaterfallClickHandler(WaterfallClickHandler waterfallClickHandler);

    void addWaterfallHideHandler(WaterfallHideHandler waterfallHideHandler);

    void addWaterfallLegendItemClickHandler(WaterfallLegendItemClickHandler waterfallLegendItemClickHandler);

    void addWaterfallMouseOutHandler(WaterfallMouseOutHandler waterfallMouseOutHandler);

    void addWaterfallMouseOverHandler(WaterfallMouseOverHandler waterfallMouseOverHandler);

    void addWaterfallShowHandler(WaterfallShowHandler waterfallShowHandler);

    double groupPadding();

    Waterfall groupPadding(double groupPadding);

    double groupZPadding();

    Waterfall groupZPadding(double groupZPadding);

    boolean grouping();

    Waterfall grouping(boolean grouping);

    String lineColor();

    Waterfall lineColor(String lineColor);

    String linkedTo();

    Waterfall linkedTo(String linkedTo);

    double minPointLength();

    Waterfall minPointLength(double minPointLength);

    Point point();

    Waterfall point(Point point);

    double pointInterval();

    Waterfall pointInterval(double pointInterval);

    double pointPadding();

    Waterfall pointPadding(double pointPadding);

    String pointPlacementAsString();

    Waterfall pointPlacementAsString(String pointPlacementAsString);

    double pointPlacementAsNumber();

    Waterfall pointPlacementAsNumber(double pointPlacementAsNumber);

    double pointRange();

    Waterfall pointRange(double pointRange);

    double pointStart();

    Waterfall pointStart(double pointStart);

    double pointWidth();

    Waterfall pointWidth(double pointWidth);

    boolean selected();

    Waterfall selected(boolean selected);

    boolean shadowAsBoolean();

    Waterfall shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Waterfall shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Waterfall showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Waterfall showInLegend(boolean showInLegend);

    States states();

    Waterfall states(States states);

    boolean stickyTracking();

    Waterfall stickyTracking(boolean stickyTracking);

    double threshold();

    Waterfall threshold(double threshold);

    Tooltip tooltip();

    Waterfall tooltip(Tooltip tooltip);

    String upColor();

    Waterfall upColor(String upColor);

    boolean visible();

    Waterfall visible(boolean visible);

}
