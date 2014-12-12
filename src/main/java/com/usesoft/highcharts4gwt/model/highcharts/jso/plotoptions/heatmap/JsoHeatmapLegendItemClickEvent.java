
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.heatmap;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapLegendItemClickEvent;

public class JsoHeatmapLegendItemClickEvent
    extends NativeEvent
    implements HeatmapLegendItemClickEvent
{


    protected JsoHeatmapLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
