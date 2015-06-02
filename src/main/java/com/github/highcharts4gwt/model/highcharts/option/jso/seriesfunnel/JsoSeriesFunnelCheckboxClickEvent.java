
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesfunnel;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.SeriesFunnelCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesFunnelCheckboxClickEvent
    extends NativeEvent
    implements SeriesFunnelCheckboxClickEvent
{


    protected JsoSeriesFunnelCheckboxClickEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
