
package com.github.highcharts4gwt.model.highcharts.option.mock;

import com.github.highcharts4gwt.model.array.api.ArrayNumber;
import com.github.highcharts4gwt.model.array.api.ArrayString;
import com.github.highcharts4gwt.model.highcharts.option.api.YAxis;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.Labels;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotBand;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.PlotLine;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.StackLabels;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.Title;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisAfterBreaksHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisAfterSetExtremesHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisPointBreakHandler;
import com.github.highcharts4gwt.model.highcharts.option.api.yaxis.YAxisSetExtremesHandler;

public class MockYAxis
    implements YAxis
{

    private boolean allowDecimals;
    private String alternateGridColor;
    private ArrayNumber breaks;
    private ArrayString categories;
    private double ceiling;
    private String dateTimeLabelFormats;
    private boolean endOnTick;
    private double floor;
    private String gridLineColor;
    private String gridLineDashStyle;
    private String gridLineInterpolation;
    private double gridLineWidth;
    private double gridZIndex;
    private String id;
    private Labels labels;
    private String lineColor;
    private double lineWidth;
    private double linkedTo;
    private double max;
    private String maxColor;
    private double maxPadding;
    private double maxZoom;
    private double min;
    private String minColor;
    private double minPadding;
    private double minRange;
    private double minTickInterval;
    private String minorGridLineColor;
    private String minorGridLineDashStyle;
    private double minorGridLineWidth;
    private String minorTickColor;
    private String minorTickIntervalAsString;
    private double minorTickIntervalAsNumber;
    private double minorTickLength;
    private String minorTickPosition;
    private double minorTickWidth;
    private double offset;
    private boolean opposite;
    private com.github.highcharts4gwt.model.array.api.Array<PlotBand> plotBands;
    private com.github.highcharts4gwt.model.array.api.Array<PlotLine> plotLines;
    private boolean reversed;
    private boolean reversedStacks;
    private boolean showEmpty;
    private boolean showFirstLabel;
    private boolean showLastLabel;
    private StackLabels stackLabels;
    private double startOfWeek;
    private boolean startOnTick;
    private double tickAmount;
    private String tickColor;
    private double tickInterval;
    private double tickLength;
    private double tickPixelInterval;
    private String tickPosition;
    private ArrayNumber tickPositions;
    private double tickWidth;
    private String tickmarkPlacement;
    private Title title;
    private String type;
    private ArrayNumber units;

    public boolean allowDecimals() {
        return allowDecimals;
    }

    public MockYAxis allowDecimals(boolean allowDecimals) {
        this.allowDecimals = allowDecimals;
        return this;
    }

    public String alternateGridColor() {
        return alternateGridColor;
    }

    public MockYAxis alternateGridColor(String alternateGridColor) {
        this.alternateGridColor = alternateGridColor;
        return this;
    }

    public ArrayNumber breaks() {
        return breaks;
    }

    public MockYAxis breaks(ArrayNumber breaks) {
        this.breaks = breaks;
        return this;
    }

    public ArrayString categories() {
        return categories;
    }

    public MockYAxis categories(ArrayString categories) {
        this.categories = categories;
        return this;
    }

    public double ceiling() {
        return ceiling;
    }

    public MockYAxis ceiling(double ceiling) {
        this.ceiling = ceiling;
        return this;
    }

    public String dateTimeLabelFormats() {
        return dateTimeLabelFormats;
    }

    public MockYAxis dateTimeLabelFormats(String dateTimeLabelFormatsAsJsonString) {
        this.dateTimeLabelFormats = dateTimeLabelFormatsAsJsonString;
        return this;
    }

    public boolean endOnTick() {
        return endOnTick;
    }

    public MockYAxis endOnTick(boolean endOnTick) {
        this.endOnTick = endOnTick;
        return this;
    }

    public void addYAxisAfterBreaksHandler(YAxisAfterBreaksHandler handler) {
    }

    public void addYAxisAfterSetExtremesHandler(YAxisAfterSetExtremesHandler handler) {
    }

    public void addYAxisPointBreakHandler(YAxisPointBreakHandler handler) {
    }

    public void addYAxisSetExtremesHandler(YAxisSetExtremesHandler handler) {
    }

    public double floor() {
        return floor;
    }

    public MockYAxis floor(double floor) {
        this.floor = floor;
        return this;
    }

    public String gridLineColor() {
        return gridLineColor;
    }

    public MockYAxis gridLineColor(String gridLineColor) {
        this.gridLineColor = gridLineColor;
        return this;
    }

    public String gridLineDashStyle() {
        return gridLineDashStyle;
    }

    public MockYAxis gridLineDashStyle(String gridLineDashStyle) {
        this.gridLineDashStyle = gridLineDashStyle;
        return this;
    }

    public String gridLineInterpolation() {
        return gridLineInterpolation;
    }

    public MockYAxis gridLineInterpolation(String gridLineInterpolation) {
        this.gridLineInterpolation = gridLineInterpolation;
        return this;
    }

    public double gridLineWidth() {
        return gridLineWidth;
    }

    public MockYAxis gridLineWidth(double gridLineWidth) {
        this.gridLineWidth = gridLineWidth;
        return this;
    }

    public double gridZIndex() {
        return gridZIndex;
    }

    public MockYAxis gridZIndex(double gridZIndex) {
        this.gridZIndex = gridZIndex;
        return this;
    }

    public String id() {
        return id;
    }

    public MockYAxis id(String id) {
        this.id = id;
        return this;
    }

    public Labels labels() {
        return labels;
    }

    public MockYAxis labels(Labels labels) {
        this.labels = labels;
        return this;
    }

    public String lineColor() {
        return lineColor;
    }

    public MockYAxis lineColor(String lineColor) {
        this.lineColor = lineColor;
        return this;
    }

    public double lineWidth() {
        return lineWidth;
    }

    public MockYAxis lineWidth(double lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public double linkedTo() {
        return linkedTo;
    }

    public MockYAxis linkedTo(double linkedTo) {
        this.linkedTo = linkedTo;
        return this;
    }

    public double max() {
        return max;
    }

    public MockYAxis max(double max) {
        this.max = max;
        return this;
    }

    public String maxColor() {
        return maxColor;
    }

    public MockYAxis maxColor(String maxColor) {
        this.maxColor = maxColor;
        return this;
    }

    public double maxPadding() {
        return maxPadding;
    }

    public MockYAxis maxPadding(double maxPadding) {
        this.maxPadding = maxPadding;
        return this;
    }

    public double maxZoom() {
        return maxZoom;
    }

    public MockYAxis maxZoom(double maxZoom) {
        this.maxZoom = maxZoom;
        return this;
    }

    public double min() {
        return min;
    }

    public MockYAxis min(double min) {
        this.min = min;
        return this;
    }

    public String minColor() {
        return minColor;
    }

    public MockYAxis minColor(String minColor) {
        this.minColor = minColor;
        return this;
    }

    public double minPadding() {
        return minPadding;
    }

    public MockYAxis minPadding(double minPadding) {
        this.minPadding = minPadding;
        return this;
    }

    public double minRange() {
        return minRange;
    }

    public MockYAxis minRange(double minRange) {
        this.minRange = minRange;
        return this;
    }

    public double minTickInterval() {
        return minTickInterval;
    }

    public MockYAxis minTickInterval(double minTickInterval) {
        this.minTickInterval = minTickInterval;
        return this;
    }

    public String minorGridLineColor() {
        return minorGridLineColor;
    }

    public MockYAxis minorGridLineColor(String minorGridLineColor) {
        this.minorGridLineColor = minorGridLineColor;
        return this;
    }

    public String minorGridLineDashStyle() {
        return minorGridLineDashStyle;
    }

    public MockYAxis minorGridLineDashStyle(String minorGridLineDashStyle) {
        this.minorGridLineDashStyle = minorGridLineDashStyle;
        return this;
    }

    public double minorGridLineWidth() {
        return minorGridLineWidth;
    }

    public MockYAxis minorGridLineWidth(double minorGridLineWidth) {
        this.minorGridLineWidth = minorGridLineWidth;
        return this;
    }

    public String minorTickColor() {
        return minorTickColor;
    }

    public MockYAxis minorTickColor(String minorTickColor) {
        this.minorTickColor = minorTickColor;
        return this;
    }

    public String minorTickIntervalAsString() {
        return minorTickIntervalAsString;
    }

    public MockYAxis minorTickIntervalAsString(String minorTickIntervalAsString) {
        this.minorTickIntervalAsString = minorTickIntervalAsString;
        return this;
    }

    public double minorTickIntervalAsNumber() {
        return minorTickIntervalAsNumber;
    }

    public MockYAxis minorTickIntervalAsNumber(double minorTickIntervalAsNumber) {
        this.minorTickIntervalAsNumber = minorTickIntervalAsNumber;
        return this;
    }

    public double minorTickLength() {
        return minorTickLength;
    }

    public MockYAxis minorTickLength(double minorTickLength) {
        this.minorTickLength = minorTickLength;
        return this;
    }

    public String minorTickPosition() {
        return minorTickPosition;
    }

    public MockYAxis minorTickPosition(String minorTickPosition) {
        this.minorTickPosition = minorTickPosition;
        return this;
    }

    public double minorTickWidth() {
        return minorTickWidth;
    }

    public MockYAxis minorTickWidth(double minorTickWidth) {
        this.minorTickWidth = minorTickWidth;
        return this;
    }

    public double offset() {
        return offset;
    }

    public MockYAxis offset(double offset) {
        this.offset = offset;
        return this;
    }

    public boolean opposite() {
        return opposite;
    }

    public MockYAxis opposite(boolean opposite) {
        this.opposite = opposite;
        return this;
    }

    public com.github.highcharts4gwt.model.array.api.Array<PlotBand> plotBands() {
        return plotBands;
    }

    public MockYAxis plotBands(com.github.highcharts4gwt.model.array.api.Array<PlotBand> plotBands) {
        this.plotBands = plotBands;
        return this;
    }

    public com.github.highcharts4gwt.model.array.api.Array<PlotLine> plotLines() {
        return plotLines;
    }

    public MockYAxis plotLines(com.github.highcharts4gwt.model.array.api.Array<PlotLine> plotLines) {
        this.plotLines = plotLines;
        return this;
    }

    public boolean reversed() {
        return reversed;
    }

    public MockYAxis reversed(boolean reversed) {
        this.reversed = reversed;
        return this;
    }

    public boolean reversedStacks() {
        return reversedStacks;
    }

    public MockYAxis reversedStacks(boolean reversedStacks) {
        this.reversedStacks = reversedStacks;
        return this;
    }

    public boolean showEmpty() {
        return showEmpty;
    }

    public MockYAxis showEmpty(boolean showEmpty) {
        this.showEmpty = showEmpty;
        return this;
    }

    public boolean showFirstLabel() {
        return showFirstLabel;
    }

    public MockYAxis showFirstLabel(boolean showFirstLabel) {
        this.showFirstLabel = showFirstLabel;
        return this;
    }

    public boolean showLastLabel() {
        return showLastLabel;
    }

    public MockYAxis showLastLabel(boolean showLastLabel) {
        this.showLastLabel = showLastLabel;
        return this;
    }

    public StackLabels stackLabels() {
        return stackLabels;
    }

    public MockYAxis stackLabels(StackLabels stackLabels) {
        this.stackLabels = stackLabels;
        return this;
    }

    public double startOfWeek() {
        return startOfWeek;
    }

    public MockYAxis startOfWeek(double startOfWeek) {
        this.startOfWeek = startOfWeek;
        return this;
    }

    public boolean startOnTick() {
        return startOnTick;
    }

    public MockYAxis startOnTick(boolean startOnTick) {
        this.startOnTick = startOnTick;
        return this;
    }

    public double tickAmount() {
        return tickAmount;
    }

    public MockYAxis tickAmount(double tickAmount) {
        this.tickAmount = tickAmount;
        return this;
    }

    public String tickColor() {
        return tickColor;
    }

    public MockYAxis tickColor(String tickColor) {
        this.tickColor = tickColor;
        return this;
    }

    public double tickInterval() {
        return tickInterval;
    }

    public MockYAxis tickInterval(double tickInterval) {
        this.tickInterval = tickInterval;
        return this;
    }

    public double tickLength() {
        return tickLength;
    }

    public MockYAxis tickLength(double tickLength) {
        this.tickLength = tickLength;
        return this;
    }

    public double tickPixelInterval() {
        return tickPixelInterval;
    }

    public MockYAxis tickPixelInterval(double tickPixelInterval) {
        this.tickPixelInterval = tickPixelInterval;
        return this;
    }

    public String tickPosition() {
        return tickPosition;
    }

    public MockYAxis tickPosition(String tickPosition) {
        this.tickPosition = tickPosition;
        return this;
    }

    public ArrayNumber tickPositions() {
        return tickPositions;
    }

    public MockYAxis tickPositions(ArrayNumber tickPositions) {
        this.tickPositions = tickPositions;
        return this;
    }

    public double tickWidth() {
        return tickWidth;
    }

    public MockYAxis tickWidth(double tickWidth) {
        this.tickWidth = tickWidth;
        return this;
    }

    public String tickmarkPlacement() {
        return tickmarkPlacement;
    }

    public MockYAxis tickmarkPlacement(String tickmarkPlacement) {
        this.tickmarkPlacement = tickmarkPlacement;
        return this;
    }

    public Title title() {
        return title;
    }

    public MockYAxis title(Title title) {
        this.title = title;
        return this;
    }

    public String type() {
        return type;
    }

    public MockYAxis type(String type) {
        this.type = type;
        return this;
    }

    public ArrayNumber units() {
        return units;
    }

    public MockYAxis units(ArrayNumber units) {
        this.units = units;
        return this;
    }

}
