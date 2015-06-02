
package com.github.highcharts4gwt.model.highcharts.option.jso.seriestreemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesTreemapMouseOutEvent
    extends NativeEvent
    implements SeriesTreemapMouseOutEvent
{


    protected JsoSeriesTreemapMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
