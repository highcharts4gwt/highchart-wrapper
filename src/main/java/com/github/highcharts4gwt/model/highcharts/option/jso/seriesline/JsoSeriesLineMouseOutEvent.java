
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.SeriesLineMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesLineMouseOutEvent
    extends NativeEvent
    implements SeriesLineMouseOutEvent
{


    protected JsoSeriesLineMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
