
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesscatter;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.SeriesScatterClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesScatterClickEvent
    extends NativeEvent
    implements SeriesScatterClickEvent
{


    protected JsoSeriesScatterClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
