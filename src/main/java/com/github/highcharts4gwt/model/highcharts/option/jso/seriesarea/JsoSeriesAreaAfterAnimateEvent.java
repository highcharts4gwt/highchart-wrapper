
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarea;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarea.SeriesAreaAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreaAfterAnimateEvent
    extends NativeEvent
    implements SeriesAreaAfterAnimateEvent
{


    protected JsoSeriesAreaAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
