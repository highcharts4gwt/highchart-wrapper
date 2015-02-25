
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.Array;
import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Level;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.Tooltip;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapShowHandler;

public interface Treemap {


    boolean allowDrillToNode();

    Treemap allowDrillToNode(boolean allowDrillToNode);

    boolean allowPointSelect();

    Treemap allowPointSelect(boolean allowPointSelect);

    boolean alternateStartingDirection();

    Treemap alternateStartingDirection(boolean alternateStartingDirection);

    boolean animation();

    Treemap animation(boolean animation);

    double borderColor();

    Treemap borderColor(double borderColor);

    double borderWidth();

    Treemap borderWidth(double borderWidth);

    String color();

    Treemap color(String color);

    boolean colorByPoint();

    Treemap colorByPoint(boolean colorByPoint);

    ArrayString colors();

    Treemap colors(ArrayString colors);

    double cropThreshold();

    Treemap cropThreshold(double cropThreshold);

    String cursor();

    Treemap cursor(String cursor);

    DataLabels dataLabels();

    Treemap dataLabels(DataLabels dataLabels);

    boolean enableMouseTracking();

    Treemap enableMouseTracking(boolean enableMouseTracking);

    void addTreemapAfterAnimateHandler(TreemapAfterAnimateHandler treemapAfterAnimateHandler);

    void addTreemapCheckboxClickHandler(TreemapCheckboxClickHandler treemapCheckboxClickHandler);

    void addTreemapClickHandler(TreemapClickHandler treemapClickHandler);

    void addTreemapHideHandler(TreemapHideHandler treemapHideHandler);

    void addTreemapLegendItemClickHandler(TreemapLegendItemClickHandler treemapLegendItemClickHandler);

    void addTreemapMouseOutHandler(TreemapMouseOutHandler treemapMouseOutHandler);

    void addTreemapMouseOverHandler(TreemapMouseOverHandler treemapMouseOverHandler);

    void addTreemapShowHandler(TreemapShowHandler treemapShowHandler);

    String layoutStartingDirection();

    Treemap layoutStartingDirection(String layoutStartingDirection);

    boolean levelIsConstant();

    Treemap levelIsConstant(boolean levelIsConstant);

    Array<Level> levels();

    Treemap levels(Array<Level> levels);

    String linkedTo();

    Treemap linkedTo(String linkedTo);

    Point point();

    Treemap point(Point point);

    boolean selected();

    Treemap selected(boolean selected);

    boolean shadowAsBoolean();

    Treemap shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Treemap shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Treemap showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Treemap showInLegend(boolean showInLegend);

    States states();

    Treemap states(States states);

    boolean stickyTracking();

    Treemap stickyTracking(boolean stickyTracking);

    Tooltip tooltip();

    Treemap tooltip(Tooltip tooltip);

    double turboThreshold();

    Treemap turboThreshold(double turboThreshold);

    boolean visible();

    Treemap visible(boolean visible);

    String zoneAxis();

    Treemap zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Treemap zones(ArrayNumber zones);

}
