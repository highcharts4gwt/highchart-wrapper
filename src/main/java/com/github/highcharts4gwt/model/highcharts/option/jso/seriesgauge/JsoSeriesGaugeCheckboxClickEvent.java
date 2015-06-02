
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesGaugeCheckboxClickEvent
    extends NativeEvent
    implements SeriesGaugeCheckboxClickEvent
{


    protected JsoSeriesGaugeCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
