
package com.github.highcharts4gwt.model.highcharts.api.yaxis;


public interface Title {


    String align();

    Title align(String align);

    String enabled();

    Title enabled(String enabled);

    double margin();

    Title margin(double margin);

    double offset();

    Title offset(double offset);

    double rotation();

    Title rotation(double rotation);

    String style();

    Title style(String styleAsJsonString);

    String text();

    Title text(String text);

}
