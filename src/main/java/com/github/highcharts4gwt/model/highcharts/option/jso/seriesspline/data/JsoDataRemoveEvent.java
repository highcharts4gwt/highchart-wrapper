
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesspline.data;

import com.github.highcharts4gwt.model.highcharts.object.api.Point;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.data.DataRemoveEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoDataRemoveEvent
    extends NativeEvent
    implements DataRemoveEvent
{


    protected JsoDataRemoveEvent() {
    }

    public final native Point point()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
