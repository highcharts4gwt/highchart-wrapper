
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.funnel;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.funnel.DataLabels;

public class MockDataLabels
    extends com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.series.MockDataLabels
    implements DataLabels
{

    private String connectorColor;
    private double connectorPadding;
    private double connectorWidth;
    private boolean softConnector;

    public String connectorColor() {
        return connectorColor;
    }

    public MockDataLabels connectorColor(String connectorColor) {
        this.connectorColor = connectorColor;
        return this;
    }

    public double connectorPadding() {
        return connectorPadding;
    }

    public MockDataLabels connectorPadding(double connectorPadding) {
        this.connectorPadding = connectorPadding;
        return this;
    }

    public double connectorWidth() {
        return connectorWidth;
    }

    public MockDataLabels connectorWidth(double connectorWidth) {
        this.connectorWidth = connectorWidth;
        return this;
    }

    public boolean softConnector() {
        return softConnector;
    }

    public MockDataLabels softConnector(boolean softConnector) {
        this.softConnector = softConnector;
        return this;
    }

}
