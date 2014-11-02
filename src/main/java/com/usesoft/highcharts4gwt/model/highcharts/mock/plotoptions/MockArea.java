
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Area;
import com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.MockSeries;

public class MockArea
    extends MockSeries
    implements Area
{

    private String fillColor;
    private Number fillOpacity;
    private String lineColor;
    private String negativeFillColor;
    private boolean trackByArea;

    public String fillColor() {
        return fillColor;
    }

    public MockArea fillColor(String fillColor) {
        this.fillColor = fillColor;
        return this;
    }

    public Number fillOpacity() {
        return fillOpacity;
    }

    public MockArea fillOpacity(Number fillOpacity) {
        this.fillOpacity = fillOpacity;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockArea lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public String negativeFillColor() {
        return negativeFillColor;
    }

    public MockArea negativeFillColor(String negativeFillColor) {
        this.negativeFillColor = negativeFillColor;
        return this;
    }

    public boolean trackByArea() {
        return trackByArea;
    }

    public MockArea trackByArea(boolean trackByArea) {
        this.trackByArea = trackByArea;
        return this;
    }

}
