
package com.github.highcharts4gwt.model.highcharts.jso.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.api.Series;
import com.github.highcharts4gwt.model.highcharts.api.plotoptions.waterfall.WaterfallLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoWaterfallLegendItemClickEvent
    extends NativeEvent
    implements WaterfallLegendItemClickEvent
{


    protected JsoWaterfallLegendItemClickEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}