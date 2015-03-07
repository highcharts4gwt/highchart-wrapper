
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.AreasplinerangeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.areasplinerange.Tooltip;

public interface Areasplinerange {


    boolean allowPointSelect();

    Areasplinerange allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Areasplinerange animation(boolean animation);

    String color();

    Areasplinerange color(String color);

    boolean connectNulls();

    Areasplinerange connectNulls(boolean connectNulls);

    double cropThreshold();

    Areasplinerange cropThreshold(double cropThreshold);

    String cursor();

    Areasplinerange cursor(String cursor);

    String dashStyle();

    Areasplinerange dashStyle(String dashStyle);

    DataLabels dataLabels();

    Areasplinerange dataLabels(DataLabels dataLabels);

    boolean enableMouseTracking();

    Areasplinerange enableMouseTracking(boolean enableMouseTracking);

    void addAreasplinerangeAfterAnimateHandler(AreasplinerangeAfterAnimateHandler areasplinerangeAfterAnimateHandler);

    void addAreasplinerangeCheckboxClickHandler(AreasplinerangeCheckboxClickHandler areasplinerangeCheckboxClickHandler);

    void addAreasplinerangeClickHandler(AreasplinerangeClickHandler areasplinerangeClickHandler);

    void addAreasplinerangeHideHandler(AreasplinerangeHideHandler areasplinerangeHideHandler);

    void addAreasplinerangeLegendItemClickHandler(AreasplinerangeLegendItemClickHandler areasplinerangeLegendItemClickHandler);

    void addAreasplinerangeMouseOutHandler(AreasplinerangeMouseOutHandler areasplinerangeMouseOutHandler);

    void addAreasplinerangeMouseOverHandler(AreasplinerangeMouseOverHandler areasplinerangeMouseOverHandler);

    void addAreasplinerangeShowHandler(AreasplinerangeShowHandler areasplinerangeShowHandler);

    String fillColor();

    Areasplinerange fillColor(String fillColor);

    double fillOpacity();

    Areasplinerange fillOpacity(double fillOpacity);

    String lineColor();

    Areasplinerange lineColor(String lineColor);

    double lineWidth();

    Areasplinerange lineWidth(double lineWidth);

    String linkedTo();

    Areasplinerange linkedTo(String linkedTo);

    String negativeColor();

    Areasplinerange negativeColor(String negativeColor);

    String negativeFillColor();

    Areasplinerange negativeFillColor(String negativeFillColor);

    Point point();

    Areasplinerange point(Point point);

    double pointInterval();

    Areasplinerange pointInterval(double pointInterval);

    String pointIntervalUnit();

    Areasplinerange pointIntervalUnit(String pointIntervalUnit);

    String pointPlacementAsString();

    Areasplinerange pointPlacementAsString(String pointPlacementAsString);

    double pointPlacementAsNumber();

    Areasplinerange pointPlacementAsNumber(double pointPlacementAsNumber);

    double pointStart();

    Areasplinerange pointStart(double pointStart);

    boolean selected();

    Areasplinerange selected(boolean selected);

    boolean shadowAsBoolean();

    Areasplinerange shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Areasplinerange shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Areasplinerange showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Areasplinerange showInLegend(boolean showInLegend);

    States states();

    Areasplinerange states(States states);

    String step();

    Areasplinerange step(String step);

    boolean stickyTracking();

    Areasplinerange stickyTracking(boolean stickyTracking);

    Tooltip tooltip();

    Areasplinerange tooltip(Tooltip tooltip);

    boolean trackByArea();

    Areasplinerange trackByArea(boolean trackByArea);

    double turboThreshold();

    Areasplinerange turboThreshold(double turboThreshold);

    boolean visible();

    Areasplinerange visible(boolean visible);

    String zoneAxis();

    Areasplinerange zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Areasplinerange zones(ArrayNumber zones);

    String getFieldAsJsonObject(String fieldName);

    Areasplinerange setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
