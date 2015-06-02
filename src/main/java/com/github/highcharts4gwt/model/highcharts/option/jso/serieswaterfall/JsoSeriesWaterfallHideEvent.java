
package com.github.highcharts4gwt.model.highcharts.option.jso.serieswaterfall;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieswaterfall.SeriesWaterfallHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesWaterfallHideEvent
    extends NativeEvent
    implements SeriesWaterfallHideEvent
{


    protected JsoSeriesWaterfallHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
