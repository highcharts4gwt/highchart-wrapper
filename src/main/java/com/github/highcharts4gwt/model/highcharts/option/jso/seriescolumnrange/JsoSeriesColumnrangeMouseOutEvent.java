
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumnrange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.SeriesColumnrangeMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnrangeMouseOutEvent
    extends NativeEvent
    implements SeriesColumnrangeMouseOutEvent
{


    protected JsoSeriesColumnrangeMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
