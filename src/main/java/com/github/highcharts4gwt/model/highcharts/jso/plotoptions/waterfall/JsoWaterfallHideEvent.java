
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoWaterfallHideEvent
    extends NativeEvent
    implements WaterfallHideEvent
{


    protected JsoWaterfallHideEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
