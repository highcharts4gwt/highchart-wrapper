
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoGaugeMouseOutEvent
    extends NativeEvent
    implements GaugeMouseOutEvent
{


    protected JsoGaugeMouseOutEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
