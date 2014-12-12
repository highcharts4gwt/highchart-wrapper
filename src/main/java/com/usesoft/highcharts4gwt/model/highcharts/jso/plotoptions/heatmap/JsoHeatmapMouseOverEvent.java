
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.heatmap;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapMouseOverEvent;

public class JsoHeatmapMouseOverEvent
    extends NativeEvent
    implements HeatmapMouseOverEvent
{


    protected JsoHeatmapMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
