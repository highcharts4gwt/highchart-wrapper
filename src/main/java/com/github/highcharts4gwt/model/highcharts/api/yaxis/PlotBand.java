
package com.github.highcharts4gwt.model.highcharts.api.yaxis;

import com.github.highcharts4gwt.model.highcharts.api.yaxis.plotbands.Label;

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

    double innerRadiusAsNumber();

    PlotBand innerRadiusAsNumber(double innerRadiusAsNumber);

    String innerRadiusAsString();

    PlotBand innerRadiusAsString(String innerRadiusAsString);

    Label label();

    PlotBand label(Label label);

    double outerRadiusAsNumber();

    PlotBand outerRadiusAsNumber(double outerRadiusAsNumber);

    String outerRadiusAsString();

    PlotBand outerRadiusAsString(String outerRadiusAsString);

    double thicknessAsNumber();

    PlotBand thicknessAsNumber(double thicknessAsNumber);

    String thicknessAsString();

    PlotBand thicknessAsString(String thicknessAsString);

    double to();

    PlotBand to(double to);

    double zIndex();

    PlotBand zIndex(double zIndex);

}
