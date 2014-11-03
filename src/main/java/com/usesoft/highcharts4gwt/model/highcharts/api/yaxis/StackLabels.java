
package com.usesoft.highcharts4gwt.model.highcharts.api.yaxis;


public interface StackLabels {


    String align();

    StackLabels align(String align);

    boolean enabled();

    StackLabels enabled(boolean enabled);

    String format();

    StackLabels format(String format);

    double rotation();

    StackLabels rotation(double rotation);

    String style();

    StackLabels style(String styleAsJsonString);

    String textAlign();

    StackLabels textAlign(String textAlign);

    boolean useHTML();

    StackLabels useHTML(boolean useHTML);

    String verticalAlign();

    StackLabels verticalAlign(String verticalAlign);

    double x();

    StackLabels x(double x);

    double y();

    StackLabels y(double y);

}
