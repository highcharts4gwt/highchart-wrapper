
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesheatmap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesheatmap.SeriesHeatmapCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesHeatmapCheckboxClickEvent
    extends NativeEvent
    implements SeriesHeatmapCheckboxClickEvent
{


    protected JsoSeriesHeatmapCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
