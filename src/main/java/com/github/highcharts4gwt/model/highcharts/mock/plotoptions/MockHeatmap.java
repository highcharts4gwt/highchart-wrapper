
package com.github.highcharts4gwt.model.highcharts.mock.plotoptions;

import com.github.highcharts4gwt.model.highcharts.api.plotoptions.Heatmap;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapAfterAnimateHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapCheckboxClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapHideHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapLegendItemClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapShowHandler;
import com.github.highcharts4gwt.model.highcharts.mock.plotoptions.MockColumn;

public class MockHeatmap
    extends MockColumn
    implements Heatmap
{

    private double colsize;
    private double rowsize;

    public double colsize() {
        return colsize;
    }

    public MockHeatmap colsize(double colsize) {
        this.colsize = colsize;
        return this;
    }

    public void addHeatmapAfterAnimateHandler(HeatmapAfterAnimateHandler handler) {
    }

    public void addHeatmapCheckboxClickHandler(HeatmapCheckboxClickHandler handler) {
    }

    public void addHeatmapClickHandler(HeatmapClickHandler handler) {
    }

    public void addHeatmapHideHandler(HeatmapHideHandler handler) {
    }

    public void addHeatmapLegendItemClickHandler(HeatmapLegendItemClickHandler handler) {
    }

    public void addHeatmapMouseOutHandler(HeatmapMouseOutHandler handler) {
    }

    public void addHeatmapMouseOverHandler(HeatmapMouseOverHandler handler) {
    }

    public void addHeatmapShowHandler(HeatmapShowHandler handler) {
    }

    public double rowsize() {
        return rowsize;
    }

    public MockHeatmap rowsize(double rowsize) {
        this.rowsize = rowsize;
        return this;
    }

}
