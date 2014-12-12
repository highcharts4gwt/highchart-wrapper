
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.funnel;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelClickEvent;

public class JsoFunnelClickEvent
    extends NativeEvent
    implements FunnelClickEvent
{


    protected JsoFunnelClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
