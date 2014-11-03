
package com.usesoft.highcharts4gwt.model.highcharts.api.legend;


public interface Navigation {


    String activeColor();

    Navigation activeColor(String activeColor);

    boolean animationAsBoolean();

    Navigation animationAsBoolean(boolean animationAsBoolean);

    String animationAsJsonString();

    Navigation animationAsJsonString(String animationAsJsonString);

    double arrowSize();

    Navigation arrowSize(double arrowSize);

    String inactiveColor();

    Navigation inactiveColor(String inactiveColor);

    String style();

    Navigation style(String styleAsJsonString);

}
