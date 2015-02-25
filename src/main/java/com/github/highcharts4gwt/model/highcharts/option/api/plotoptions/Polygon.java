
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.PolygonShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.polygon.Tooltip;

public interface Polygon {


    boolean allowPointSelect();

    Polygon allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Polygon animation(boolean animation);

    String color();

    Polygon color(String color);

    double cropThreshold();

    Polygon cropThreshold(double cropThreshold);

    String cursor();

    Polygon cursor(String cursor);

    String dashStyle();

    Polygon dashStyle(String dashStyle);

    DataLabels dataLabels();

    Polygon dataLabels(DataLabels dataLabels);

    boolean enableMouseTracking();

    Polygon enableMouseTracking(boolean enableMouseTracking);

    void addPolygonAfterAnimateHandler(PolygonAfterAnimateHandler polygonAfterAnimateHandler);

    void addPolygonCheckboxClickHandler(PolygonCheckboxClickHandler polygonCheckboxClickHandler);

    void addPolygonClickHandler(PolygonClickHandler polygonClickHandler);

    void addPolygonHideHandler(PolygonHideHandler polygonHideHandler);

    void addPolygonLegendItemClickHandler(PolygonLegendItemClickHandler polygonLegendItemClickHandler);

    void addPolygonMouseOutHandler(PolygonMouseOutHandler polygonMouseOutHandler);

    void addPolygonMouseOverHandler(PolygonMouseOverHandler polygonMouseOverHandler);

    void addPolygonShowHandler(PolygonShowHandler polygonShowHandler);

    double lineWidth();

    Polygon lineWidth(double lineWidth);

    String linkedTo();

    Polygon linkedTo(String linkedTo);

    Marker marker();

    Polygon marker(Marker marker);

    String negativeColor();

    Polygon negativeColor(String negativeColor);

    Point point();

    Polygon point(Point point);

    double pointInterval();

    Polygon pointInterval(double pointInterval);

    String pointIntervalUnit();

    Polygon pointIntervalUnit(String pointIntervalUnit);

    double pointStart();

    Polygon pointStart(double pointStart);

    boolean selected();

    Polygon selected(boolean selected);

    boolean shadowAsBoolean();

    Polygon shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Polygon shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Polygon showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Polygon showInLegend(boolean showInLegend);

    States states();

    Polygon states(States states);

    boolean stickyTracking();

    Polygon stickyTracking(boolean stickyTracking);

    double threshold();

    Polygon threshold(double threshold);

    Tooltip tooltip();

    Polygon tooltip(Tooltip tooltip);

    double turboThreshold();

    Polygon turboThreshold(double turboThreshold);

    boolean visible();

    Polygon visible(boolean visible);

    String zoneAxis();

    Polygon zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Polygon zones(ArrayNumber zones);

}
