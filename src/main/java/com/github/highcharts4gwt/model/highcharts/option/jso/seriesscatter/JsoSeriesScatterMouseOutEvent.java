
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesscatter;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.SeriesScatterMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesScatterMouseOutEvent
    extends NativeEvent
    implements SeriesScatterMouseOutEvent
{


    protected JsoSeriesScatterMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
