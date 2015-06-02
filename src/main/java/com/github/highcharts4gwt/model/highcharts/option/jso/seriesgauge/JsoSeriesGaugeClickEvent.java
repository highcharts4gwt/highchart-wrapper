
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesGaugeClickEvent
    extends NativeEvent
    implements SeriesGaugeClickEvent
{


    protected JsoSeriesGaugeClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
