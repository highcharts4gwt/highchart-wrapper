
package com.github.highcharts4gwt.model.highcharts.option.api.yaxis.plotbands;


public interface Label {


    String align();

    Label align(String align);

    double rotation();

    Label rotation(double rotation);

    String style();

    Label style(String styleAsJsonString);

    String text();

    Label text(String text);

    String textAlign();

    Label textAlign(String textAlign);

    boolean useHTML();

    Label useHTML(boolean useHTML);

    String verticalAlign();

    Label verticalAlign(String verticalAlign);

    double x();

    Label x(double x);

    double y();

    Label y(double y);

    String getFieldAsJsonObject(String fieldName);

    Label setFieldAsJsonObject(String fieldName, String fieldValueAsJonObject);

}
