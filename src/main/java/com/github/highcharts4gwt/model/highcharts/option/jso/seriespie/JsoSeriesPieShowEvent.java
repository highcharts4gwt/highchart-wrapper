
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespie;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPieShowEvent
    extends NativeEvent
    implements SeriesPieShowEvent
{


    protected JsoSeriesPieShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
