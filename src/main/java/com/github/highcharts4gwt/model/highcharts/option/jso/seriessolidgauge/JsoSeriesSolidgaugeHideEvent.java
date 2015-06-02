
package com.github.highcharts4gwt.model.highcharts.option.jso.seriessolidgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSolidgaugeHideEvent
    extends NativeEvent
    implements SeriesSolidgaugeHideEvent
{


    protected JsoSeriesSolidgaugeHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
