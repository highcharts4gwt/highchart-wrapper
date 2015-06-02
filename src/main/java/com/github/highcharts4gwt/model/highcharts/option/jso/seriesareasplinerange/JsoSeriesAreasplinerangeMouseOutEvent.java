
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareasplinerange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreasplinerangeMouseOutEvent
    extends NativeEvent
    implements SeriesAreasplinerangeMouseOutEvent
{


    protected JsoSeriesAreasplinerangeMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
