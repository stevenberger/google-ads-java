// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/campaign_criterion.proto

package com.google.ads.googleads.v2.resources;

public final class CampaignCriterionProto {
  private CampaignCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_CampaignCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_CampaignCriterion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n:google/ads/googleads/v2/resources/camp" +
      "aign_criterion.proto\022!google.ads.googlea" +
      "ds.v2.resources\032-google/ads/googleads/v2" +
      "/common/criteria.proto\032=google/ads/googl" +
      "eads/v2/enums/campaign_criterion_status." +
      "proto\0322google/ads/googleads/v2/enums/cri" +
      "terion_type.proto\032\036google/protobuf/wrapp" +
      "ers.proto\032\034google/api/annotations.proto\"" +
      "\304\022\n\021CampaignCriterion\022\025\n\rresource_name\030\001" +
      " \001(\t\022.\n\010campaign\030\004 \001(\0132\034.google.protobuf" +
      ".StringValue\0221\n\014criterion_id\030\005 \001(\0132\033.goo" +
      "gle.protobuf.Int64Value\0221\n\014bid_modifier\030" +
      "\016 \001(\0132\033.google.protobuf.FloatValue\022,\n\010ne" +
      "gative\030\007 \001(\0132\032.google.protobuf.BoolValue" +
      "\022L\n\004type\030\006 \001(\0162>.google.ads.googleads.v2" +
      ".enums.CriterionTypeEnum.CriterionType\022b" +
      "\n\006status\030# \001(\0162R.google.ads.googleads.v2" +
      ".enums.CampaignCriterionStatusEnum.Campa" +
      "ignCriterionStatus\022>\n\007keyword\030\010 \001(\0132+.go" +
      "ogle.ads.googleads.v2.common.KeywordInfo" +
      "H\000\022B\n\tplacement\030\t \001(\0132-.google.ads.googl" +
      "eads.v2.common.PlacementInfoH\000\022T\n\023mobile" +
      "_app_category\030\n \001(\01325.google.ads.googlea" +
      "ds.v2.common.MobileAppCategoryInfoH\000\022S\n\022" +
      "mobile_application\030\013 \001(\01325.google.ads.go" +
      "ogleads.v2.common.MobileApplicationInfoH" +
      "\000\022@\n\010location\030\014 \001(\0132,.google.ads.googlea" +
      "ds.v2.common.LocationInfoH\000\022<\n\006device\030\r " +
      "\001(\0132*.google.ads.googleads.v2.common.Dev" +
      "iceInfoH\000\022E\n\013ad_schedule\030\017 \001(\0132..google." +
      "ads.googleads.v2.common.AdScheduleInfoH\000" +
      "\022A\n\tage_range\030\020 \001(\0132,.google.ads.googlea" +
      "ds.v2.common.AgeRangeInfoH\000\022<\n\006gender\030\021 " +
      "\001(\0132*.google.ads.googleads.v2.common.Gen" +
      "derInfoH\000\022G\n\014income_range\030\022 \001(\0132/.google" +
      ".ads.googleads.v2.common.IncomeRangeInfo" +
      "H\000\022M\n\017parental_status\030\023 \001(\01322.google.ads" +
      ".googleads.v2.common.ParentalStatusInfoH" +
      "\000\022A\n\tuser_list\030\026 \001(\0132,.google.ads.google" +
      "ads.v2.common.UserListInfoH\000\022I\n\ryoutube_" +
      "video\030\024 \001(\01320.google.ads.googleads.v2.co" +
      "mmon.YouTubeVideoInfoH\000\022M\n\017youtube_chann" +
      "el\030\025 \001(\01322.google.ads.googleads.v2.commo" +
      "n.YouTubeChannelInfoH\000\022B\n\tproximity\030\027 \001(" +
      "\0132-.google.ads.googleads.v2.common.Proxi" +
      "mityInfoH\000\022:\n\005topic\030\030 \001(\0132).google.ads.g" +
      "oogleads.v2.common.TopicInfoH\000\022I\n\rlistin" +
      "g_scope\030\031 \001(\01320.google.ads.googleads.v2." +
      "common.ListingScopeInfoH\000\022@\n\010language\030\032 " +
      "\001(\0132,.google.ads.googleads.v2.common.Lan" +
      "guageInfoH\000\022?\n\010ip_block\030\033 \001(\0132+.google.a" +
      "ds.googleads.v2.common.IpBlockInfoH\000\022I\n\r" +
      "content_label\030\034 \001(\01320.google.ads.googlea" +
      "ds.v2.common.ContentLabelInfoH\000\022>\n\007carri" +
      "er\030\035 \001(\0132+.google.ads.googleads.v2.commo" +
      "n.CarrierInfoH\000\022I\n\ruser_interest\030\036 \001(\01320" +
      ".google.ads.googleads.v2.common.UserInte" +
      "restInfoH\000\022>\n\007webpage\030\037 \001(\0132+.google.ads" +
      ".googleads.v2.common.WebpageInfoH\000\022^\n\030op" +
      "erating_system_version\030  \001(\0132:.google.ad" +
      "s.googleads.v2.common.OperatingSystemVer" +
      "sionInfoH\000\022I\n\rmobile_device\030! \001(\01320.goog" +
      "le.ads.googleads.v2.common.MobileDeviceI" +
      "nfoH\000\022K\n\016location_group\030\" \001(\01321.google.a" +
      "ds.googleads.v2.common.LocationGroupInfo" +
      "H\000\022M\n\017custom_affinity\030$ \001(\01322.google.ads" +
      ".googleads.v2.common.CustomAffinityInfoH" +
      "\000B\013\n\tcriterionB\203\002\n%com.google.ads.google" +
      "ads.v2.resourcesB\026CampaignCriterionProto" +
      "P\001ZJgoogle.golang.org/genproto/googleapi" +
      "s/ads/googleads/v2/resources;resources\242\002" +
      "\003GAA\252\002!Google.Ads.GoogleAds.V2.Resources" +
      "\312\002!Google\\Ads\\GoogleAds\\V2\\Resources\352\002%G" +
      "oogle::Ads::GoogleAds::V2::Resourcesb\006pr" +
      "oto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.ads.googleads.v2.common.CriteriaProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.CampaignCriterionStatusProto.getDescriptor(),
          com.google.ads.googleads.v2.enums.CriterionTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_CampaignCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_CampaignCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_CampaignCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "Campaign", "CriterionId", "BidModifier", "Negative", "Type", "Status", "Keyword", "Placement", "MobileAppCategory", "MobileApplication", "Location", "Device", "AdSchedule", "AgeRange", "Gender", "IncomeRange", "ParentalStatus", "UserList", "YoutubeVideo", "YoutubeChannel", "Proximity", "Topic", "ListingScope", "Language", "IpBlock", "ContentLabel", "Carrier", "UserInterest", "Webpage", "OperatingSystemVersion", "MobileDevice", "LocationGroup", "CustomAffinity", "Criterion", });
    com.google.ads.googleads.v2.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CampaignCriterionStatusProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CriterionTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
