
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.funnel;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.funnel.FunnelAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoFunnelAfterAnimateEvent
    extends NativeEvent
    implements FunnelAfterAnimateEvent
{


    protected JsoFunnelAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
