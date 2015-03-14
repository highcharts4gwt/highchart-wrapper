
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.gauge;



/**
 * Options for the dial or arrow pointer of the gauge.
 * 
 */
public interface Dial {


    /**
     * The background or fill color of the gauge's dial.
     * 
     */
    String backgroundColor();

    /**
     * The background or fill color of the gauge's dial.
     * 
     */
    Dial backgroundColor(String backgroundColor);

    /**
     * The length of the dial's base part, relative to the total radius or length of the dial.
     * 
     */
    String baseLength();

    /**
     * The length of the dial's base part, relative to the total radius or length of the dial.
     * 
     */
    Dial baseLength(String baseLength);

    /**
     * The pixel width of the base of the gauge dial. The base is the part closest to the pivot, defined by baseLength.
     * 
     */
    double baseWidth();

    /**
     * The pixel width of the base of the gauge dial. The base is the part closest to the pivot, defined by baseLength.
     * 
     */
    Dial baseWidth(double baseWidth);

    /**
     * The border color or stroke of the gauge's dial. By default, the borderWidth is 0, so this must be set in addition to a custom border color.
     * 
     */
    String borderColor();

    /**
     * The border color or stroke of the gauge's dial. By default, the borderWidth is 0, so this must be set in addition to a custom border color.
     * 
     */
    Dial borderColor(String borderColor);

    /**
     * The width of the gauge dial border in pixels.
     * 
     */
    double borderWidth();

    /**
     * The width of the gauge dial border in pixels.
     * 
     */
    Dial borderWidth(double borderWidth);

    /**
     * The radius or length of the dial, in percentages relative to the radius of the gauge itself.
     * 
     */
    String radius();

    /**
     * The radius or length of the dial, in percentages relative to the radius of the gauge itself.
     * 
     */
    Dial radius(String radius);

    /**
     * The length of the dial's rear end, the part that extends out on the other side of the pivot. Relative to the dial's length.
     * 
     */
    String rearLength();

    /**
     * The length of the dial's rear end, the part that extends out on the other side of the pivot. Relative to the dial's length.
     * 
     */
    Dial rearLength(String rearLength);

    /**
     * The width of the top of the dial, closest to the perimeter. The pivot narrows in from the base to the top.
     * 
     */
    double topWidth();

    /**
     * The width of the top of the dial, closest to the perimeter. The pivot narrows in from the base to the top.
     * 
     */
    Dial topWidth(double topWidth);

    String getFieldAsJsonObject(String fieldName);

    Dial setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Dial setFunctionAsString(String fieldName, String functionAsString);

}
