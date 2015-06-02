
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesheatmap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesHeatmapMouseOverEvent
    extends NativeEvent
    implements SeriesHeatmapMouseOverEvent
{


    protected JsoSeriesHeatmapMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
