
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarea;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreaLegendItemClickEvent
    extends NativeEvent
    implements SeriesAreaLegendItemClickEvent
{


    protected JsoSeriesAreaLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
