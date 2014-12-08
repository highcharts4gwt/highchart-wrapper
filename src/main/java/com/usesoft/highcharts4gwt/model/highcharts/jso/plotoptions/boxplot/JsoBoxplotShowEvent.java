
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.boxplot;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.boxplot.BoxplotShowEvent;

public class JsoBoxplotShowEvent
    extends NativeEvent
    implements BoxplotShowEvent
{


    protected JsoBoxplotShowEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
