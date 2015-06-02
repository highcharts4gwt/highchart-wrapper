
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesGaugeMouseOverEvent
    extends NativeEvent
    implements SeriesGaugeMouseOverEvent
{


    protected JsoSeriesGaugeMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
