
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoHeatmapShowEvent
    extends NativeEvent
    implements HeatmapShowEvent
{


    protected JsoHeatmapShowEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
