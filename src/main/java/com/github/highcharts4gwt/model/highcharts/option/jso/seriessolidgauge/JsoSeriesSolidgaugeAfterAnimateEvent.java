
package com.github.highcharts4gwt.model.highcharts.option.jso.seriessolidgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSolidgaugeAfterAnimateEvent
    extends NativeEvent
    implements SeriesSolidgaugeAfterAnimateEvent
{


    protected JsoSeriesSolidgaugeAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
