
package com.github.highcharts4gwt.model.highcharts.option.api.xaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.plotlines.Label;

public interface PlotLine {


    String color();

    PlotLine color(String color);

    String dashStyle();

    PlotLine dashStyle(String dashStyle);

    String id();

    PlotLine id(String id);

    Label label();

    PlotLine label(Label label);

    double value();

    PlotLine value(double value);

    double width();

    PlotLine width(double width);

    double zIndex();

    PlotLine zIndex(double zIndex);

}