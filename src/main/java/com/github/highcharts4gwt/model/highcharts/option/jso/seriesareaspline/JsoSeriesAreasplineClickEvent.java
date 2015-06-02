
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareaspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreasplineClickEvent
    extends NativeEvent
    implements SeriesAreasplineClickEvent
{


    protected JsoSeriesAreasplineClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
