
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbar.SeriesBarMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBarMouseOverEvent
    extends NativeEvent
    implements SeriesBarMouseOverEvent
{


    protected JsoSeriesBarMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
