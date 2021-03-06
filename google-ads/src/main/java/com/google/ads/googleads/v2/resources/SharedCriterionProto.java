// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/resources/shared_criterion.proto

package com.google.ads.googleads.v2.resources;

public final class SharedCriterionProto {
  private SharedCriterionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_ads_googleads_v2_resources_SharedCriterion_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_ads_googleads_v2_resources_SharedCriterion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8google/ads/googleads/v2/resources/shar" +
      "ed_criterion.proto\022!google.ads.googleads" +
      ".v2.resources\032-google/ads/googleads/v2/c" +
      "ommon/criteria.proto\0322google/ads/googlea" +
      "ds/v2/enums/criterion_type.proto\032\036google" +
      "/protobuf/wrappers.proto\032\034google/api/ann" +
      "otations.proto\"\261\005\n\017SharedCriterion\022\025\n\rre" +
      "source_name\030\001 \001(\t\0220\n\nshared_set\030\002 \001(\0132\034." +
      "google.protobuf.StringValue\0221\n\014criterion" +
      "_id\030\032 \001(\0132\033.google.protobuf.Int64Value\022L" +
      "\n\004type\030\004 \001(\0162>.google.ads.googleads.v2.e" +
      "nums.CriterionTypeEnum.CriterionType\022>\n\007" +
      "keyword\030\003 \001(\0132+.google.ads.googleads.v2." +
      "common.KeywordInfoH\000\022I\n\ryoutube_video\030\005 " +
      "\001(\01320.google.ads.googleads.v2.common.You" +
      "TubeVideoInfoH\000\022M\n\017youtube_channel\030\006 \001(\013" +
      "22.google.ads.googleads.v2.common.YouTub" +
      "eChannelInfoH\000\022B\n\tplacement\030\007 \001(\0132-.goog" +
      "le.ads.googleads.v2.common.PlacementInfo" +
      "H\000\022T\n\023mobile_app_category\030\010 \001(\01325.google" +
      ".ads.googleads.v2.common.MobileAppCatego" +
      "ryInfoH\000\022S\n\022mobile_application\030\t \001(\01325.g" +
      "oogle.ads.googleads.v2.common.MobileAppl" +
      "icationInfoH\000B\013\n\tcriterionB\201\002\n%com.googl" +
      "e.ads.googleads.v2.resourcesB\024SharedCrit" +
      "erionProtoP\001ZJgoogle.golang.org/genproto" +
      "/googleapis/ads/googleads/v2/resources;r" +
      "esources\242\002\003GAA\252\002!Google.Ads.GoogleAds.V2" +
      ".Resources\312\002!Google\\Ads\\GoogleAds\\V2\\Res" +
      "ources\352\002%Google::Ads::GoogleAds::V2::Res" +
      "ourcesb\006proto3"
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
          com.google.ads.googleads.v2.enums.CriterionTypeProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        }, assigner);
    internal_static_google_ads_googleads_v2_resources_SharedCriterion_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_ads_googleads_v2_resources_SharedCriterion_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_ads_googleads_v2_resources_SharedCriterion_descriptor,
        new java.lang.String[] { "ResourceName", "SharedSet", "CriterionId", "Type", "Keyword", "YoutubeVideo", "YoutubeChannel", "Placement", "MobileAppCategory", "MobileApplication", "Criterion", });
    com.google.ads.googleads.v2.common.CriteriaProto.getDescriptor();
    com.google.ads.googleads.v2.enums.CriterionTypeProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
