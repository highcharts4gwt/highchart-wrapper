
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.SeriesSplineAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSplineAfterAnimateEvent
    extends NativeEvent
    implements SeriesSplineAfterAnimateEvent
{


    protected JsoSeriesSplineAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
