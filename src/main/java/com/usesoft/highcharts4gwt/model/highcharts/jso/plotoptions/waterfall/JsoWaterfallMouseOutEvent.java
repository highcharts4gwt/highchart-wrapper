
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.waterfall;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallMouseOutEvent;

public class JsoWaterfallMouseOutEvent
    extends NativeEvent
    implements WaterfallMouseOutEvent
{


    protected JsoWaterfallMouseOutEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
