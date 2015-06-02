
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareaspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreasplineLegendItemClickEvent
    extends NativeEvent
    implements SeriesAreasplineLegendItemClickEvent
{


    protected JsoSeriesAreasplineLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
