
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoFunnelMouseOutEvent
    extends NativeEvent
    implements FunnelMouseOutEvent
{


    protected JsoFunnelMouseOutEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
