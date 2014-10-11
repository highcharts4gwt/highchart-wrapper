
package com.usesoft.highcharts4gwt.model.highcharts.jso;

import com.google.gwt.core.client.JavaScriptObject;
import com.usesoft.highcharts4gwt.model.highcharts.api.Navigation;
import com.usesoft.highcharts4gwt.model.highcharts.api.navigation.ButtonOptions;

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

    public final native JsoNavigation menuItemHoverStyle(String menuItemHoverStyle)
        throws RuntimeException /*-{
        this["menuItemHoverStyle"] = JSON.parse(menuItemHoverStyle);
        return this;
    }-*/
    ;

    public final native String menuItemStyle()
        throws RuntimeException /*-{
        this["menuItemStyle"] = (this["menuItemStyle"] || {});
        return JSON.stringify(this["menuItemStyle"]);
    }-*/
    ;

    public final native JsoNavigation menuItemStyle(String menuItemStyle)
        throws RuntimeException /*-{
        this["menuItemStyle"] = JSON.parse(menuItemStyle);
        return this;
    }-*/
    ;

    public final native String menuStyle()
        throws RuntimeException /*-{
        this["menuStyle"] = (this["menuStyle"] || {});
        return JSON.stringify(this["menuStyle"]);
    }-*/
    ;

    public final native JsoNavigation menuStyle(String menuStyle)
        throws RuntimeException /*-{
        this["menuStyle"] = JSON.parse(menuStyle);
        return this;
    }-*/
    ;

}
