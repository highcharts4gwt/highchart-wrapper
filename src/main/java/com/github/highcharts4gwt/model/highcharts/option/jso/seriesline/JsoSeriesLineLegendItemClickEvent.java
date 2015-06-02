
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.SeriesLineLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesLineLegendItemClickEvent
    extends NativeEvent
    implements SeriesLineLegendItemClickEvent
{


    protected JsoSeriesLineLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
