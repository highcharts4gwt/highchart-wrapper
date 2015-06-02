
package com.github.highcharts4gwt.model.highcharts.option.jso.serieswaterfall;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesWaterfallMouseOverEvent
    extends NativeEvent
    implements SeriesWaterfallMouseOverEvent
{


    protected JsoSeriesWaterfallMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
