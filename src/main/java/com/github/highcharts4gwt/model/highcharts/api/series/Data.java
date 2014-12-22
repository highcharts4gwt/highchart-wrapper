
package com.github.highcharts4gwt.model.highcharts.api.series;

import com.github.highcharts4gwt.model.highcharts.api.series.data.DataClickHandler;
import com.github.highcharts4gwt.model.highcharts.api.series.data.DataMouseOutHandler;
import com.github.highcharts4gwt.model.highcharts.api.series.data.DataMouseOverHandler;
import com.github.highcharts4gwt.model.highcharts.api.series.data.DataRemoveHandler;
import com.github.highcharts4gwt.model.highcharts.api.series.data.DataSelectHandler;
import com.github.highcharts4gwt.model.highcharts.api.series.data.DataUnselectHandler;
import com.github.highcharts4gwt.model.highcharts.api.series.data.DataUpdateHandler;
import com.github.highcharts4gwt.model.highcharts.api.series.data.Marker;

public interface Data {


    String color();

    Data color(String color);

    String dataLabels();

    Data dataLabels(String dataLabelsAsJsonString);

    String drilldown();

    Data drilldown(String drilldown);

    void addDataClickHandler(DataClickHandler dataClickHandler);

    void addDataMouseOutHandler(DataMouseOutHandler dataMouseOutHandler);

    void addDataMouseOverHandler(DataMouseOverHandler dataMouseOverHandler);

    void addDataRemoveHandler(DataRemoveHandler dataRemoveHandler);

    void addDataSelectHandler(DataSelectHandler dataSelectHandler);

    void addDataUnselectHandler(DataUnselectHandler dataUnselectHandler);

    void addDataUpdateHandler(DataUpdateHandler dataUpdateHandler);

    String id();

    Data id(String id);

    boolean isIntermediateSum();

    Data isIntermediateSum(boolean isIntermediateSum);

    boolean isSum();

    Data isSum(boolean isSum);

    double legendIndex();

    Data legendIndex(double legendIndex);

    Marker marker();

    Data marker(Marker marker);

    String name();

    Data name(String name);

    boolean sliced();

    Data sliced(boolean sliced);

    double x();

    Data x(double x);

    double y();

    Data y(double y);

}
