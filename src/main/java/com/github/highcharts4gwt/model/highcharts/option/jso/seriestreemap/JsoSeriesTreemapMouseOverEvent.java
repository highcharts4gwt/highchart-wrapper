
package com.github.highcharts4gwt.model.highcharts.option.jso.seriestreemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesTreemapMouseOverEvent
    extends NativeEvent
    implements SeriesTreemapMouseOverEvent
{


    protected JsoSeriesTreemapMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
