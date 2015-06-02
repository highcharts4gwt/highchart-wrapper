
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareaspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreasplineAfterAnimateEvent
    extends NativeEvent
    implements SeriesAreasplineAfterAnimateEvent
{


    protected JsoSeriesAreasplineAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
