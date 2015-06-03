
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesfunnel.data;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesfunnel.data.MouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoMouseOutEvent
    extends NativeEvent
    implements MouseOutEvent
{


    protected JsoMouseOutEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
