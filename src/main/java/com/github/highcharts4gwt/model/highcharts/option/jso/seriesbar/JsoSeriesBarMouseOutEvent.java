
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbar.SeriesBarMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBarMouseOutEvent
    extends NativeEvent
    implements SeriesBarMouseOutEvent
{


    protected JsoSeriesBarMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
