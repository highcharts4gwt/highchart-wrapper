
package com.github.highcharts4gwt.model.highcharts.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.DataLabels;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.PieShowHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.Point;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.States;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.pie.Tooltip;

public interface Pie {


    boolean allowPointSelect();

    Pie allowPointSelect(boolean allowPointSelect);

    boolean animation();

    Pie animation(boolean animation);

    String borderColor();

    Pie borderColor(String borderColor);

    double borderWidth();

    Pie borderWidth(double borderWidth);

    ArrayString centerAsArrayString();

    Pie centerAsArrayString(ArrayString centerAsArrayString);

    ArrayNumber centerAsArrayNumber();

    Pie centerAsArrayNumber(ArrayNumber centerAsArrayNumber);

    ArrayString colors();

    Pie colors(ArrayString colors);

    String cursor();

    Pie cursor(String cursor);

    DataLabels dataLabels();

    Pie dataLabels(DataLabels dataLabels);

    double depth();

    Pie depth(double depth);

    boolean enableMouseTracking();

    Pie enableMouseTracking(boolean enableMouseTracking);

    double endAngle();

    Pie endAngle(double endAngle);

    void addPieAfterAnimateHandler(PieAfterAnimateHandler pieAfterAnimateHandler);

    void addPieCheckboxClickHandler(PieCheckboxClickHandler pieCheckboxClickHandler);

    void addPieClickHandler(PieClickHandler pieClickHandler);

    void addPieHideHandler(PieHideHandler pieHideHandler);

    void addPieLegendItemClickHandler(PieLegendItemClickHandler pieLegendItemClickHandler);

    void addPieMouseOutHandler(PieMouseOutHandler pieMouseOutHandler);

    void addPieMouseOverHandler(PieMouseOverHandler pieMouseOverHandler);

    void addPieShowHandler(PieShowHandler pieShowHandler);

    boolean ignoreHiddenPoint();

    Pie ignoreHiddenPoint(boolean ignoreHiddenPoint);

    String innerSizeAsString();

    Pie innerSizeAsString(String innerSizeAsString);

    double innerSizeAsNumber();

    Pie innerSizeAsNumber(double innerSizeAsNumber);

    String linkedTo();

    Pie linkedTo(String linkedTo);

    double minSize();

    Pie minSize(double minSize);

    Point point();

    Pie point(Point point);

    boolean selected();

    Pie selected(boolean selected);

    boolean shadowAsBoolean();

    Pie shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Pie shadowAsJsonString(String shadowAsJsonString);

    boolean showInLegend();

    Pie showInLegend(boolean showInLegend);

    String sizeAsString();

    Pie sizeAsString(String sizeAsString);

    double sizeAsNumber();

    Pie sizeAsNumber(double sizeAsNumber);

    double slicedOffset();

    Pie slicedOffset(double slicedOffset);

    double startAngle();

    Pie startAngle(double startAngle);

    States states();

    Pie states(States states);

    boolean stickyTracking();

    Pie stickyTracking(boolean stickyTracking);

    Tooltip tooltip();

    Pie tooltip(Tooltip tooltip);

    boolean visible();

    Pie visible(boolean visible);

}
