
package com.github.highcharts4gwt.model.highcharts.option.jso.yaxis;

import com.github.highcharts4gwt.model.highcharts.object.api.Axis;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.AfterSetExtremesEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoAfterSetExtremesEvent
    extends NativeEvent
    implements AfterSetExtremesEvent
{


    protected JsoAfterSetExtremesEvent() {
    }

    public final native Axis axis()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
