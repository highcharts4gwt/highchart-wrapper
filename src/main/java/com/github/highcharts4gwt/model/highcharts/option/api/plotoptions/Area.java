
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.AreaShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.area.Tooltip;

public interface Area {


    boolean allowPointSelect();

    Area allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Area animation(boolean animation);

    String color();

    Area color(String color);

    boolean connectEnds();

    Area connectEnds(boolean connectEnds);

    boolean connectNulls();

    Area connectNulls(boolean connectNulls);

    double cropThreshold();

    Area cropThreshold(double cropThreshold);

    String cursor();

    Area cursor(String cursor);

    String dashStyle();

    Area dashStyle(String dashStyle);

    DataLabels dataLabels();

    Area dataLabels(DataLabels dataLabels);

    boolean enableMouseTracking();

    Area enableMouseTracking(boolean enableMouseTracking);

    void addAreaAfterAnimateHandler(AreaAfterAnimateHandler areaAfterAnimateHandler);

    void addAreaCheckboxClickHandler(AreaCheckboxClickHandler areaCheckboxClickHandler);

    void addAreaClickHandler(AreaClickHandler areaClickHandler);

    void addAreaHideHandler(AreaHideHandler areaHideHandler);

    void addAreaLegendItemClickHandler(AreaLegendItemClickHandler areaLegendItemClickHandler);

    void addAreaMouseOutHandler(AreaMouseOutHandler areaMouseOutHandler);

    void addAreaMouseOverHandler(AreaMouseOverHandler areaMouseOverHandler);

    void addAreaShowHandler(AreaShowHandler areaShowHandler);

    String fillColor();

    Area fillColor(String fillColor);

    double fillOpacity();

    Area fillOpacity(double fillOpacity);

    String lineColor();

    Area lineColor(String lineColor);

    double lineWidth();

    Area lineWidth(double lineWidth);

    String linkedTo();

    Area linkedTo(String linkedTo);

    Marker marker();

    Area marker(Marker marker);

    String negativeColor();

    Area negativeColor(String negativeColor);

    String negativeFillColor();

    Area negativeFillColor(String negativeFillColor);

    Point point();

    Area point(Point point);

    double pointInterval();

    Area pointInterval(double pointInterval);

    String pointPlacementAsString();

    Area pointPlacementAsString(String pointPlacementAsString);

    double pointPlacementAsNumber();

    Area pointPlacementAsNumber(double pointPlacementAsNumber);

    double pointStart();

    Area pointStart(double pointStart);

    boolean selected();

    Area selected(boolean selected);

    boolean shadowAsBoolean();

    Area shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Area shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Area showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Area showInLegend(boolean showInLegend);

    String stacking();

    Area stacking(String stacking);

    States states();

    Area states(States states);

    String step();

    Area step(String step);

    boolean stickyTracking();

    Area stickyTracking(boolean stickyTracking);

    double threshold();

    Area threshold(double threshold);

    Tooltip tooltip();

    Area tooltip(Tooltip tooltip);

    boolean trackByArea();

    Area trackByArea(boolean trackByArea);

    double turboThreshold();

    Area turboThreshold(double turboThreshold);

    boolean visible();

    Area visible(boolean visible);

}
