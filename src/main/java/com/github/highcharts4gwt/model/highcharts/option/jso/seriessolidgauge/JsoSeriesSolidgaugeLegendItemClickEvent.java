
package com.github.highcharts4gwt.model.highcharts.option.jso.seriessolidgauge;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriessolidgauge.SeriesSolidgaugeLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSolidgaugeLegendItemClickEvent
    extends NativeEvent
    implements SeriesSolidgaugeLegendItemClickEvent
{


    protected JsoSeriesSolidgaugeLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
