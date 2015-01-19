
package com.github.highcharts4gwt.model.highcharts.option.jso.xaxis;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.XAxisAfterSetExtremesEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoXAxisAfterSetExtremesEvent
    extends NativeEvent
    implements XAxisAfterSetExtremesEvent
{


    protected JsoXAxisAfterSetExtremesEvent() {
    }

    public final native Axis axis()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
