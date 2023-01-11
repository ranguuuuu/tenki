package com.early2home;

import java.util.List;

import lombok.Data;

@Data
public class Contents {
  String id;
  String icon;
  String type;
  String context;
  String name;
  String enName;
  String kana;
  List<String> keywords;
  String url;
  String enUrl;
  String priority;
  List<String> realm;
}
