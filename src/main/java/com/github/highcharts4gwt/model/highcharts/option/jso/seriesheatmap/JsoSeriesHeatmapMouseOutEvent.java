
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesheatmap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesHeatmapMouseOutEvent
    extends NativeEvent
    implements SeriesHeatmapMouseOutEvent
{


    protected JsoSeriesHeatmapMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
