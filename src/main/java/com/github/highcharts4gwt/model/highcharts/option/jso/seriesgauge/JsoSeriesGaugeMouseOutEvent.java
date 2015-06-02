
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesGaugeMouseOutEvent
    extends NativeEvent
    implements SeriesGaugeMouseOutEvent
{


    protected JsoSeriesGaugeMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
