
package com.usesoft.highcharts4gwt.model.highcharts.jso.xaxis;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.xaxis.XAxisAfterSetExtremesEvent;

public class JsoXAxisAfterSetExtremesEvent
    extends NativeEvent
    implements XAxisAfterSetExtremesEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
