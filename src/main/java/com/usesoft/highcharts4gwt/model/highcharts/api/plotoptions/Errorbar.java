
package com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions;

import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.Boxplot;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarAfterAnimateHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarCheckboxClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarHideHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarLegendItemClickHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOutHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarMouseOverHandler;
import com.usesoft.highcharts4gwt.model.highcharts.api.plotoptions.errorbar.ErrorbarShowHandler;

public interface Errorbar
    extends Boxplot
{


    void addErrorbarAfterAnimateHandler(ErrorbarAfterAnimateHandler errorbarAfterAnimateHandler);

    void addErrorbarCheckboxClickHandler(ErrorbarCheckboxClickHandler errorbarCheckboxClickHandler);

    void addErrorbarClickHandler(ErrorbarClickHandler errorbarClickHandler);

    void addErrorbarHideHandler(ErrorbarHideHandler errorbarHideHandler);

    void addErrorbarLegendItemClickHandler(ErrorbarLegendItemClickHandler errorbarLegendItemClickHandler);

    void addErrorbarMouseOutHandler(ErrorbarMouseOutHandler errorbarMouseOutHandler);

    void addErrorbarMouseOverHandler(ErrorbarMouseOverHandler errorbarMouseOverHandler);

    void addErrorbarShowHandler(ErrorbarShowHandler errorbarShowHandler);

}
