
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoGaugeShowEvent
    extends NativeEvent
    implements GaugeShowEvent
{


    protected JsoGaugeShowEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
