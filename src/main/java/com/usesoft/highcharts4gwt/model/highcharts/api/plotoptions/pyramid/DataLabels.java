
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.pyramid;


public interface DataLabels
    extends com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.series.DataLabels
{


    String connectorColor();

    DataLabels connectorColor(String connectorColor);

    double connectorPadding();

    DataLabels connectorPadding(double connectorPadding);

    double connectorWidth();

    DataLabels connectorWidth(double connectorWidth);

    boolean softConnector();

    DataLabels softConnector(boolean softConnector);

}
