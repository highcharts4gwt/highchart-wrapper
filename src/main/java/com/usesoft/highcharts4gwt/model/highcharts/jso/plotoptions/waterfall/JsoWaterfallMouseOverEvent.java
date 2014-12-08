
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.waterfall;

import com.google.gwt.dom.client.NativeEvent;
import com.usesoft.highcharts4gwt.model.highcharts.api.Series;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallMouseOverEvent;

public class JsoWaterfallMouseOverEvent
    extends NativeEvent
    implements WaterfallMouseOverEvent
{


    protected JsoWaterfallMouseOverEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
