
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarShowHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.Point;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.States;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.Tooltip;

public interface Errorbar {


    boolean allowPointSelect();

    Errorbar allowPointSelect(boolean allowPointSelect);

    String color();

    Errorbar color(String color);

    boolean colorByPoint();

    Errorbar colorByPoint(boolean colorByPoint);

    ArrayString colors();

    Errorbar colors(ArrayString colors);

    String cursor();

    Errorbar cursor(String cursor);

    double depth();

    Errorbar depth(double depth);

    String edgeColor();

    Errorbar edgeColor(String edgeColor);

    double edgeWidth();

    Errorbar edgeWidth(double edgeWidth);

    boolean enableMouseTracking();

    Errorbar enableMouseTracking(boolean enableMouseTracking);

    void addErrorbarAfterAnimateHandler(ErrorbarAfterAnimateHandler errorbarAfterAnimateHandler);

    void addErrorbarCheckboxClickHandler(ErrorbarCheckboxClickHandler errorbarCheckboxClickHandler);

    void addErrorbarClickHandler(ErrorbarClickHandler errorbarClickHandler);

    void addErrorbarHideHandler(ErrorbarHideHandler errorbarHideHandler);

    void addErrorbarLegendItemClickHandler(ErrorbarLegendItemClickHandler errorbarLegendItemClickHandler);

    void addErrorbarMouseOutHandler(ErrorbarMouseOutHandler errorbarMouseOutHandler);

    void addErrorbarMouseOverHandler(ErrorbarMouseOverHandler errorbarMouseOverHandler);

    void addErrorbarShowHandler(ErrorbarShowHandler errorbarShowHandler);

    double groupZPadding();

    Errorbar groupZPadding(double groupZPadding);

    double lineWidth();

    Errorbar lineWidth(double lineWidth);

    String linkedTo();

    Errorbar linkedTo(String linkedTo);

    String negativeColor();

    Errorbar negativeColor(String negativeColor);

    Point point();

    Errorbar point(Point point);

    double pointInterval();

    Errorbar pointInterval(double pointInterval);

    double pointPadding();

    Errorbar pointPadding(double pointPadding);

    String pointPlacementAsString();

    Errorbar pointPlacementAsString(String pointPlacementAsString);

    double pointPlacementAsNumber();

    Errorbar pointPlacementAsNumber(double pointPlacementAsNumber);

    double pointRange();

    Errorbar pointRange(double pointRange);

    double pointStart();

    Errorbar pointStart(double pointStart);

    double pointWidth();

    Errorbar pointWidth(double pointWidth);

    boolean selected();

    Errorbar selected(boolean selected);

    States states();

    Errorbar states(States states);

    String stemColor();

    Errorbar stemColor(String stemColor);

    String stemDashStyle();

    Errorbar stemDashStyle(String stemDashStyle);

    double stemWidth();

    Errorbar stemWidth(double stemWidth);

    boolean stickyTracking();

    Errorbar stickyTracking(boolean stickyTracking);

    Tooltip tooltip();

    Errorbar tooltip(Tooltip tooltip);

    double turboThreshold();

    Errorbar turboThreshold(double turboThreshold);

    boolean visible();

    Errorbar visible(boolean visible);

    String whiskerColor();

    Errorbar whiskerColor(String whiskerColor);

    double whiskerLengthAsNumber();

    Errorbar whiskerLengthAsNumber(double whiskerLengthAsNumber);

    String whiskerLengthAsString();

    Errorbar whiskerLengthAsString(String whiskerLengthAsString);

    double whiskerWidth();

    Errorbar whiskerWidth(double whiskerWidth);

}
