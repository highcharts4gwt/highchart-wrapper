
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.AreasplineShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areaspline.Tooltip;

public interface Areaspline {


    boolean allowPointSelect();

    Areaspline allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Areaspline animation(boolean animation);

    String color();

    Areaspline color(String color);

    boolean connectEnds();

    Areaspline connectEnds(boolean connectEnds);

    boolean connectNulls();

    Areaspline connectNulls(boolean connectNulls);

    double cropThreshold();

    Areaspline cropThreshold(double cropThreshold);

    String cursor();

    Areaspline cursor(String cursor);

    String dashStyle();

    Areaspline dashStyle(String dashStyle);

    DataLabels dataLabels();

    Areaspline dataLabels(DataLabels dataLabels);

    boolean enableMouseTracking();

    Areaspline enableMouseTracking(boolean enableMouseTracking);

    void addAreasplineAfterAnimateHandler(AreasplineAfterAnimateHandler areasplineAfterAnimateHandler);

    void addAreasplineCheckboxClickHandler(AreasplineCheckboxClickHandler areasplineCheckboxClickHandler);

    void addAreasplineClickHandler(AreasplineClickHandler areasplineClickHandler);

    void addAreasplineHideHandler(AreasplineHideHandler areasplineHideHandler);

    void addAreasplineLegendItemClickHandler(AreasplineLegendItemClickHandler areasplineLegendItemClickHandler);

    void addAreasplineMouseOutHandler(AreasplineMouseOutHandler areasplineMouseOutHandler);

    void addAreasplineMouseOverHandler(AreasplineMouseOverHandler areasplineMouseOverHandler);

    void addAreasplineShowHandler(AreasplineShowHandler areasplineShowHandler);

    String fillColor();

    Areaspline fillColor(String fillColor);

    double fillOpacity();

    Areaspline fillOpacity(double fillOpacity);

    String lineColor();

    Areaspline lineColor(String lineColor);

    double lineWidth();

    Areaspline lineWidth(double lineWidth);

    String linkedTo();

    Areaspline linkedTo(String linkedTo);

    Marker marker();

    Areaspline marker(Marker marker);

    String negativeColor();

    Areaspline negativeColor(String negativeColor);

    String negativeFillColor();

    Areaspline negativeFillColor(String negativeFillColor);

    Point point();

    Areaspline point(Point point);

    double pointInterval();

    Areaspline pointInterval(double pointInterval);

    String pointIntervalUnit();

    Areaspline pointIntervalUnit(String pointIntervalUnit);

    String pointPlacementAsString();

    Areaspline pointPlacementAsString(String pointPlacementAsString);

    double pointPlacementAsNumber();

    Areaspline pointPlacementAsNumber(double pointPlacementAsNumber);

    double pointStart();

    Areaspline pointStart(double pointStart);

    boolean selected();

    Areaspline selected(boolean selected);

    boolean shadowAsBoolean();

    Areaspline shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Areaspline shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Areaspline showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Areaspline showInLegend(boolean showInLegend);

    String stacking();

    Areaspline stacking(String stacking);

    States states();

    Areaspline states(States states);

    String step();

    Areaspline step(String step);

    boolean stickyTracking();

    Areaspline stickyTracking(boolean stickyTracking);

    double threshold();

    Areaspline threshold(double threshold);

    Tooltip tooltip();

    Areaspline tooltip(Tooltip tooltip);

    boolean trackByArea();

    Areaspline trackByArea(boolean trackByArea);

    double turboThreshold();

    Areaspline turboThreshold(double turboThreshold);

    boolean visible();

    Areaspline visible(boolean visible);

    String zoneAxis();

    Areaspline zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Areaspline zones(ArrayNumber zones);

}
