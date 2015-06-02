
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarea;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreaMouseOutEvent
    extends NativeEvent
    implements SeriesAreaMouseOutEvent
{


    protected JsoSeriesAreaMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
