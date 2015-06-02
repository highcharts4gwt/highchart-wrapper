
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesgauge.SeriesGaugeLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesGaugeLegendItemClickEvent
    extends NativeEvent
    implements SeriesGaugeLegendItemClickEvent
{


    protected JsoSeriesGaugeLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
