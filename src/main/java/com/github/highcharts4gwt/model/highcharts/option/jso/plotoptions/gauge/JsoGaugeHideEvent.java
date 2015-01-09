
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge.GaugeHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoGaugeHideEvent
    extends NativeEvent
    implements GaugeHideEvent
{


    protected JsoGaugeHideEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
