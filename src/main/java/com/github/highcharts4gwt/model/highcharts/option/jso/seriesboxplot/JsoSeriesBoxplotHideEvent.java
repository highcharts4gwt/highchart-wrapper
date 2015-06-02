
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesboxplot;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesboxplot.SeriesBoxplotHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBoxplotHideEvent
    extends NativeEvent
    implements SeriesBoxplotHideEvent
{


    protected JsoSeriesBoxplotHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
