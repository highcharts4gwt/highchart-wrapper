
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnClickEvent
    extends NativeEvent
    implements ColumnClickEvent
{


    protected JsoColumnClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
