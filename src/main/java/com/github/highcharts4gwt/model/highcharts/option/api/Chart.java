
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartAddSeriesHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartAfterPrintHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartBeforePrintHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartDrilldownHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartDrillupHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartLoadHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartRedrawHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ChartSelectionHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.Options3d;
import com.github.highcharts4gwt.model.highcharts.option.api.chart.ResetZoomButton;

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

    double borderRadius();

    Chart borderRadius(double borderRadius);

    double borderWidth();

    Chart borderWidth(double borderWidth);

    String className();

    Chart className(String className);

    String defaultSeriesType();

    Chart defaultSeriesType(String defaultSeriesType);

    void addChartAddSeriesHandler(ChartAddSeriesHandler chartAddSeriesHandler);

    void addChartAfterPrintHandler(ChartAfterPrintHandler chartAfterPrintHandler);

    void addChartBeforePrintHandler(ChartBeforePrintHandler chartBeforePrintHandler);

    void addChartClickHandler(ChartClickHandler chartClickHandler);

    void addChartDrilldownHandler(ChartDrilldownHandler chartDrilldownHandler);

    void addChartDrillupHandler(ChartDrillupHandler chartDrillupHandler);

    void addChartLoadHandler(ChartLoadHandler chartLoadHandler);

    void addChartRedrawHandler(ChartRedrawHandler chartRedrawHandler);

    void addChartSelectionHandler(ChartSelectionHandler chartSelectionHandler);

    double height();

    Chart height(double height);

    boolean ignoreHiddenSeries();

    Chart ignoreHiddenSeries(boolean ignoreHiddenSeries);

    boolean inverted();

    Chart inverted(boolean inverted);

    ArrayNumber margin();

    Chart margin(ArrayNumber margin);

    double marginBottom();

    Chart marginBottom(double marginBottom);

    double marginLeft();

    Chart marginLeft(double marginLeft);

    double marginRight();

    Chart marginRight(double marginRight);

    double marginTop();

    Chart marginTop(double marginTop);

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

    double plotBorderWidth();

    Chart plotBorderWidth(double plotBorderWidth);

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

    double spacingBottom();

    Chart spacingBottom(double spacingBottom);

    double spacingLeft();

    Chart spacingLeft(double spacingLeft);

    double spacingRight();

    Chart spacingRight(double spacingRight);

    double spacingTop();

    Chart spacingTop(double spacingTop);

    String style();

    Chart style(String styleAsJsonString);

    String type();

    Chart type(String type);

    double width();

    Chart width(double width);

    String zoomType();

    Chart zoomType(String zoomType);

}
