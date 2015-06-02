
package com.github.highcharts4gwt.model.highcharts.option.jso.serieserrorbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesErrorbarAfterAnimateEvent
    extends NativeEvent
    implements SeriesErrorbarAfterAnimateEvent
{


    protected JsoSeriesErrorbarAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
