
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.option.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

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
