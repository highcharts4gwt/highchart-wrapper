
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.bar;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.bar.BarHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoBarHideEvent
    extends NativeEvent
    implements BarHideEvent
{


    protected JsoBarHideEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
