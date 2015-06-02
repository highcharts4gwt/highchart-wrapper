
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesGaugeShowEvent
    extends NativeEvent
    implements SeriesGaugeShowEvent
{


    protected JsoSeriesGaugeShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
