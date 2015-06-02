
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.SeriesSplineLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSplineLegendItemClickEvent
    extends NativeEvent
    implements SeriesSplineLegendItemClickEvent
{


    protected JsoSeriesSplineLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
