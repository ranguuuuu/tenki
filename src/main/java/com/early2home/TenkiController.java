package com.early2home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TenkiController {

  @Autowired TenkiService TenkiService;

  @GetMapping("/area-list")
  public Object getAreaList() {
    return TenkiService.getAreaList();
  }

  @GetMapping("/contents-list")
  public ContentsList getContentsList() {
    return TenkiService.getContentsList();
  }

  @GetMapping("/forecast-tokyo")
  public Forecast[] getForecastTokyo() {
    return TenkiService.getForecastTokyo();
  }

  @GetMapping("/amedas-selectors")
  public AmedasSelectors[] getAmedasSelectors() {
    return TenkiService.getAmedasSelectors();
  }

  @GetMapping("/amedas-table")
  public String getAmedastable() {
    return TenkiService.getAmedastable();
  }

  @GetMapping("/overview-forecast-tokyo")
  public OverviewForecast getOverviewForecastTokyo() {
    return TenkiService.getOverviewForecastTokyo();
  }

  @GetMapping("/overview-week-tokyo")
  public OverviewWeek getOverviewWeek() {
    return TenkiService.getOverviewWeek();
  }


  @GetMapping("/amedas")
  public String getAmedas() {
    return TenkiService.getAmedas();
  }

}
