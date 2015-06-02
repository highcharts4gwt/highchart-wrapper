
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespolygon;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.SeriesPolygonMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPolygonMouseOutEvent
    extends NativeEvent
    implements SeriesPolygonMouseOutEvent
{


    protected JsoSeriesPolygonMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
