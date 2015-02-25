
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.Dial;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.Pivot;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.Tooltip;

public interface Gauge {


    boolean animation();

    Gauge animation(boolean animation);

    String color();

    Gauge color(String color);

    String cursor();

    Gauge cursor(String cursor);

    DataLabels dataLabels();

    Gauge dataLabels(DataLabels dataLabels);

    Dial dial();

    Gauge dial(Dial dial);

    boolean enableMouseTracking();

    Gauge enableMouseTracking(boolean enableMouseTracking);

    void addGaugeAfterAnimateHandler(GaugeAfterAnimateHandler gaugeAfterAnimateHandler);

    void addGaugeCheckboxClickHandler(GaugeCheckboxClickHandler gaugeCheckboxClickHandler);

    void addGaugeClickHandler(GaugeClickHandler gaugeClickHandler);

    void addGaugeHideHandler(GaugeHideHandler gaugeHideHandler);

    void addGaugeLegendItemClickHandler(GaugeLegendItemClickHandler gaugeLegendItemClickHandler);

    void addGaugeMouseOutHandler(GaugeMouseOutHandler gaugeMouseOutHandler);

    void addGaugeMouseOverHandler(GaugeMouseOverHandler gaugeMouseOverHandler);

    void addGaugeShowHandler(GaugeShowHandler gaugeShowHandler);

    String linkedTo();

    Gauge linkedTo(String linkedTo);

    String negativeColor();

    Gauge negativeColor(String negativeColor);

    double overshoot();

    Gauge overshoot(double overshoot);

    Pivot pivot();

    Gauge pivot(Pivot pivot);

    Point point();

    Gauge point(Point point);

    boolean selected();

    Gauge selected(boolean selected);

    boolean showCheckbox();

    Gauge showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Gauge showInLegend(boolean showInLegend);

    States states();

    Gauge states(States states);

    boolean stickyTracking();

    Gauge stickyTracking(boolean stickyTracking);

    double threshold();

    Gauge threshold(double threshold);

    Tooltip tooltip();

    Gauge tooltip(Tooltip tooltip);

    boolean visible();

    Gauge visible(boolean visible);

    boolean wrap();

    Gauge wrap(boolean wrap);

    String zoneAxis();

    Gauge zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Gauge zones(ArrayNumber zones);

}
