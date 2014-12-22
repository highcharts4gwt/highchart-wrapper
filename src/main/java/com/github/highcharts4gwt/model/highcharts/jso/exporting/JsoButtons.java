
package com.github.highcharts4gwt.model.highcharts.jso.exporting;

import com.github.highcharts4gwt.model.highcharts.api.exporting.Buttons;
import com.github.highcharts4gwt.model.highcharts.api.exporting.buttons.ContextButton;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoButtons
    extends JavaScriptObject
    implements Buttons
{


    protected JsoButtons() {
    }

    public final native ContextButton contextButton()
        throws RuntimeException /*-{
        return this["contextButton"] = (this["contextButton"] || {});
    }-*/
    ;

    public final native JsoButtons contextButton(ContextButton contextButton)
        throws RuntimeException /*-{
        this["contextButton"] = contextButton;
        return this;
    }-*/
    ;

}
