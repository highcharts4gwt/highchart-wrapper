
package com.github.highcharts4gwt.model.highcharts.option.jso.xaxis;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.XAxisSetExtremesEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoXAxisSetExtremesEvent
    extends NativeEvent
    implements XAxisSetExtremesEvent
{


    protected JsoXAxisSetExtremesEvent() {
    }

    public final native Axis axis()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
