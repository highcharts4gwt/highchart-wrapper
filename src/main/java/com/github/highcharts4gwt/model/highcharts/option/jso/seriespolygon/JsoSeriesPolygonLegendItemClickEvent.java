
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespolygon;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.SeriesPolygonLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPolygonLegendItemClickEvent
    extends NativeEvent
    implements SeriesPolygonLegendItemClickEvent
{


    protected JsoSeriesPolygonLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
