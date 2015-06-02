
package com.github.highcharts4gwt.model.highcharts.option.jso.serieswaterfall;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesWaterfallMouseOutEvent
    extends NativeEvent
    implements SeriesWaterfallMouseOutEvent
{


    protected JsoSeriesWaterfallMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
