
package com.github.highcharts4gwt.model.highcharts.option.jso.seriessolidgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSolidgaugeMouseOutEvent
    extends NativeEvent
    implements SeriesSolidgaugeMouseOutEvent
{


    protected JsoSeriesSolidgaugeMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
