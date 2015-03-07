
package com.github.highcharts4gwt.model.highcharts.option.api.xaxis;

import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.plotbands.Label;

public interface PlotBand {


    String borderColor();

    PlotBand borderColor(String borderColor);

    double borderWidth();

    PlotBand borderWidth(double borderWidth);

    String color();

    PlotBand color(String color);

    double from();

    PlotBand from(double from);

    String id();

    PlotBand id(String id);

    Label label();

    PlotBand label(Label label);

    double to();

    PlotBand to(double to);

    double zIndex();

    PlotBand zIndex(double zIndex);

    String getFieldAsJsonObject(String fieldName);

    PlotBand setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
