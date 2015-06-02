
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.SeriesSplineShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSplineShowEvent
    extends NativeEvent
    implements SeriesSplineShowEvent
{


    protected JsoSeriesSplineShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
