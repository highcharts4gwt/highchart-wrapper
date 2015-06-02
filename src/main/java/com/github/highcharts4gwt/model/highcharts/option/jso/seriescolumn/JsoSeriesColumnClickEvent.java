
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumn;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnClickEvent
    extends NativeEvent
    implements SeriesColumnClickEvent
{


    protected JsoSeriesColumnClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
