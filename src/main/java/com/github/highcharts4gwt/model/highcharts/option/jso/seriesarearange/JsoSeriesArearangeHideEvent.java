
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarearange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesArearangeHideEvent
    extends NativeEvent
    implements SeriesArearangeHideEvent
{


    protected JsoSeriesArearangeHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
