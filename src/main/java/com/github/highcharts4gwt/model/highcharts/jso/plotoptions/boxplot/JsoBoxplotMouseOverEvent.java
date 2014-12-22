
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.boxplot;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBoxplotMouseOverEvent
    extends NativeEvent
    implements BoxplotMouseOverEvent
{


    protected JsoBoxplotMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
