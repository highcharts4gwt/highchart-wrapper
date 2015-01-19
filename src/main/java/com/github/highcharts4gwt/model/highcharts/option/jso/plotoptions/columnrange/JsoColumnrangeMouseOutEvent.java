
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeMouseOutEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnrangeMouseOutEvent
    extends NativeEvent
    implements ColumnrangeMouseOutEvent
{


    protected JsoColumnrangeMouseOutEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
