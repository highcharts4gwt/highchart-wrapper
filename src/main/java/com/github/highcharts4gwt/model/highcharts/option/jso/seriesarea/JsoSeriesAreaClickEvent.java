
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarea;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreaClickEvent
    extends NativeEvent
    implements SeriesAreaClickEvent
{


    protected JsoSeriesAreaClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
