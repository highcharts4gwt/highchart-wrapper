
package com.github.highcharts4gwt.model.highcharts.option.api;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;

public interface Pane {


    String background();

    Pane background(String backgroundAsJsonStringArray);

    ArrayString centerAsArrayString();

    Pane centerAsArrayString(ArrayString centerAsArrayString);

    ArrayNumber centerAsArrayNumber();

    Pane centerAsArrayNumber(ArrayNumber centerAsArrayNumber);

    double endAngle();

    Pane endAngle(double endAngle);

    double sizeAsNumber();

    Pane sizeAsNumber(double sizeAsNumber);

    String sizeAsString();

    Pane sizeAsString(String sizeAsString);

    double startAngle();

    Pane startAngle(double startAngle);

    String getFieldAsJsonObject(String fieldName);

    Pane setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
