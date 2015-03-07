
package com.github.highcharts4gwt.model.highcharts.option.api.legend;


public interface Title {


    String style();

    Title style(String styleAsJsonString);

    String text();

    Title text(String text);

    String getFieldAsJsonObject(String fieldName);

    Title setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
