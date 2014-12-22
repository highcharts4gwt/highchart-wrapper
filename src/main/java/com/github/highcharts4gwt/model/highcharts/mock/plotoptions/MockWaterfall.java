
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Waterfall;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallShowHandler;
import com.github.highcharts4gwt.model.highcharts.mock.plotoptions.MockColumn;

public class MockWaterfall
    extends MockColumn
    implements Waterfall
{

    private String lineColor;
    private String upColor;

    public void addWaterfallAfterAnimateHandler(WaterfallAfterAnimateHandler handler) {
    }

    public void addWaterfallCheckboxClickHandler(WaterfallCheckboxClickHandler handler) {
    }

    public void addWaterfallClickHandler(WaterfallClickHandler handler) {
    }

    public void addWaterfallHideHandler(WaterfallHideHandler handler) {
    }

    public void addWaterfallLegendItemClickHandler(WaterfallLegendItemClickHandler handler) {
    }

    public void addWaterfallMouseOutHandler(WaterfallMouseOutHandler handler) {
    }

    public void addWaterfallMouseOverHandler(WaterfallMouseOverHandler handler) {
    }

    public void addWaterfallShowHandler(WaterfallShowHandler handler) {
    }

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
