
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespolygon;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespolygon.SeriesPolygonCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPolygonCheckboxClickEvent
    extends NativeEvent
    implements SeriesPolygonCheckboxClickEvent
{


    protected JsoSeriesPolygonCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
