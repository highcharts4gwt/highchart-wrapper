
package com.github.highcharts4gwt.model.highcharts.option.api.xaxis;



/**
 * An array defining breaks in the axis, the sections defined will be left out and all the points shifted closer to each other. Requires that the broken-axis.js module is loaded.
 * 
 */
public interface Break {


    /**
     * A number indicating how much space should be left between the start and the end of the break. The break size is given in axis units, so for instance on a <code>datetime</code> axis, a break size of 3600000 would indicate the equivalent of an hour.
     * 
     */
    double breakSize();

    /**
     * A number indicating how much space should be left between the start and the end of the break. The break size is given in axis units, so for instance on a <code>datetime</code> axis, a break size of 3600000 would indicate the equivalent of an hour.
     * 
     */
    Break breakSize(double breakSize);

    /**
     * The point where the break starts.
     * 
     */
    double from();

    /**
     * The point where the break starts.
     * 
     */
    Break from(double from);

    /**
     * Defines an interval after which the break appears again. By default the breaks do not repeat.
     * 
     */
    double repeat();

    /**
     * Defines an interval after which the break appears again. By default the breaks do not repeat.
     * 
     */
    Break repeat(double repeat);

    /**
     * The point where the break ends.
     * 
     */
    double to();

    /**
     * The point where the break ends.
     * 
     */
    Break to(double to);

    String getFieldAsJsonObject(String fieldName);

    Break setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Break setFunctionAsString(String fieldName, String functionAsString);

}
