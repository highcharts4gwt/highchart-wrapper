
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.SeriesSplineHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSplineHideEvent
    extends NativeEvent
    implements SeriesSplineHideEvent
{


    protected JsoSeriesSplineHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
