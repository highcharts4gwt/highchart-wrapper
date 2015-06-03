
package com.github.highcharts4gwt.model.highcharts.option.jso.yaxis;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.SetExtremesEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSetExtremesEvent
    extends NativeEvent
    implements SetExtremesEvent
{


    protected JsoSetExtremesEvent() {
    }

    public final native Axis axis()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
