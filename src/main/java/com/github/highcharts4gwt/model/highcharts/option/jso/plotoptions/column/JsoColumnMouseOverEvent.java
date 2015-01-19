
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnMouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnMouseOverEvent
    extends NativeEvent
    implements ColumnMouseOverEvent
{


    protected JsoColumnMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
