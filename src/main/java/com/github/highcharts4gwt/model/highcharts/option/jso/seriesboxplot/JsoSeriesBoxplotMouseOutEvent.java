
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesboxplot;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBoxplotMouseOutEvent
    extends NativeEvent
    implements SeriesBoxplotMouseOutEvent
{


    protected JsoSeriesBoxplotMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
