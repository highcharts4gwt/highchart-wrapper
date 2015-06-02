
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespolygon;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.SeriesPolygonHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPolygonHideEvent
    extends NativeEvent
    implements SeriesPolygonHideEvent
{


    protected JsoSeriesPolygonHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
