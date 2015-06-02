
package com.github.highcharts4gwt.model.highcharts.option.jso.serieswaterfall;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesWaterfallAfterAnimateEvent
    extends NativeEvent
    implements SeriesWaterfallAfterAnimateEvent
{


    protected JsoSeriesWaterfallAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
