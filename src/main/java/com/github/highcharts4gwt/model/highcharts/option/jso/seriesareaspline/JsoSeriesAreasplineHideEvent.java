
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareaspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareaspline.SeriesAreasplineHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreasplineHideEvent
    extends NativeEvent
    implements SeriesAreasplineHideEvent
{


    protected JsoSeriesAreasplineHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
