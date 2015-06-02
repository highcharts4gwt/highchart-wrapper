
package com.github.highcharts4gwt.model.highcharts.option.jso.seriestreemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesTreemapClickEvent
    extends NativeEvent
    implements SeriesTreemapClickEvent
{


    protected JsoSeriesTreemapClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
