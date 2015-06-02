
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesscatter;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.SeriesScatterAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesScatterAfterAnimateEvent
    extends NativeEvent
    implements SeriesScatterAfterAnimateEvent
{


    protected JsoSeriesScatterAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
