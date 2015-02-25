
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.LineShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.line.Tooltip;

public interface Line {


    boolean allowPointSelect();

    Line allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Line animation(boolean animation);

    String color();

    Line color(String color);

    boolean connectEnds();

    Line connectEnds(boolean connectEnds);

    boolean connectNulls();

    Line connectNulls(boolean connectNulls);

    double cropThreshold();

    Line cropThreshold(double cropThreshold);

    String cursor();

    Line cursor(String cursor);

    String dashStyle();

    Line dashStyle(String dashStyle);

    DataLabels dataLabels();

    Line dataLabels(DataLabels dataLabels);

    boolean enableMouseTracking();

    Line enableMouseTracking(boolean enableMouseTracking);

    void addLineAfterAnimateHandler(LineAfterAnimateHandler lineAfterAnimateHandler);

    void addLineCheckboxClickHandler(LineCheckboxClickHandler lineCheckboxClickHandler);

    void addLineClickHandler(LineClickHandler lineClickHandler);

    void addLineHideHandler(LineHideHandler lineHideHandler);

    void addLineLegendItemClickHandler(LineLegendItemClickHandler lineLegendItemClickHandler);

    void addLineMouseOutHandler(LineMouseOutHandler lineMouseOutHandler);

    void addLineMouseOverHandler(LineMouseOverHandler lineMouseOverHandler);

    void addLineShowHandler(LineShowHandler lineShowHandler);

    double lineWidth();

    Line lineWidth(double lineWidth);

    String linkedTo();

    Line linkedTo(String linkedTo);

    Marker marker();

    Line marker(Marker marker);

    String negativeColor();

    Line negativeColor(String negativeColor);

    Point point();

    Line point(Point point);

    double pointInterval();

    Line pointInterval(double pointInterval);

    String pointIntervalUnit();

    Line pointIntervalUnit(String pointIntervalUnit);

    String pointPlacementAsString();

    Line pointPlacementAsString(String pointPlacementAsString);

    double pointPlacementAsNumber();

    Line pointPlacementAsNumber(double pointPlacementAsNumber);

    double pointStart();

    Line pointStart(double pointStart);

    boolean selected();

    Line selected(boolean selected);

    boolean shadowAsBoolean();

    Line shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Line shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Line showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Line showInLegend(boolean showInLegend);

    String stacking();

    Line stacking(String stacking);

    States states();

    Line states(States states);

    String step();

    Line step(String step);

    boolean stickyTracking();

    Line stickyTracking(boolean stickyTracking);

    double threshold();

    Line threshold(double threshold);

    Tooltip tooltip();

    Line tooltip(Tooltip tooltip);

    double turboThreshold();

    Line turboThreshold(double turboThreshold);

    boolean visible();

    Line visible(boolean visible);

    String zoneAxis();

    Line zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Line zones(ArrayNumber zones);

}
