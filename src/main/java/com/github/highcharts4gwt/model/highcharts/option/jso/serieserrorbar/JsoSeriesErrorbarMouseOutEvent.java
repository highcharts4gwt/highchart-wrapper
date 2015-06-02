
package com.github.highcharts4gwt.model.highcharts.option.jso.serieserrorbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.serieserrorbar.SeriesErrorbarMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesErrorbarMouseOutEvent
    extends NativeEvent
    implements SeriesErrorbarMouseOutEvent
{


    protected JsoSeriesErrorbarMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
