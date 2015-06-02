
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesboxplot;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBoxplotLegendItemClickEvent
    extends NativeEvent
    implements SeriesBoxplotLegendItemClickEvent
{


    protected JsoSeriesBoxplotLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
