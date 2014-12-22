
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBarShowEvent
    extends NativeEvent
    implements BarShowEvent
{


    protected JsoBarShowEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
