
package com.github.highcharts4gwt.model.highcharts.option.jso.seriessolidgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSolidgaugeClickEvent
    extends NativeEvent
    implements SeriesSolidgaugeClickEvent
{


    protected JsoSeriesSolidgaugeClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
