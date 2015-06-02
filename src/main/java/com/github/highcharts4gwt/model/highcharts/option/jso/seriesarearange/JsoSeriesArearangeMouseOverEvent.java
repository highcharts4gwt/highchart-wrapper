
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarearange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesArearangeMouseOverEvent
    extends NativeEvent
    implements SeriesArearangeMouseOverEvent
{


    protected JsoSeriesArearangeMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
