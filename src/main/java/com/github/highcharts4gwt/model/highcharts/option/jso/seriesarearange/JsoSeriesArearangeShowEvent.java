
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarearange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesArearangeShowEvent
    extends NativeEvent
    implements SeriesArearangeShowEvent
{


    protected JsoSeriesArearangeShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
