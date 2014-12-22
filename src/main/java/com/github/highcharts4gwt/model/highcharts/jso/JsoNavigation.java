
package com.github.highcharts4gwt.model.highcharts.jso;

import com.github.highcharts4gwt.model.highcharts.api.Navigation;
import com.github.highcharts4gwt.model.highcharts.api.navigation.ButtonOptions;
import com.google.gwt.core.client.JavaScriptObject;

public class JsoNavigation
    extends JavaScriptObject
    implements Navigation
{


    protected JsoNavigation() {
    }

    public final native ButtonOptions buttonOptions()
        throws RuntimeException /*-{
        return this["buttonOptions"] = (this["buttonOptions"] || {});
    }-*/
    ;

    public final native JsoNavigation buttonOptions(ButtonOptions buttonOptions)
        throws RuntimeException /*-{
        this["buttonOptions"] = buttonOptions;
        return this;
    }-*/
    ;

    public final native String menuItemHoverStyle()
        throws RuntimeException /*-{
        this["menuItemHoverStyle"] = (this["menuItemHoverStyle"] || {});
        return JSON.stringify(this["menuItemHoverStyle"]);
    }-*/
    ;

    public final native JsoNavigation menuItemHoverStyle(String menuItemHoverStyleAsJsonString)
        throws RuntimeException /*-{
        this["menuItemHoverStyle"] = JSON.parse(menuItemHoverStyleAsJsonString);
        return this;
    }-*/
    ;

    public final native String menuItemStyle()
        throws RuntimeException /*-{
        this["menuItemStyle"] = (this["menuItemStyle"] || {});
        return JSON.stringify(this["menuItemStyle"]);
    }-*/
    ;

    public final native JsoNavigation menuItemStyle(String menuItemStyleAsJsonString)
        throws RuntimeException /*-{
        this["menuItemStyle"] = JSON.parse(menuItemStyleAsJsonString);
        return this;
    }-*/
    ;

    public final native String menuStyle()
        throws RuntimeException /*-{
        this["menuStyle"] = (this["menuStyle"] || {});
        return JSON.stringify(this["menuStyle"]);
    }-*/
    ;

    public final native JsoNavigation menuStyle(String menuStyleAsJsonString)
        throws RuntimeException /*-{
        this["menuStyle"] = JSON.parse(menuStyleAsJsonString);
        return this;
    }-*/
    ;

}
