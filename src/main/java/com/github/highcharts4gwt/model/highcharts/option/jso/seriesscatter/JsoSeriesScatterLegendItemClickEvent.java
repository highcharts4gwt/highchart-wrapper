
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesscatter;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.SeriesScatterLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesScatterLegendItemClickEvent
    extends NativeEvent
    implements SeriesScatterLegendItemClickEvent
{


    protected JsoSeriesScatterLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
