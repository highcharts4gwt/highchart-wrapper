
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespie;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPieMouseOutEvent
    extends NativeEvent
    implements SeriesPieMouseOutEvent
{


    protected JsoSeriesPieMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
