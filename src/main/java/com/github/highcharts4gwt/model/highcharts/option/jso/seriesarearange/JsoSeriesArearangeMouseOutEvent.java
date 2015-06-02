
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarearange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesArearangeMouseOutEvent
    extends NativeEvent
    implements SeriesArearangeMouseOutEvent
{


    protected JsoSeriesArearangeMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
