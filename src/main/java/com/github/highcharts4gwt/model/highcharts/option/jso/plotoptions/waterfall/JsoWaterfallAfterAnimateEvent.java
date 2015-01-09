
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.waterfall;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.waterfall.WaterfallAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoWaterfallAfterAnimateEvent
    extends NativeEvent
    implements WaterfallAfterAnimateEvent
{


    protected JsoWaterfallAfterAnimateEvent() {
    }

    public final native Series getSeries()
        throws RuntimeException /*-{
        return this.source.chart.options.series[this.source.index];
    }-*/
    ;

}
