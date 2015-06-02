
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesGaugeAfterAnimateEvent
    extends NativeEvent
    implements SeriesGaugeAfterAnimateEvent
{


    protected JsoSeriesGaugeAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
