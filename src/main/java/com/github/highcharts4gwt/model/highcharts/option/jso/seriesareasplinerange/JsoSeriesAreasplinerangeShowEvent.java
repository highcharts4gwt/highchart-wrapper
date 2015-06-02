
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesareasplinerange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesareasplinerange.SeriesAreasplinerangeShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesAreasplinerangeShowEvent
    extends NativeEvent
    implements SeriesAreasplinerangeShowEvent
{


    protected JsoSeriesAreasplinerangeShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
