
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesheatmap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesHeatmapClickEvent
    extends NativeEvent
    implements SeriesHeatmapClickEvent
{


    protected JsoSeriesHeatmapClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
