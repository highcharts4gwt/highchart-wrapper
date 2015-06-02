
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesscatter;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesscatter.SeriesScatterCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesScatterCheckboxClickEvent
    extends NativeEvent
    implements SeriesScatterCheckboxClickEvent
{


    protected JsoSeriesScatterCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
