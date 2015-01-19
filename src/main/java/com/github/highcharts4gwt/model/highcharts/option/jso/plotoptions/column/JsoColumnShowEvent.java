
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.column;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.column.ColumnShowEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnShowEvent
    extends NativeEvent
    implements ColumnShowEvent
{


    protected JsoColumnShowEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
