
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumnrange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.SeriesColumnrangeShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnrangeShowEvent
    extends NativeEvent
    implements SeriesColumnrangeShowEvent
{


    protected JsoSeriesColumnrangeShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
