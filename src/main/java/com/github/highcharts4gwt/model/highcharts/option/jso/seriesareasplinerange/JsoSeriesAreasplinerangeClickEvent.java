
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareasplinerange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreasplinerangeClickEvent
    extends NativeEvent
    implements SeriesAreasplinerangeClickEvent
{


    protected JsoSeriesAreasplinerangeClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
