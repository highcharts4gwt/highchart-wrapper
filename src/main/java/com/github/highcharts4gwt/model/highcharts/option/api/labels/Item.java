
package com.github.highcharts4gwt.model.highcharts.option.api.labels;


public interface Item {


    String html();

    Item html(String html);

    String style();

    Item style(String styleAsJsonString);

    String getFieldAsJsonObject(String fieldName);

    Item setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
