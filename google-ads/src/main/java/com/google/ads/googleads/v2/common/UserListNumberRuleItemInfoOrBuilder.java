// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/ads/googleads/v2/common/user_lists.proto

package com.google.ads.googleads.v2.common;

public interface UserListNumberRuleItemInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.ads.googleads.v2.common.UserListNumberRuleItemInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Number comparison operator.
   * This field is required and must be populated when creating a new number
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator operator = 1;</code>
   */
  int getOperatorValue();
  /**
   * <pre>
   * Number comparison operator.
   * This field is required and must be populated when creating a new number
   * rule item.
   * </pre>
   *
   * <code>.google.ads.googleads.v2.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator operator = 1;</code>
   */
  com.google.ads.googleads.v2.enums.UserListNumberRuleItemOperatorEnum.UserListNumberRuleItemOperator getOperator();

  /**
   * <pre>
   * Number value to be compared with the variable.
   * This field is required and must be populated when creating a new number
   * rule item.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue value = 2;</code>
   */
  boolean hasValue();
  /**
   * <pre>
   * Number value to be compared with the variable.
   * This field is required and must be populated when creating a new number
   * rule item.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue value = 2;</code>
   */
  com.google.protobuf.DoubleValue getValue();
  /**
   * <pre>
   * Number value to be compared with the variable.
   * This field is required and must be populated when creating a new number
   * rule item.
   * </pre>
   *
   * <code>.google.protobuf.DoubleValue value = 2;</code>
   */
  com.google.protobuf.DoubleValueOrBuilder getValueOrBuilder();
}