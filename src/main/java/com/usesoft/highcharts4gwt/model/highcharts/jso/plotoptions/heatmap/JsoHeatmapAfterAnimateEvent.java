
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.heatmap;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapAfterAnimateEvent;

public class JsoHeatmapAfterAnimateEvent
    extends NativeEvent
    implements HeatmapAfterAnimateEvent
{


    protected JsoHeatmapAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
