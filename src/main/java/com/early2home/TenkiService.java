package com.early2home;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TenkiService {

  @Autowired RestTemplate restTemplate;

  static final String BASE = "https://www.jma.go.jp/bosai";
  static final String FORECAST = "/forecast/data";

  static final String URL_AREA_LIST = BASE + "/common/const/area.json";
  static final String URL_CONTENTS_LIST = BASE + "/common/const/contents.json";
  static final String URL_AMEDAS_SELECTORS = BASE + "/const/selectorinfos/amedas.json";
  static final String URL_AMEDAS_TABLE = BASE + "/amedas/const/amedastable.json";
  static final String URL_AMEDAS = BASE + "/amedas/data/map/20230111000000.json";
  static final String URL_FORECAST = BASE + FORECAST + "/forecast/130000.json";
  static final String URL_OVERVIEW_FORECAST = BASE + FORECAST + "/overview_forecast/130000.json";
  static final String URL_OVERVIEW_WEEK = BASE + FORECAST + "/overview_week/130000.json";

  /** Master */
  public String getAreaList() {
    // area.json. large file.
    // https://www.jma.go.jp/bosai/common/const/area.json
    return restTemplate.getForObject(URL_AREA_LIST, String.class);
  }

  public ContentsList getContentsList() {
    // contents.json
    return restTemplate.getForObject(URL_CONTENTS_LIST, ContentsList.class);
  }

  //  amedas selector-infos
  public AmedasSelectors[] getAmedasSelectors() {
    return restTemplate.getForObject(URL_AMEDAS_SELECTORS, AmedasSelectors[].class);
  }

  //  アメダスの地点情報
  public String getAmedastable() {
    // amedastable.json. large file.
    return restTemplate.getForObject(URL_AMEDAS_TABLE, String.class);
  }

  /** Transaction */
  //  天気予報
  public Forecast[] getForecastTokyo() {
    return restTemplate.getForObject(URL_FORECAST, Forecast[].class);
  }

  //  天気概況（明後日まで）
  public OverviewForecast getOverviewForecastTokyo() {
    // large file.
    return restTemplate.getForObject(URL_OVERVIEW_FORECAST, OverviewForecast.class);
  }

  //  天気概況（週間）
  public OverviewWeek getOverviewWeek() {
    // large file.
    return restTemplate.getForObject(URL_OVERVIEW_WEEK, OverviewWeek.class);
  }

  // アメダス 地点観測情報
  public String getAmedas() {
    // large file.
    return restTemplate.getForObject(URL_AMEDAS, String.class);
  }

  //  パラメータの説明
  //  https://qiita.com/yukity/items/dcb66b8ca91df4159271
  //  https://qiita.com/e_toyoda/items/7a293313a725c4d306c0

}
