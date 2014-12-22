
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoFunnelShowEvent
    extends NativeEvent
    implements FunnelShowEvent
{


    protected JsoFunnelShowEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
