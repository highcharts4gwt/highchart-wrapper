
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumnrange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.SeriesColumnrangeAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnrangeAfterAnimateEvent
    extends NativeEvent
    implements SeriesColumnrangeAfterAnimateEvent
{


    protected JsoSeriesColumnrangeAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
