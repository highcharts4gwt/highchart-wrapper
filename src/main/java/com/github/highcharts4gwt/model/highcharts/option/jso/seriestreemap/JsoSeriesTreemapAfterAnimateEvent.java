
package com.github.highcharts4gwt.model.highcharts.option.jso.seriestreemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesTreemapAfterAnimateEvent
    extends NativeEvent
    implements SeriesTreemapAfterAnimateEvent
{


    protected JsoSeriesTreemapAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
