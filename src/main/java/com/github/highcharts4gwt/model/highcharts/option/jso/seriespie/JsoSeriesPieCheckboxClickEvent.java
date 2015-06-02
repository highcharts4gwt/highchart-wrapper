
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespie;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.SeriesPieCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesPieCheckboxClickEvent
    extends NativeEvent
    implements SeriesPieCheckboxClickEvent
{


    protected JsoSeriesPieCheckboxClickEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
