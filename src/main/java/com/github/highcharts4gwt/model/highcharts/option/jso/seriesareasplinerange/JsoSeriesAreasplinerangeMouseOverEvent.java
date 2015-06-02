
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareasplinerange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreasplinerangeMouseOverEvent
    extends NativeEvent
    implements SeriesAreasplinerangeMouseOverEvent
{


    protected JsoSeriesAreasplinerangeMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
