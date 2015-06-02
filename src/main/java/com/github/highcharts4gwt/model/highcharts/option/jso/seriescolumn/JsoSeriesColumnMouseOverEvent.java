
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumn;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumn.SeriesColumnMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnMouseOverEvent
    extends NativeEvent
    implements SeriesColumnMouseOverEvent
{


    protected JsoSeriesColumnMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
