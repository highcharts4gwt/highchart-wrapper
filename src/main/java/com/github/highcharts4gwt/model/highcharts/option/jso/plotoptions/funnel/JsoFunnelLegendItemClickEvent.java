
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoFunnelLegendItemClickEvent
    extends NativeEvent
    implements FunnelLegendItemClickEvent
{


    protected JsoFunnelLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
