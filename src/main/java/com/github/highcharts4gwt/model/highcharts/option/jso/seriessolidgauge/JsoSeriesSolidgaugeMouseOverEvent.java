
package com.github.highcharts4gwt.model.highcharts.option.jso.seriessolidgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSolidgaugeMouseOverEvent
    extends NativeEvent
    implements SeriesSolidgaugeMouseOverEvent
{


    protected JsoSeriesSolidgaugeMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
