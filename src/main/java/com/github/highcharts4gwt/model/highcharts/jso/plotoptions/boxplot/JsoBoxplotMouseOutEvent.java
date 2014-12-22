
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBoxplotMouseOutEvent
    extends NativeEvent
    implements BoxplotMouseOutEvent
{


    protected JsoBoxplotMouseOutEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
