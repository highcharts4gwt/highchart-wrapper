
package com.github.highcharts4gwt.model.highcharts.option.jso.seriespie.data;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriespie.data.DataMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoDataMouseOutEvent
    extends NativeEvent
    implements DataMouseOutEvent
{


    protected JsoDataMouseOutEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
