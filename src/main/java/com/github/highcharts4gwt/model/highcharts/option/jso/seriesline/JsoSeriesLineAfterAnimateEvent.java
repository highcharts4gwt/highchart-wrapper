
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.SeriesLineAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesLineAfterAnimateEvent
    extends NativeEvent
    implements SeriesLineAfterAnimateEvent
{


    protected JsoSeriesLineAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
