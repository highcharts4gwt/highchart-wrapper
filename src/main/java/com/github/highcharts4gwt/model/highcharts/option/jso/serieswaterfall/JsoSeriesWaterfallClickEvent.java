
package com.github.highcharts4gwt.model.highcharts.option.jso.serieswaterfall;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesWaterfallClickEvent
    extends NativeEvent
    implements SeriesWaterfallClickEvent
{


    protected JsoSeriesWaterfallClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
