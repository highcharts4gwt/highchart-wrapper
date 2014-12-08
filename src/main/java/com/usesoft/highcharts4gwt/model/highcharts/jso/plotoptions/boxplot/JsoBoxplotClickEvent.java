
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.boxplot;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotClickEvent;

public class JsoBoxplotClickEvent
    extends NativeEvent
    implements BoxplotClickEvent
{


    protected JsoBoxplotClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
