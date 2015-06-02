
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareaspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreasplineMouseOutEvent
    extends NativeEvent
    implements SeriesAreasplineMouseOutEvent
{


    protected JsoSeriesAreasplineMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
