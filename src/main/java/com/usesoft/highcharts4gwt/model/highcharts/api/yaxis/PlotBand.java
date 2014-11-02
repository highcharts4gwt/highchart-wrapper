
package com.usesoft.highcharts4gwt.model.highcharts.api.yaxis;


public interface PlotBand
    extends com.usesoft.highcharts4gwt.model.highcharts.api.xaxis.PlotBand
{


    Number innerRadiusAsNumber();

    PlotBand innerRadiusAsNumber(Number innerRadiusAsNumber);

    String innerRadiusAsString();

    PlotBand innerRadiusAsString(String innerRadiusAsString);

    Number outerRadiusAsNumber();

    PlotBand outerRadiusAsNumber(Number outerRadiusAsNumber);

    String outerRadiusAsString();

    PlotBand outerRadiusAsString(String outerRadiusAsString);

    Number thicknessAsNumber();

    PlotBand thicknessAsNumber(Number thicknessAsNumber);

    String thicknessAsString();

    PlotBand thicknessAsString(String thicknessAsString);

}
