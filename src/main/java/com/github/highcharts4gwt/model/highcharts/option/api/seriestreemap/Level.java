
package com.github.highcharts4gwt.model.highcharts.option.api.seriestreemap;



/**
 * Set options on specific levels. Takes precedence over series options, but not point options.
 * 
 */
public interface Level {


    /**
     * Can set borderColor on all points which lies on the same level.
     * 
     */
    String borderColor();

    /**
     * Can set borderColor on all points which lies on the same level.
     * 
     */
    Level borderColor(String borderColor);

    /**
     * Set the dash style of the border of all the point which lies on the level.
     * See <a href"#plotOptions.scatter.dashStyle">plotOptions.scatter.dashStyle</a> for possible options.
     * 
     */
    String borderDashStyle();

    /**
     * Set the dash style of the border of all the point which lies on the level.
     * See <a href"#plotOptions.scatter.dashStyle">plotOptions.scatter.dashStyle</a> for possible options.
     * 
     */
    Level borderDashStyle(String borderDashStyle);

    /**
     * Can set the borderWidth on all points which lies on the same level.
     * 
     */
    double borderWidth();

    /**
     * Can set the borderWidth on all points which lies on the same level.
     * 
     */
    Level borderWidth(double borderWidth);

    /**
     * Can set a color on all points which lies on the same level.
     * 
     */
    String color();

    /**
     * Can set a color on all points which lies on the same level.
     * 
     */
    Level color(String color);

    /**
     * Can set the options of dataLabels on each point which lies on the level.
     * <a href="#plotOptions.treemap.dataLabels">plotOptions.treemap.dataLabels</a> for possible values.
     * 
     */
    String dataLabels();

    /**
     * Can set the options of dataLabels on each point which lies on the level.
     * <a href="#plotOptions.treemap.dataLabels">plotOptions.treemap.dataLabels</a> for possible values.
     * 
     */
    Level dataLabels(String dataLabelsAsJsonString);

    /**
     * Can set the layoutAlgorithm option on a specific level.
     * 
     */
    String layoutAlgorithm();

    /**
     * Can set the layoutAlgorithm option on a specific level.
     * 
     */
    Level layoutAlgorithm(String layoutAlgorithm);

    /**
     * Can set the layoutStartingDirection option on a specific level.
     * 
     */
    String layoutStartingDirection();

    /**
     * Can set the layoutStartingDirection option on a specific level.
     * 
     */
    Level layoutStartingDirection(String layoutStartingDirection);

    /**
     * Decides which level takes effect from the options set in the levels object.
     * 
     */
    double level();

    /**
     * Decides which level takes effect from the options set in the levels object.
     * 
     */
    Level level(double level);

    String getFieldAsJsonObject(String fieldName);

    Level setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

    String getFunctionAsString(String fieldName);

    Level setFunctionAsString(String fieldName, String functionAsString);

}
