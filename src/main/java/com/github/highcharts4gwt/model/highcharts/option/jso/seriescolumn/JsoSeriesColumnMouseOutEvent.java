
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumn;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnMouseOutEvent
    extends NativeEvent
    implements SeriesColumnMouseOutEvent
{


    protected JsoSeriesColumnMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
