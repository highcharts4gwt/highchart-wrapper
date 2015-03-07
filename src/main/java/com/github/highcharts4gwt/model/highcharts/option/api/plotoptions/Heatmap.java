
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.Tooltip;

public interface Heatmap {


    boolean allowPointSelect();

    Heatmap allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Heatmap animation(boolean animation);

    String borderColor();

    Heatmap borderColor(String borderColor);

    double borderRadius();

    Heatmap borderRadius(double borderRadius);

    double borderWidth();

    Heatmap borderWidth(double borderWidth);

    String color();

    Heatmap color(String color);

    boolean colorByPoint();

    Heatmap colorByPoint(boolean colorByPoint);

    ArrayString colors();

    Heatmap colors(ArrayString colors);

    double colsize();

    Heatmap colsize(double colsize);

    double cropThreshold();

    Heatmap cropThreshold(double cropThreshold);

    String cursor();

    Heatmap cursor(String cursor);

    DataLabels dataLabels();

    Heatmap dataLabels(DataLabels dataLabels);

    boolean enableMouseTracking();

    Heatmap enableMouseTracking(boolean enableMouseTracking);

    void addHeatmapAfterAnimateHandler(HeatmapAfterAnimateHandler heatmapAfterAnimateHandler);

    void addHeatmapCheckboxClickHandler(HeatmapCheckboxClickHandler heatmapCheckboxClickHandler);

    void addHeatmapClickHandler(HeatmapClickHandler heatmapClickHandler);

    void addHeatmapHideHandler(HeatmapHideHandler heatmapHideHandler);

    void addHeatmapLegendItemClickHandler(HeatmapLegendItemClickHandler heatmapLegendItemClickHandler);

    void addHeatmapMouseOutHandler(HeatmapMouseOutHandler heatmapMouseOutHandler);

    void addHeatmapMouseOverHandler(HeatmapMouseOverHandler heatmapMouseOverHandler);

    void addHeatmapShowHandler(HeatmapShowHandler heatmapShowHandler);

    String linkedTo();

    Heatmap linkedTo(String linkedTo);

    Point point();

    Heatmap point(Point point);

    double rowsize();

    Heatmap rowsize(double rowsize);

    boolean selected();

    Heatmap selected(boolean selected);

    boolean shadowAsBoolean();

    Heatmap shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Heatmap shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Heatmap showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Heatmap showInLegend(boolean showInLegend);

    States states();

    Heatmap states(States states);

    boolean stickyTracking();

    Heatmap stickyTracking(boolean stickyTracking);

    Tooltip tooltip();

    Heatmap tooltip(Tooltip tooltip);

    double turboThreshold();

    Heatmap turboThreshold(double turboThreshold);

    boolean visible();

    Heatmap visible(boolean visible);

    String zoneAxis();

    Heatmap zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Heatmap zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    Heatmap setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
