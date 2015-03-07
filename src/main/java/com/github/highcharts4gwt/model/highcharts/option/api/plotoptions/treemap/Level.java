
package com.github.highcharts4gwt.model.highcharts.option.api.plotoptions.treemap;


public interface Level {


    String borderColor();

    Level borderColor(String borderColor);

    String borderDashStyle();

    Level borderDashStyle(String borderDashStyle);

    double borderWidth();

    Level borderWidth(double borderWidth);

    String color();

    Level color(String color);

    String dataLabels();

    Level dataLabels(String dataLabelsAsJsonString);

    String layoutAlgorithm();

    Level layoutAlgorithm(String layoutAlgorithm);

    String layoutStartingDirection();

    Level layoutStartingDirection(String layoutStartingDirection);

    double level();

    Level level(double level);

    String getFieldAsJsonObject(String fieldName);

    Level setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
