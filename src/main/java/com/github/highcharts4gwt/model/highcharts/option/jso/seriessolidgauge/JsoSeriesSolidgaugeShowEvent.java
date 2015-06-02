
package com.github.highcharts4gwt.model.highcharts.option.jso.seriessolidgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSolidgaugeShowEvent
    extends NativeEvent
    implements SeriesSolidgaugeShowEvent
{


    protected JsoSeriesSolidgaugeShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
