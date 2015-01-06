
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.Marker;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.ScatterShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.scatter.Tooltip;

public interface Scatter {


    boolean allowPointSelect();

    Scatter allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Scatter animation(boolean animation);

    String color();

    Scatter color(String color);

    double cropThreshold();

    Scatter cropThreshold(double cropThreshold);

    String cursor();

    Scatter cursor(String cursor);

    String dashStyle();

    Scatter dashStyle(String dashStyle);

    DataLabels dataLabels();

    Scatter dataLabels(DataLabels dataLabels);

    boolean enableMouseTracking();

    Scatter enableMouseTracking(boolean enableMouseTracking);

    void addScatterAfterAnimateHandler(ScatterAfterAnimateHandler scatterAfterAnimateHandler);

    void addScatterCheckboxClickHandler(ScatterCheckboxClickHandler scatterCheckboxClickHandler);

    void addScatterClickHandler(ScatterClickHandler scatterClickHandler);

    void addScatterHideHandler(ScatterHideHandler scatterHideHandler);

    void addScatterLegendItemClickHandler(ScatterLegendItemClickHandler scatterLegendItemClickHandler);

    void addScatterMouseOutHandler(ScatterMouseOutHandler scatterMouseOutHandler);

    void addScatterMouseOverHandler(ScatterMouseOverHandler scatterMouseOverHandler);

    void addScatterShowHandler(ScatterShowHandler scatterShowHandler);

    double lineWidth();

    Scatter lineWidth(double lineWidth);

    String linkedTo();

    Scatter linkedTo(String linkedTo);

    Marker marker();

    Scatter marker(Marker marker);

    String negativeColor();

    Scatter negativeColor(String negativeColor);

    Point point();

    Scatter point(Point point);

    double pointInterval();

    Scatter pointInterval(double pointInterval);

    double pointStart();

    Scatter pointStart(double pointStart);

    boolean selected();

    Scatter selected(boolean selected);

    boolean shadowAsBoolean();

    Scatter shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Scatter shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Scatter showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Scatter showInLegend(boolean showInLegend);

    States states();

    Scatter states(States states);

    boolean stickyTracking();

    Scatter stickyTracking(boolean stickyTracking);

    double threshold();

    Scatter threshold(double threshold);

    Tooltip tooltip();

    Scatter tooltip(Tooltip tooltip);

    double turboThreshold();

    Scatter turboThreshold(double turboThreshold);

    boolean visible();

    Scatter visible(boolean visible);

}
