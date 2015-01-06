
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.heatmap.HeatmapAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

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
