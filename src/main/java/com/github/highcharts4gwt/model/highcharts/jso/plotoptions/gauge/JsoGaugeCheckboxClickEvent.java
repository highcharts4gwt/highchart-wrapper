
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.gauge;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.gauge.GaugeCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoGaugeCheckboxClickEvent
    extends NativeEvent
    implements GaugeCheckboxClickEvent
{


    protected JsoGaugeCheckboxClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
