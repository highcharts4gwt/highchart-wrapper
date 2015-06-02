
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesline;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesline.SeriesLineShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesLineShowEvent
    extends NativeEvent
    implements SeriesLineShowEvent
{


    protected JsoSeriesLineShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
