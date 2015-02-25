
package com.github.highcharts4gwt.model.highcharts.option.jso.plotoptions.treemap;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap.TreemapAfterAnimateEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoTreemapAfterAnimateEvent
    extends NativeEvent
    implements TreemapAfterAnimateEvent
{


    protected JsoTreemapAfterAnimateEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
