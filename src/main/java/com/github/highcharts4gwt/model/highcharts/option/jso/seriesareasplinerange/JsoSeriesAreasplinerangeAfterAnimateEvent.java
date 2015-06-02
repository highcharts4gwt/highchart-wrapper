
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareasplinerange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreasplinerangeAfterAnimateEvent
    extends NativeEvent
    implements SeriesAreasplinerangeAfterAnimateEvent
{


    protected JsoSeriesAreasplinerangeAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
