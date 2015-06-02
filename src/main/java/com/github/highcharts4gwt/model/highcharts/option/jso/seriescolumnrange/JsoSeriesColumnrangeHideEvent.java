
package com.github.highcharts4gwt.model.highcharts.option.jso.seriescolumnrange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriescolumnrange.SeriesColumnrangeHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesColumnrangeHideEvent
    extends NativeEvent
    implements SeriesColumnrangeHideEvent
{


    protected JsoSeriesColumnrangeHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
