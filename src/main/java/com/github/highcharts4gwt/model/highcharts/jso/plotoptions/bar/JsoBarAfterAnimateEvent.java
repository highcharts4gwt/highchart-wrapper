
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBarAfterAnimateEvent
    extends NativeEvent
    implements BarAfterAnimateEvent
{


    protected JsoBarAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
