
package com.github.highcharts4gwt.model.highcharts.api.yaxis;


public interface PlotBand
    extends com.github.highcharts4gwt.model.highcharts.api.xaxis.PlotBand
{


    double innerRadiusAsNumber();

    PlotBand innerRadiusAsNumber(double innerRadiusAsNumber);

    String innerRadiusAsString();

    PlotBand innerRadiusAsString(String innerRadiusAsString);

    double outerRadiusAsNumber();

    PlotBand outerRadiusAsNumber(double outerRadiusAsNumber);

    String outerRadiusAsString();

    PlotBand outerRadiusAsString(String outerRadiusAsString);

    double thicknessAsNumber();

    PlotBand thicknessAsNumber(double thicknessAsNumber);

    String thicknessAsString();

    PlotBand thicknessAsString(String thicknessAsString);

}
