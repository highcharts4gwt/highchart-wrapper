
package com.github.highcharts4gwt.model.highcharts.option.api.xaxis;


public interface Labels {


    String align();

    Labels align(String align);

    double distance();

    Labels distance(double distance);

    boolean enabled();

    Labels enabled(boolean enabled);

    String format();

    Labels format(String format);

    double maxStaggerLines();

    Labels maxStaggerLines(double maxStaggerLines);

    String overflow();

    Labels overflow(String overflow);

    double rotation();

    Labels rotation(double rotation);

    double staggerLines();

    Labels staggerLines(double staggerLines);

    double step();

    Labels step(double step);

    String style();

    Labels style(String styleAsJsonString);

    boolean useHTML();

    Labels useHTML(boolean useHTML);

    double x();

    Labels x(double x);

    double y();

    Labels y(double y);

    double zIndex();

    Labels zIndex(double zIndex);

}
