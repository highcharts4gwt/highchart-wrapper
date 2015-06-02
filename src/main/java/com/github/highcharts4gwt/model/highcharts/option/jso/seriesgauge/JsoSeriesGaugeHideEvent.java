
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesGaugeHideEvent
    extends NativeEvent
    implements SeriesGaugeHideEvent
{


    protected JsoSeriesGaugeHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
