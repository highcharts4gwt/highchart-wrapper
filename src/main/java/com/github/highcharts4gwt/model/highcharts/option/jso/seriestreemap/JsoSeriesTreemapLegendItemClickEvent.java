
package com.github.highcharts4gwt.model.highcharts.option.jso.seriestreemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesTreemapLegendItemClickEvent
    extends NativeEvent
    implements SeriesTreemapLegendItemClickEvent
{


    protected JsoSeriesTreemapLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
