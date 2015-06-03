
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.treemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.MouseOverEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoMouseOverEvent
    extends NativeEvent
    implements MouseOverEvent
{


    protected JsoMouseOverEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
