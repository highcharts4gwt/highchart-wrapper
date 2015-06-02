
package com.github.highcharts4gwt.model.highcharts.option.jso.seriestreemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesTreemapShowEvent
    extends NativeEvent
    implements SeriesTreemapShowEvent
{


    protected JsoSeriesTreemapShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
