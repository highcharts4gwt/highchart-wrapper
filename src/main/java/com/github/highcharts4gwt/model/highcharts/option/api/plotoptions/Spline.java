
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.SplineShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.spline.Tooltip;

public interface Spline {


    boolean allowPointSelect();

    Spline allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Spline animation(boolean animation);

    String color();

    Spline color(String color);

    boolean connectEnds();

    Spline connectEnds(boolean connectEnds);

    boolean connectNulls();

    Spline connectNulls(boolean connectNulls);

    double cropThreshold();

    Spline cropThreshold(double cropThreshold);

    String cursor();

    Spline cursor(String cursor);

    String dashStyle();

    Spline dashStyle(String dashStyle);

    DataLabels dataLabels();

    Spline dataLabels(DataLabels dataLabels);

    boolean enableMouseTracking();

    Spline enableMouseTracking(boolean enableMouseTracking);

    void addSplineAfterAnimateHandler(SplineAfterAnimateHandler splineAfterAnimateHandler);

    void addSplineCheckboxClickHandler(SplineCheckboxClickHandler splineCheckboxClickHandler);

    void addSplineClickHandler(SplineClickHandler splineClickHandler);

    void addSplineHideHandler(SplineHideHandler splineHideHandler);

    void addSplineLegendItemClickHandler(SplineLegendItemClickHandler splineLegendItemClickHandler);

    void addSplineMouseOutHandler(SplineMouseOutHandler splineMouseOutHandler);

    void addSplineMouseOverHandler(SplineMouseOverHandler splineMouseOverHandler);

    void addSplineShowHandler(SplineShowHandler splineShowHandler);

    double lineWidth();

    Spline lineWidth(double lineWidth);

    String linkedTo();

    Spline linkedTo(String linkedTo);

    Marker marker();

    Spline marker(Marker marker);

    String negativeColor();

    Spline negativeColor(String negativeColor);

    Point point();

    Spline point(Point point);

    double pointInterval();

    Spline pointInterval(double pointInterval);

    String pointIntervalUnit();

    Spline pointIntervalUnit(String pointIntervalUnit);

    String pointPlacementAsString();

    Spline pointPlacementAsString(String pointPlacementAsString);

    double pointPlacementAsNumber();

    Spline pointPlacementAsNumber(double pointPlacementAsNumber);

    double pointStart();

    Spline pointStart(double pointStart);

    boolean selected();

    Spline selected(boolean selected);

    boolean shadowAsBoolean();

    Spline shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Spline shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Spline showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Spline showInLegend(boolean showInLegend);

    String stacking();

    Spline stacking(String stacking);

    States states();

    Spline states(States states);

    boolean stickyTracking();

    Spline stickyTracking(boolean stickyTracking);

    double threshold();

    Spline threshold(double threshold);

    Tooltip tooltip();

    Spline tooltip(Tooltip tooltip);

    double turboThreshold();

    Spline turboThreshold(double turboThreshold);

    boolean visible();

    Spline visible(boolean visible);

    String zoneAxis();

    Spline zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Spline zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    Spline setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
