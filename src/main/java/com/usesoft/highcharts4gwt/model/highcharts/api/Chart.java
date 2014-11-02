
package com.usesoft.highcharts4gwt.model.highcharts.api;

import com.usesoft.highcharts4gwt.model.array.api.ArrayNumber;
import com.usesoft.highcharts4gwt.model.highcharts.api.chart.Events;
import com.usesoft.highcharts4gwt.model.highcharts.api.chart.Options3d;
import com.usesoft.highcharts4gwt.model.highcharts.api.chart.ResetZoomButton;

public interface Chart {


    boolean alignTicks();

    Chart alignTicks(boolean alignTicks);

    boolean animationAsBoolean();

    Chart animationAsBoolean(boolean animationAsBoolean);

    String animationAsJsonString();

    Chart animationAsJsonString(String animationAsJsonString);

    String backgroundColor();

    Chart backgroundColor(String backgroundColor);

    String borderColor();

    Chart borderColor(String borderColor);

    Number borderRadius();

    Chart borderRadius(Number borderRadius);

    Number borderWidth();

    Chart borderWidth(Number borderWidth);

    String className();

    Chart className(String className);

    String defaultSeriesType();

    Chart defaultSeriesType(String defaultSeriesType);

    Events events();

    Chart events(Events events);

    Number height();

    Chart height(Number height);

    boolean ignoreHiddenSeries();

    Chart ignoreHiddenSeries(boolean ignoreHiddenSeries);

    boolean inverted();

    Chart inverted(boolean inverted);

    ArrayNumber margin();

    Chart margin(ArrayNumber margin);

    Number marginBottom();

    Chart marginBottom(Number marginBottom);

    Number marginLeft();

    Chart marginLeft(Number marginLeft);

    Number marginRight();

    Chart marginRight(Number marginRight);

    Number marginTop();

    Chart marginTop(Number marginTop);

    Options3d options3d();

    Chart options3d(Options3d options3d);

    String panKey();

    Chart panKey(String panKey);

    boolean panning();

    Chart panning(boolean panning);

    String pinchType();

    Chart pinchType(String pinchType);

    String plotBackgroundColor();

    Chart plotBackgroundColor(String plotBackgroundColor);

    String plotBackgroundImage();

    Chart plotBackgroundImage(String plotBackgroundImage);

    String plotBorderColor();

    Chart plotBorderColor(String plotBorderColor);

    Number plotBorderWidth();

    Chart plotBorderWidth(Number plotBorderWidth);

    boolean plotShadowAsBoolean();

    Chart plotShadowAsBoolean(boolean plotShadowAsBoolean);

    String plotShadowAsJsonString();

    Chart plotShadowAsJsonString(String plotShadowAsJsonString);

    boolean polar();

    Chart polar(boolean polar);

    boolean reflow();

    Chart reflow(boolean reflow);

    String renderToAsString();

    Chart renderToAsString(String renderToAsString);

    String renderToAsJsonString();

    Chart renderToAsJsonString(String renderToAsJsonString);

    ResetZoomButton resetZoomButton();

    Chart resetZoomButton(ResetZoomButton resetZoomButton);

    String selectionMarkerFill();

    Chart selectionMarkerFill(String selectionMarkerFill);

    boolean shadowAsBoolean();

    Chart shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Chart shadowAsJsonString(String shadowAsJsonString);

    boolean showAxes();

    Chart showAxes(boolean showAxes);

    ArrayNumber spacing();

    Chart spacing(ArrayNumber spacing);

    Number spacingBottom();

    Chart spacingBottom(Number spacingBottom);

    Number spacingLeft();

    Chart spacingLeft(Number spacingLeft);

    Number spacingRight();

    Chart spacingRight(Number spacingRight);

    Number spacingTop();

    Chart spacingTop(Number spacingTop);

    String style();

    Chart style(String styleAsJsonString);

    String type();

    Chart type(String type);

    Number width();

    Chart width(Number width);

    String zoomType();

    Chart zoomType(String zoomType);

}
