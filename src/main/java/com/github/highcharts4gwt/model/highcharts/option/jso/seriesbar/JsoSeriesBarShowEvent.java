
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesbar;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbar.SeriesBarShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBarShowEvent
    extends NativeEvent
    implements SeriesBarShowEvent
{


    protected JsoSeriesBarShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
