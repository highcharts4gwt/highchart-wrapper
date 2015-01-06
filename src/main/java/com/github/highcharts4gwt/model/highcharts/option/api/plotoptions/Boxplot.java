
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.BoxplotShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.boxplot.Tooltip;

public interface Boxplot {


    boolean allowPointSelect();

    Boxplot allowPointSelect(boolean allowPointSelect);

    String color();

    Boxplot color(String color);

    boolean colorByPoint();

    Boxplot colorByPoint(boolean colorByPoint);

    ArrayString colors();

    Boxplot colors(ArrayString colors);

    String cursor();

    Boxplot cursor(String cursor);

    double depth();

    Boxplot depth(double depth);

    String edgeColor();

    Boxplot edgeColor(String edgeColor);

    double edgeWidth();

    Boxplot edgeWidth(double edgeWidth);

    boolean enableMouseTracking();

    Boxplot enableMouseTracking(boolean enableMouseTracking);

    void addBoxplotAfterAnimateHandler(BoxplotAfterAnimateHandler boxplotAfterAnimateHandler);

    void addBoxplotCheckboxClickHandler(BoxplotCheckboxClickHandler boxplotCheckboxClickHandler);

    void addBoxplotClickHandler(BoxplotClickHandler boxplotClickHandler);

    void addBoxplotHideHandler(BoxplotHideHandler boxplotHideHandler);

    void addBoxplotLegendItemClickHandler(BoxplotLegendItemClickHandler boxplotLegendItemClickHandler);

    void addBoxplotMouseOutHandler(BoxplotMouseOutHandler boxplotMouseOutHandler);

    void addBoxplotMouseOverHandler(BoxplotMouseOverHandler boxplotMouseOverHandler);

    void addBoxplotShowHandler(BoxplotShowHandler boxplotShowHandler);

    String fillColor();

    Boxplot fillColor(String fillColor);

    double groupPadding();

    Boxplot groupPadding(double groupPadding);

    double groupZPadding();

    Boxplot groupZPadding(double groupZPadding);

    boolean grouping();

    Boxplot grouping(boolean grouping);

    double lineWidth();

    Boxplot lineWidth(double lineWidth);

    String linkedTo();

    Boxplot linkedTo(String linkedTo);

    String medianColor();

    Boxplot medianColor(String medianColor);

    double medianWidth();

    Boxplot medianWidth(double medianWidth);

    String negativeColor();

    Boxplot negativeColor(String negativeColor);

    Point point();

    Boxplot point(Point point);

    double pointInterval();

    Boxplot pointInterval(double pointInterval);

    double pointPadding();

    Boxplot pointPadding(double pointPadding);

    String pointPlacementAsString();

    Boxplot pointPlacementAsString(String pointPlacementAsString);

    double pointPlacementAsNumber();

    Boxplot pointPlacementAsNumber(double pointPlacementAsNumber);

    double pointRange();

    Boxplot pointRange(double pointRange);

    double pointStart();

    Boxplot pointStart(double pointStart);

    double pointWidth();

    Boxplot pointWidth(double pointWidth);

    boolean selected();

    Boxplot selected(boolean selected);

    boolean showCheckbox();

    Boxplot showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Boxplot showInLegend(boolean showInLegend);

    States states();

    Boxplot states(States states);

    String stemColor();

    Boxplot stemColor(String stemColor);

    String stemDashStyle();

    Boxplot stemDashStyle(String stemDashStyle);

    double stemWidth();

    Boxplot stemWidth(double stemWidth);

    boolean stickyTracking();

    Boxplot stickyTracking(boolean stickyTracking);

    Tooltip tooltip();

    Boxplot tooltip(Tooltip tooltip);

    double turboThreshold();

    Boxplot turboThreshold(double turboThreshold);

    boolean visible();

    Boxplot visible(boolean visible);

    String whiskerColor();

    Boxplot whiskerColor(String whiskerColor);

    double whiskerLengthAsNumber();

    Boxplot whiskerLengthAsNumber(double whiskerLengthAsNumber);

    String whiskerLengthAsString();

    Boxplot whiskerLengthAsString(String whiskerLengthAsString);

    double whiskerWidth();

    Boxplot whiskerWidth(double whiskerWidth);

}
