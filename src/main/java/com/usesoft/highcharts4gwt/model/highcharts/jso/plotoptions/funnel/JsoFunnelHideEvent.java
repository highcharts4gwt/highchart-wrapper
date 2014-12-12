
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.funnel;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.funnel.FunnelHideEvent;

public class JsoFunnelHideEvent
    extends NativeEvent
    implements FunnelHideEvent
{


    protected JsoFunnelHideEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
