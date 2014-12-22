
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.scatter;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.scatter.ScatterShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoScatterShowEvent
    extends NativeEvent
    implements ScatterShowEvent
{


    protected JsoScatterShowEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
