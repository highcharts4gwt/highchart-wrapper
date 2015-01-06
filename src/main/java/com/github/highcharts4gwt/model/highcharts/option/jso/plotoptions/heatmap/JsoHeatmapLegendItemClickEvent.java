
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

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
