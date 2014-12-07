
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.scatter;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterMouseOutEvent;

public class JsoScatterMouseOutEvent
    extends NativeEvent
    implements ScatterMouseOutEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}