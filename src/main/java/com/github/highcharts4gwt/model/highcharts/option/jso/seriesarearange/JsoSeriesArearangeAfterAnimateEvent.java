
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarearange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesArearangeAfterAnimateEvent
    extends NativeEvent
    implements SeriesArearangeAfterAnimateEvent
{


    protected JsoSeriesArearangeAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
