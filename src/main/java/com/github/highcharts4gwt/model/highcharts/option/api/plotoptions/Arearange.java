
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.ArearangeShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.arearange.Tooltip;

public interface Arearange {


    boolean allowPointSelect();

    Arearange allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Arearange animation(boolean animation);

    String color();

    Arearange color(String color);

    boolean connectNulls();

    Arearange connectNulls(boolean connectNulls);

    double cropThreshold();

    Arearange cropThreshold(double cropThreshold);

    String cursor();

    Arearange cursor(String cursor);

    String dashStyle();

    Arearange dashStyle(String dashStyle);

    DataLabels dataLabels();

    Arearange dataLabels(DataLabels dataLabels);

    boolean enableMouseTracking();

    Arearange enableMouseTracking(boolean enableMouseTracking);

    void addArearangeAfterAnimateHandler(ArearangeAfterAnimateHandler arearangeAfterAnimateHandler);

    void addArearangeCheckboxClickHandler(ArearangeCheckboxClickHandler arearangeCheckboxClickHandler);

    void addArearangeClickHandler(ArearangeClickHandler arearangeClickHandler);

    void addArearangeHideHandler(ArearangeHideHandler arearangeHideHandler);

    void addArearangeLegendItemClickHandler(ArearangeLegendItemClickHandler arearangeLegendItemClickHandler);

    void addArearangeMouseOutHandler(ArearangeMouseOutHandler arearangeMouseOutHandler);

    void addArearangeMouseOverHandler(ArearangeMouseOverHandler arearangeMouseOverHandler);

    void addArearangeShowHandler(ArearangeShowHandler arearangeShowHandler);

    String fillColor();

    Arearange fillColor(String fillColor);

    double fillOpacity();

    Arearange fillOpacity(double fillOpacity);

    String lineColor();

    Arearange lineColor(String lineColor);

    double lineWidth();

    Arearange lineWidth(double lineWidth);

    String linkedTo();

    Arearange linkedTo(String linkedTo);

    String negativeColor();

    Arearange negativeColor(String negativeColor);

    String negativeFillColor();

    Arearange negativeFillColor(String negativeFillColor);

    Point point();

    Arearange point(Point point);

    double pointInterval();

    Arearange pointInterval(double pointInterval);

    String pointIntervalUnit();

    Arearange pointIntervalUnit(String pointIntervalUnit);

    String pointPlacementAsString();

    Arearange pointPlacementAsString(String pointPlacementAsString);

    double pointPlacementAsNumber();

    Arearange pointPlacementAsNumber(double pointPlacementAsNumber);

    double pointStart();

    Arearange pointStart(double pointStart);

    boolean selected();

    Arearange selected(boolean selected);

    boolean shadowAsBoolean();

    Arearange shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Arearange shadowAsJsonString(String shadowAsJsonString);

    boolean showCheckbox();

    Arearange showCheckbox(boolean showCheckbox);

    boolean showInLegend();

    Arearange showInLegend(boolean showInLegend);

    States states();

    Arearange states(States states);

    String step();

    Arearange step(String step);

    boolean stickyTracking();

    Arearange stickyTracking(boolean stickyTracking);

    Tooltip tooltip();

    Arearange tooltip(Tooltip tooltip);

    boolean trackByArea();

    Arearange trackByArea(boolean trackByArea);

    double turboThreshold();

    Arearange turboThreshold(double turboThreshold);

    boolean visible();

    Arearange visible(boolean visible);

    String zoneAxis();

    Arearange zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Arearange zones(ArrayNumber zones);

}
