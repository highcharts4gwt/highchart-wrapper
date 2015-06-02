
package com.github.highcharts4gwt.model.highcharts.option.jso.seriesspline;

import com.github.highcharts4gwt.model.highcharts.option.api.seriesspline.Tooltip;
import com.google.gwt.core.client.JavaScriptObject;


/**
 * A configuration object for the tooltip rendering of each single series. Properties are inherited from <a href="#tooltip">tooltip</a>, but only the following properties can be defined on a series level.
 * 
 */
public class JsoTooltip
    extends JavaScriptObject
    implements Tooltip
{


    protected JsoTooltip() {
    }

    public final native String dateTimeLabelFormats()
        throws RuntimeException /*-{
        this["dateTimeLabelFormats"] = (this["dateTimeLabelFormats"] || JSON.parse(''));
        return JSON.stringify(this["dateTimeLabelFormats"]);
    }-*/
    ;

    public final native JsoTooltip dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString)
        throws RuntimeException /*-{
        this["dateTimeLabelFormats"] = JSON.parse(dateTimeLabelFormatsAsJsonString);
        return this;
    }-*/
    ;

    public final native boolean followPointer()
        throws RuntimeException /*-{
        return this["followPointer"] = (this["followPointer"] || false);
    }-*/
    ;

    public final native JsoTooltip followPointer(boolean followPointer)
        throws RuntimeException /*-{
        this["followPointer"] = followPointer;
        return this;
    }-*/
    ;

    public final native boolean followTouchMove()
        throws RuntimeException /*-{
        return this["followTouchMove"] = (this["followTouchMove"] || true);
    }-*/
    ;

    public final native JsoTooltip followTouchMove(boolean followTouchMove)
        throws RuntimeException /*-{
        this["followTouchMove"] = followTouchMove;
        return this;
    }-*/
    ;

    public final native String footerFormat()
        throws RuntimeException /*-{
        return this["footerFormat"] = (this["footerFormat"] || "false");
    }-*/
    ;

    public final native JsoTooltip footerFormat(String footerFormat)
        throws RuntimeException /*-{
        this["footerFormat"] = footerFormat;
        return this;
    }-*/
    ;

    public final native String headerFormat()
        throws RuntimeException /*-{
        return this["headerFormat"] = (this["headerFormat"] || "");
    }-*/
    ;

    public final native JsoTooltip headerFormat(String headerFormat)
        throws RuntimeException /*-{
        this["headerFormat"] = headerFormat;
        return this;
    }-*/
    ;

    public final native double hideDelay()
        throws RuntimeException /*-{
        return this["hideDelay"] = (this["hideDelay"] || 500.0);
    }-*/
    ;

    public final native JsoTooltip hideDelay(double hideDelay)
        throws RuntimeException /*-{
        this["hideDelay"] = hideDelay;
        return this;
    }-*/
    ;

    public final native String pointFormat()
        throws RuntimeException /*-{
        return this["pointFormat"] = (this["pointFormat"] || "<span style=\"color:{point.color}\">\u25CF</span> {series.name}: <b>{point.y}</b><br/>");
    }-*/
    ;

    public final native JsoTooltip pointFormat(String pointFormat)
        throws RuntimeException /*-{
        this["pointFormat"] = pointFormat;
        return this;
    }-*/
    ;

    public final native String shape()
        throws RuntimeException /*-{
        return this["shape"] = (this["shape"] || "callout");
    }-*/
    ;

    public final native JsoTooltip shape(String shape)
        throws RuntimeException /*-{
        this["shape"] = shape;
        return this;
    }-*/
    ;

    public final native double valueDecimals()
        throws RuntimeException /*-{
        return this["valueDecimals"] = (this["valueDecimals"] || null);
    }-*/
    ;

    public final native JsoTooltip valueDecimals(double valueDecimals)
        throws RuntimeException /*-{
        this["valueDecimals"] = valueDecimals;
        return this;
    }-*/
    ;

    public final native String valuePrefix()
        throws RuntimeException /*-{
        return this["valuePrefix"] = (this["valuePrefix"] || "null");
    }-*/
    ;

    public final native JsoTooltip valuePrefix(String valuePrefix)
        throws RuntimeException /*-{
        this["valuePrefix"] = valuePrefix;
        return this;
    }-*/
    ;

    public final native String valueSuffix()
        throws RuntimeException /*-{
        return this["valueSuffix"] = (this["valueSuffix"] || "null");
    }-*/
    ;

    public final native JsoTooltip valueSuffix(String valueSuffix)
        throws RuntimeException /*-{
        this["valueSuffix"] = valueSuffix;
        return this;
    }-*/
    ;

    public final native String xDateFormat()
        throws RuntimeException /*-{
        return this["xDateFormat"] = (this["xDateFormat"] || "null");
    }-*/
    ;

    public final native JsoTooltip xDateFormat(String xDateFormat)
        throws RuntimeException /*-{
        this["xDateFormat"] = xDateFormat;
        return this;
    }-*/
    ;

    public final native String getFieldAsJsonObject(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoTooltip setFieldAsJsonObject(String fieldName, String fieldValueAsJsonObject)
        throws RuntimeException /*-{
        this[fieldName] = JSON.parse(fieldValueAsJsonObject);
        return this;
    }-*/
    ;

    public final native String getFunctionAsString(String fieldName)
        throws RuntimeException /*-{
        this[fieldName] = (this[fieldName] || {});
        return JSON.stringify(this[fieldName]);
    }-*/
    ;

    public final native JsoTooltip setFunctionAsString(String fieldName, String functionAsString)
        throws RuntimeException /*-{
        this[fieldName] = eval('(' + functionAsString + ')');
        return this;
    }-*/
    ;

}
