
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareasplinerange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeLegendItemClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreasplinerangeLegendItemClickEvent
    extends NativeEvent
    implements SeriesAreasplinerangeLegendItemClickEvent
{


    protected JsoSeriesAreasplinerangeLegendItemClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
