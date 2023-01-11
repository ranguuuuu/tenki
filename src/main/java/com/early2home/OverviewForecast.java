package com.early2home;

import lombok.Data;

@Data
public class OverviewForecast {
  String publishingOffice;
  String reportDatetime;
  String targetArea;
  String headlineText;
  String text;
}
