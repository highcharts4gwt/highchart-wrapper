
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespolygon;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.SeriesPolygonMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPolygonMouseOverEvent
    extends NativeEvent
    implements SeriesPolygonMouseOverEvent
{


    protected JsoSeriesPolygonMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
