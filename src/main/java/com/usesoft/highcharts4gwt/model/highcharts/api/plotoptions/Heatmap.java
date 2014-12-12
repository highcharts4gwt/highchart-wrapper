
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Column;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapShowHandler;

public interface Heatmap
    extends Column
{


    double colsize();

    Heatmap colsize(double colsize);

    void addHeatmapAfterAnimateHandler(HeatmapAfterAnimateHandler heatmapAfterAnimateHandler);

    void addHeatmapCheckboxClickHandler(HeatmapCheckboxClickHandler heatmapCheckboxClickHandler);

    void addHeatmapClickHandler(HeatmapClickHandler heatmapClickHandler);

    void addHeatmapHideHandler(HeatmapHideHandler heatmapHideHandler);

    void addHeatmapLegendItemClickHandler(HeatmapLegendItemClickHandler heatmapLegendItemClickHandler);

    void addHeatmapMouseOutHandler(HeatmapMouseOutHandler heatmapMouseOutHandler);

    void addHeatmapMouseOverHandler(HeatmapMouseOverHandler heatmapMouseOverHandler);

    void addHeatmapShowHandler(HeatmapShowHandler heatmapShowHandler);

    double rowsize();

    Heatmap rowsize(double rowsize);

}
