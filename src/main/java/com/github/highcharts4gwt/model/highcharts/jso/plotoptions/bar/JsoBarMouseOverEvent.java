
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBarMouseOverEvent
    extends NativeEvent
    implements BarMouseOverEvent
{


    protected JsoBarMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}