
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoHeatmapClickEvent
    extends NativeEvent
    implements HeatmapClickEvent
{


    protected JsoHeatmapClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
