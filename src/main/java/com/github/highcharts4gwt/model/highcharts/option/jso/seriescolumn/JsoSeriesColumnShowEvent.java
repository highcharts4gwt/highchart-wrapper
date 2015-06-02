
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumn;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnShowEvent
    extends NativeEvent
    implements SeriesColumnShowEvent
{


    protected JsoSeriesColumnShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
