
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespolygon;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.SeriesPolygonClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPolygonClickEvent
    extends NativeEvent
    implements SeriesPolygonClickEvent
{


    protected JsoSeriesPolygonClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
