
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.columnrange;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.columnrange.ColumnrangeHideEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoColumnrangeHideEvent
    extends NativeEvent
    implements ColumnrangeHideEvent
{


    protected JsoColumnrangeHideEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
