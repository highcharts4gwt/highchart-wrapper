
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.SolidgaugeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.solidgauge.Tooltip;

public interface Solidgauge {


    boolean animation();

    Solidgauge animation(boolean animation);

    String cursor();

    Solidgauge cursor(String cursor);

    DataLabels dataLabels();

    Solidgauge dataLabels(DataLabels dataLabels);

    boolean enableMouseTracking();

    Solidgauge enableMouseTracking(boolean enableMouseTracking);

    void addSolidgaugeAfterAnimateHandler(SolidgaugeAfterAnimateHandler solidgaugeAfterAnimateHandler);

    void addSolidgaugeCheckboxClickHandler(SolidgaugeCheckboxClickHandler solidgaugeCheckboxClickHandler);

    void addSolidgaugeClickHandler(SolidgaugeClickHandler solidgaugeClickHandler);

    void addSolidgaugeHideHandler(SolidgaugeHideHandler solidgaugeHideHandler);

    void addSolidgaugeLegendItemClickHandler(SolidgaugeLegendItemClickHandler solidgaugeLegendItemClickHandler);

    void addSolidgaugeMouseOutHandler(SolidgaugeMouseOutHandler solidgaugeMouseOutHandler);

    void addSolidgaugeMouseOverHandler(SolidgaugeMouseOverHandler solidgaugeMouseOverHandler);

    void addSolidgaugeShowHandler(SolidgaugeShowHandler solidgaugeShowHandler);

    double overshoot();

    Solidgauge overshoot(double overshoot);

    Point point();

    Solidgauge point(Point point);

    boolean selected();

    Solidgauge selected(boolean selected);

    boolean showCheckbox();

    Solidgauge showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Solidgauge showInLegend(boolean showInLegend);

    States states();

    Solidgauge states(States states);

    boolean stickyTracking();

    Solidgauge stickyTracking(boolean stickyTracking);

    Tooltip tooltip();

    Solidgauge tooltip(Tooltip tooltip);

    boolean visible();

    Solidgauge visible(boolean visible);

    boolean wrap();

    Solidgauge wrap(boolean wrap);

    String zoneAxis();

    Solidgauge zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Solidgauge zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    Solidgauge setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
