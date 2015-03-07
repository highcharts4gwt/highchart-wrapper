
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.BubbleShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.bubble.Tooltip;

public interface Bubble {


    boolean allowPointSelect();

    Bubble allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Bubble animation(boolean animation);

    String color();

    Bubble color(String color);

    double cropThreshold();

    Bubble cropThreshold(double cropThreshold);

    String cursor();

    Bubble cursor(String cursor);

    String dashStyle();

    Bubble dashStyle(String dashStyle);

    DataLabels dataLabels();

    Bubble dataLabels(DataLabels dataLabels);

    boolean displayNegative();

    Bubble displayNegative(boolean displayNegative);

    boolean enableMouseTracking();

    Bubble enableMouseTracking(boolean enableMouseTracking);

    void addBubbleAfterAnimateHandler(BubbleAfterAnimateHandler bubbleAfterAnimateHandler);

    void addBubbleCheckboxClickHandler(BubbleCheckboxClickHandler bubbleCheckboxClickHandler);

    void addBubbleClickHandler(BubbleClickHandler bubbleClickHandler);

    void addBubbleHideHandler(BubbleHideHandler bubbleHideHandler);

    void addBubbleLegendItemClickHandler(BubbleLegendItemClickHandler bubbleLegendItemClickHandler);

    void addBubbleMouseOutHandler(BubbleMouseOutHandler bubbleMouseOutHandler);

    void addBubbleMouseOverHandler(BubbleMouseOverHandler bubbleMouseOverHandler);

    void addBubbleShowHandler(BubbleShowHandler bubbleShowHandler);

    double lineWidth();

    Bubble lineWidth(double lineWidth);

    String linkedTo();

    Bubble linkedTo(String linkedTo);

    Marker marker();

    Bubble marker(Marker marker);

    String maxSize();

    Bubble maxSize(String maxSize);

    String minSize();

    Bubble minSize(String minSize);

    String negativeColor();

    Bubble negativeColor(String negativeColor);

    Point point();

    Bubble point(Point point);

    double pointInterval();

    Bubble pointInterval(double pointInterval);

    String pointIntervalUnit();

    Bubble pointIntervalUnit(String pointIntervalUnit);

    double pointStart();

    Bubble pointStart(double pointStart);

    boolean selected();

    Bubble selected(boolean selected);

    boolean shadowAsBoolean();

    Bubble shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Bubble shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Bubble showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Bubble showInLegend(boolean showInLegend);

    String sizeBy();

    Bubble sizeBy(String sizeBy);

    States states();

    Bubble states(States states);

    boolean stickyTracking();

    Bubble stickyTracking(boolean stickyTracking);

    double threshold();

    Bubble threshold(double threshold);

    Tooltip tooltip();

    Bubble tooltip(Tooltip tooltip);

    boolean visible();

    Bubble visible(boolean visible);

    double zMax();

    Bubble zMax(double zMax);

    double zMin();

    Bubble zMin(double zMin);

    double zThreshold();

    Bubble zThreshold(double zThreshold);

    String zoneAxis();

    Bubble zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Bubble zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    Bubble setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
