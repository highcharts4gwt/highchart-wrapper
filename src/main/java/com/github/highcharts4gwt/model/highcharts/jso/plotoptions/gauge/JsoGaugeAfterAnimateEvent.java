
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoGaugeAfterAnimateEvent
    extends NativeEvent
    implements GaugeAfterAnimateEvent
{


    protected JsoGaugeAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
