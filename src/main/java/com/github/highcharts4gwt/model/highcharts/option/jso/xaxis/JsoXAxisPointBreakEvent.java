
package com.github.highcharts4gwt.model.highcharts.option.jso.xaxis;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.option.api.xaxis.XAxisPointBreakEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoXAxisPointBreakEvent
    extends NativeEvent
    implements XAxisPointBreakEvent
{


    protected JsoXAxisPointBreakEvent() {
    }

    public final native Axis axis()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
