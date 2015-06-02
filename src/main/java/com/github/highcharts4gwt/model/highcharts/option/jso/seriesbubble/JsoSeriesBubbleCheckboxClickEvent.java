
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesbubble;

import com.github.highcharts4gwt.model.highcharts.object.api.Series;
import com.github.highcharts4gwt.model.highcharts.option.api.seriesbubble.SeriesBubbleCheckboxClickEvent;
import com.google.gwt.dom.client.NativeEvent;

public class JsoSeriesBubbleCheckboxClickEvent
    extends NativeEvent
    implements SeriesBubbleCheckboxClickEvent
{


    protected JsoSeriesBubbleCheckboxClickEvent() {
    }

    public final native Series series()
        throws RuntimeException /*-{
        return this.source;
    }-*/
    ;

}
