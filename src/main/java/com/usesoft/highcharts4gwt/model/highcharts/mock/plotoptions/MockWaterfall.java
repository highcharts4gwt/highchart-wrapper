
package com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Waterfall;
import com.usesoft.highcharts4gwt.model.highcharts.mock.plotoptions.MockColumn;

public class MockWaterfall
    extends MockColumn
    implements Waterfall
{

    private String lineColor;
    private String upColor;

    public String lineColor() {
        return lineColor;
    }

    public MockWaterfall lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public String upColor() {
        return upColor;
    }

    public MockWaterfall upColor(String upColor) {
        this.upColor = upColor;
        return this;
    }

}
