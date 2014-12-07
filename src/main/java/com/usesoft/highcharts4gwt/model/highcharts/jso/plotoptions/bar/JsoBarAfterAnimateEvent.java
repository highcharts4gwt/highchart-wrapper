
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.bar;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarAfterAnimateEvent;

public class JsoBarAfterAnimateEvent
    extends NativeEvent
    implements BarAfterAnimateEvent
{


    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
