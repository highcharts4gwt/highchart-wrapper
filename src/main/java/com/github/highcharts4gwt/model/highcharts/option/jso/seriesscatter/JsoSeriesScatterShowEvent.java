
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesscatter;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.SeriesScatterShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesScatterShowEvent
    extends NativeEvent
    implements SeriesScatterShowEvent
{


    protected JsoSeriesScatterShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
