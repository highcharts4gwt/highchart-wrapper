
package com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Funnel;
import com.usesoft.highcharts4gwt.model.highcharts.jso.plotoptions.JsoPie;

public class JsoFunnel
    extends JsoPie
    implements Funnel
{


    protected JsoFunnel() {
    }

    public final native double heightAsNumber()
        throws RuntimeException /*-{
        return this["height"] = (this["height"] || null);
    }-*/
    ;

    public final native JsoFunnel heightAsNumber(double heightAsNumber)
        throws RuntimeException /*-{
        this["height"] = heightAsNumber;
        return this;
    }-*/
    ;

    public final native String heightAsString()
        throws RuntimeException /*-{
        return this["height"] = (this["height"] || "null");
    }-*/
    ;

    public final native JsoFunnel heightAsString(String heightAsString)
        throws RuntimeException /*-{
        this["height"] = heightAsString;
        return this;
    }-*/
    ;

    public final native double neckHeightAsNumber()
        throws RuntimeException /*-{
        return this["neckHeight"] = (this["neckHeight"] || null);
    }-*/
    ;

    public final native JsoFunnel neckHeightAsNumber(double neckHeightAsNumber)
        throws RuntimeException /*-{
        this["neckHeight"] = neckHeightAsNumber;
        return this;
    }-*/
    ;

    public final native String neckHeightAsString()
        throws RuntimeException /*-{
        return this["neckHeight"] = (this["neckHeight"] || "25%");
    }-*/
    ;

    public final native JsoFunnel neckHeightAsString(String neckHeightAsString)
        throws RuntimeException /*-{
        this["neckHeight"] = neckHeightAsString;
        return this;
    }-*/
    ;

    public final native double neckWidthAsNumber()
        throws RuntimeException /*-{
        return this["neckWidth"] = (this["neckWidth"] || null);
    }-*/
    ;

    public final native JsoFunnel neckWidthAsNumber(double neckWidthAsNumber)
        throws RuntimeException /*-{
        this["neckWidth"] = neckWidthAsNumber;
        return this;
    }-*/
    ;

    public final native String neckWidthAsString()
        throws RuntimeException /*-{
        return this["neckWidth"] = (this["neckWidth"] || "30%");
    }-*/
    ;

    public final native JsoFunnel neckWidthAsString(String neckWidthAsString)
        throws RuntimeException /*-{
        this["neckWidth"] = neckWidthAsString;
        return this;
    }-*/
    ;

    public final native boolean reversed()
        throws RuntimeException /*-{
        return this["reversed"] = (this["reversed"] || false);
    }-*/
    ;

    public final native JsoFunnel reversed(boolean reversed)
        throws RuntimeException /*-{
        this["reversed"] = reversed;
        return this;
    }-*/
    ;

    public final native double widthAsNumber()
        throws RuntimeException /*-{
        return this["width"] = (this["width"] || null);
    }-*/
    ;

    public final native JsoFunnel widthAsNumber(double widthAsNumber)
        throws RuntimeException /*-{
        this["width"] = widthAsNumber;
        return this;
    }-*/
    ;

    public final native String widthAsString()
        throws RuntimeException /*-{
        return this["width"] = (this["width"] || "90%");
    }-*/
    ;

    public final native JsoFunnel widthAsString(String widthAsString)
        throws RuntimeException /*-{
        this["width"] = widthAsString;
        return this;
    }-*/
    ;

}
