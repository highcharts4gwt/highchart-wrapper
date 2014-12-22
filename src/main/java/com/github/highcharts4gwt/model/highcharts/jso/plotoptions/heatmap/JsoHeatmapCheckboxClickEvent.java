
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.heatmap;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.heatmap.HeatmapCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoHeatmapCheckboxClickEvent
    extends NativeEvent
    implements HeatmapCheckboxClickEvent
{


    protected JsoHeatmapCheckboxClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
