
package com.usesoft.highcharts4gwt.model.highcharts.api;

import com.usesoft.highcharts4gwt.model.highcharts.api.exporting.Buttons;

public interface Exporting {


    Buttons buttons();

    Exporting buttons(Buttons buttons);

    String chartOptions();

    Exporting chartOptions(String chartOptionsAsJsonString);

    boolean enabled();

    Exporting enabled(boolean enabled);

    String filename();

    Exporting filename(String filename);

    String formAttributes();

    Exporting formAttributes(String formAttributesAsJsonString);

    double scale();

    Exporting scale(double scale);

    double sourceHeight();

    Exporting sourceHeight(double sourceHeight);

    double sourceWidth();

    Exporting sourceWidth(double sourceWidth);

    String type();

    Exporting type(String type);

    String url();

    Exporting url(String url);

    double width();

    Exporting width(double width);

}
