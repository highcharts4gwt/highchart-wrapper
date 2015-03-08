
package com.github.highcharts4gwt.model.highcharts.option.jso.exporting;

import com.github.highcharts4gwt.model.highcharts.option.api.exporting.Buttons;
import com.github.highcharts4gwt.model.highcharts.option.api.exporting.buttons.ContextButton;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * Options for the export related buttons, print and export. In addition to the default buttons listed here, custom buttons can be added. See <a href="#navigation.buttonOptions">navigation.buttonOptions</a> for general options.
 * 
 */
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

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoButtons setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

}
