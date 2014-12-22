
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoWaterfallClickEvent
    extends NativeEvent
    implements WaterfallClickEvent
{


    protected JsoWaterfallClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
