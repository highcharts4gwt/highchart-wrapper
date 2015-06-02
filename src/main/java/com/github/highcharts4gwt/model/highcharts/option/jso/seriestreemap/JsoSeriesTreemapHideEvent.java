
package com.github.highcharts4gwt.model.highcharts.option.jso.seriestreemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap.SeriesTreemapHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesTreemapHideEvent
    extends NativeEvent
    implements SeriesTreemapHideEvent
{


    protected JsoSeriesTreemapHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
