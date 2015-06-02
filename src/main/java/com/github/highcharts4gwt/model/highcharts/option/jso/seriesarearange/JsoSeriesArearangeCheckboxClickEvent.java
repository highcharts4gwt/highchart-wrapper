
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesarearange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesarearange.SeriesArearangeCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesArearangeCheckboxClickEvent
    extends NativeEvent
    implements SeriesArearangeCheckboxClickEvent
{


    protected JsoSeriesArearangeCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
