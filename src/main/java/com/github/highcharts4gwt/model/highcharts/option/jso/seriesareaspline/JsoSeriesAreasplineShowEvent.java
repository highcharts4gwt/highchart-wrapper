
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareaspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreasplineShowEvent
    extends NativeEvent
    implements SeriesAreasplineShowEvent
{


    protected JsoSeriesAreasplineShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
