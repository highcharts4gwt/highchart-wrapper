
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarearange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesArearangeLegendItemClickEvent
    extends NativeEvent
    implements SeriesArearangeLegendItemClickEvent
{


    protected JsoSeriesArearangeLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
