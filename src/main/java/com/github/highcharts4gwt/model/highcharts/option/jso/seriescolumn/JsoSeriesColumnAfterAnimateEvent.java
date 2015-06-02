
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumn;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnAfterAnimateEvent
    extends NativeEvent
    implements SeriesColumnAfterAnimateEvent
{


    protected JsoSeriesColumnAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
