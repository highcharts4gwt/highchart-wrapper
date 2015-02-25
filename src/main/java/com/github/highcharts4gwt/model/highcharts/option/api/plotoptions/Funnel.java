
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.DataLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelHideHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelShowHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.States;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.Tooltip;

public interface Funnel {


    boolean allowPointSelect();

    Funnel allowPointSelect(boolean allowPointSelect);

    String borderColor();

    Funnel borderColor(String borderColor);

    double borderWidth();

    Funnel borderWidth(double borderWidth);

    ArrayString centerAsArrayString();

    Funnel centerAsArrayString(ArrayString centerAsArrayString);

    ArrayNumber centerAsArrayNumber();

    Funnel centerAsArrayNumber(ArrayNumber centerAsArrayNumber);

    ArrayString colors();

    Funnel colors(ArrayString colors);

    String cursor();

    Funnel cursor(String cursor);

    DataLabels dataLabels();

    Funnel dataLabels(DataLabels dataLabels);

    double depth();

    Funnel depth(double depth);

    boolean enableMouseTracking();

    Funnel enableMouseTracking(boolean enableMouseTracking);

    void addFunnelAfterAnimateHandler(FunnelAfterAnimateHandler funnelAfterAnimateHandler);

    void addFunnelCheckboxClickHandler(FunnelCheckboxClickHandler funnelCheckboxClickHandler);

    void addFunnelClickHandler(FunnelClickHandler funnelClickHandler);

    void addFunnelHideHandler(FunnelHideHandler funnelHideHandler);

    void addFunnelLegendItemClickHandler(FunnelLegendItemClickHandler funnelLegendItemClickHandler);

    void addFunnelMouseOutHandler(FunnelMouseOutHandler funnelMouseOutHandler);

    void addFunnelMouseOverHandler(FunnelMouseOverHandler funnelMouseOverHandler);

    void addFunnelShowHandler(FunnelShowHandler funnelShowHandler);

    double heightAsNumber();

    Funnel heightAsNumber(double heightAsNumber);

    String heightAsString();

    Funnel heightAsString(String heightAsString);

    String linkedTo();

    Funnel linkedTo(String linkedTo);

    double minSize();

    Funnel minSize(double minSize);

    double neckHeightAsNumber();

    Funnel neckHeightAsNumber(double neckHeightAsNumber);

    String neckHeightAsString();

    Funnel neckHeightAsString(String neckHeightAsString);

    double neckWidthAsNumber();

    Funnel neckWidthAsNumber(double neckWidthAsNumber);

    String neckWidthAsString();

    Funnel neckWidthAsString(String neckWidthAsString);

    Point point();

    Funnel point(Point point);

    boolean reversed();

    Funnel reversed(boolean reversed);

    boolean selected();

    Funnel selected(boolean selected);

    boolean shadowAsBoolean();

    Funnel shadowAsBoolean(boolean shadowAsBoolean);

    String shadowAsJsonString();

    Funnel shadowAsJsonString(String shadowAsJsonString);

    boolean showInLegend();

    Funnel showInLegend(boolean showInLegend);

    double slicedOffset();

    Funnel slicedOffset(double slicedOffset);

    States states();

    Funnel states(States states);

    boolean stickyTracking();

    Funnel stickyTracking(boolean stickyTracking);

    Tooltip tooltip();

    Funnel tooltip(Tooltip tooltip);

    boolean visible();

    Funnel visible(boolean visible);

    double widthAsNumber();

    Funnel widthAsNumber(double widthAsNumber);

    String widthAsString();

    Funnel widthAsString(String widthAsString);

    String zoneAxis();

    Funnel zoneAxis(String zoneAxis);

    ArrayNumber zones();

    Funnel zones(ArrayNumber zones);

}
