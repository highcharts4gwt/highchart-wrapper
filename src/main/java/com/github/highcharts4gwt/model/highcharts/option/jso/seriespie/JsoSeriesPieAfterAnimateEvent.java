
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespie;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPieAfterAnimateEvent
    extends NativeEvent
    implements SeriesPieAfterAnimateEvent
{


    protected JsoSeriesPieAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
