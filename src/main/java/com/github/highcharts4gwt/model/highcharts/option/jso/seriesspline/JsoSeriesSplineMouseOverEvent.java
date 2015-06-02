
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesspline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.SeriesSplineMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesSplineMouseOverEvent
    extends NativeEvent
    implements SeriesSplineMouseOverEvent
{


    protected JsoSeriesSplineMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
