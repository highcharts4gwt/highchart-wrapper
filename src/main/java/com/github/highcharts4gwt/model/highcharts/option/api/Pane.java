
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;


/**
 * Applies only to polar charts and angular gauges. This configuration object holds general options for the combined X and Y axes set. Each xAxis or yAxis can reference the pane by index.
 * 
 */
public interface Pane {


    /**
     * An object, or array of objects, for backgrounds. Sub options include <code>backgroundColor</code> (can be solid or gradient), <code>shape</code> ("solid" or "arc"), <code>innerWidth</code>, <code>outerWidth</code>, <code>borderWidth</code>, <code>borderColor</code>.
     * 
     */
    String background();

    /**
     * An object, or array of objects, for backgrounds. Sub options include <code>backgroundColor</code> (can be solid or gradient), <code>shape</code> ("solid" or "arc"), <code>innerWidth</code>, <code>outerWidth</code>, <code>borderWidth</code>, <code>borderColor</code>.
     * 
     */
    Pane background(String backgroundAsJsonStringArray);

    /**
     * The center of a polar chart or angular gauge, given as an array of [x, y] positions. Positions can be given as integers that transform to pixels, or as percentages of the plot area size.
     * 
     */
    ArrayString centerAsArrayString();

    /**
     * The center of a polar chart or angular gauge, given as an array of [x, y] positions. Positions can be given as integers that transform to pixels, or as percentages of the plot area size.
     * 
     */
    Pane centerAsArrayString(ArrayString centerAsArrayString);

    /**
     * The center of a polar chart or angular gauge, given as an array of [x, y] positions. Positions can be given as integers that transform to pixels, or as percentages of the plot area size.
     * 
     */
    ArrayNumber centerAsArrayNumber();

    /**
     * The center of a polar chart or angular gauge, given as an array of [x, y] positions. Positions can be given as integers that transform to pixels, or as percentages of the plot area size.
     * 
     */
    Pane centerAsArrayNumber(ArrayNumber centerAsArrayNumber);

    /**
     * The end angle of the polar X axis or gauge value axis, given in degrees where 0 is north. Defaults to <a href="#pane.startAngle">startAngle</a> + 360.
     * 
     */
    double endAngle();

    /**
     * The end angle of the polar X axis or gauge value axis, given in degrees where 0 is north. Defaults to <a href="#pane.startAngle">startAngle</a> + 360.
     * 
     */
    Pane endAngle(double endAngle);

    /**
     * The size of the pane, either as a number defining pixels, or a percentage defining a percentage of the plot are.
     * 
     */
    double sizeAsNumber();

    /**
     * The size of the pane, either as a number defining pixels, or a percentage defining a percentage of the plot are.
     * 
     */
    Pane sizeAsNumber(double sizeAsNumber);

    /**
     * The size of the pane, either as a number defining pixels, or a percentage defining a percentage of the plot are.
     * 
     */
    String sizeAsString();

    /**
     * The size of the pane, either as a number defining pixels, or a percentage defining a percentage of the plot are.
     * 
     */
    Pane sizeAsString(String sizeAsString);

    /**
     * The start angle of the polar X axis or gauge axis, given in degrees where 0 is north. Defaults to 0.
     * 
     */
    double startAngle();

    /**
     * The start angle of the polar X axis or gauge axis, given in degrees where 0 is north. Defaults to 0.
     * 
     */
    Pane startAngle(double startAngle);

    String getFieldAsJsonObject(String fieldName);

    Pane setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
