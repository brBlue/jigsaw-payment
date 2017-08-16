// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: entity.proto

package org.jigsaw.payment.model;

public interface PayOrderFilterOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PayOrderFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional .PayOrder.Status status = 5;</code>
   */
  boolean hasStatus();
  /**
   * <code>optional .PayOrder.Status status = 5;</code>
   */
  org.jigsaw.payment.model.PayOrder.Status getStatus();

  /**
   * <code>optional int64 create_time_begin = 6;</code>
   */
  boolean hasCreateTimeBegin();
  /**
   * <code>optional int64 create_time_begin = 6;</code>
   */
  long getCreateTimeBegin();

  /**
   * <code>optional int64 create_time_end = 7;</code>
   */
  boolean hasCreateTimeEnd();
  /**
   * <code>optional int64 create_time_end = 7;</code>
   */
  long getCreateTimeEnd();

  /**
   * <code>optional int64 pay_time_begin = 8;</code>
   */
  boolean hasPayTimeBegin();
  /**
   * <code>optional int64 pay_time_begin = 8;</code>
   */
  long getPayTimeBegin();

  /**
   * <code>optional int64 pay_time_end = 9;</code>
   */
  boolean hasPayTimeEnd();
  /**
   * <code>optional int64 pay_time_end = 9;</code>
   */
  long getPayTimeEnd();

  /**
   * <code>optional .EntityType sub_type = 10;</code>
   */
  boolean hasSubType();
  /**
   * <code>optional .EntityType sub_type = 10;</code>
   */
  org.jigsaw.payment.model.EntityType getSubType();

  /**
   * <code>optional int64 sub_id = 11;</code>
   */
  boolean hasSubId();
  /**
   * <code>optional int64 sub_id = 11;</code>
   */
  long getSubId();

  /**
   * <code>repeated int32 partner_id = 12 [packed = true];</code>
   */
  java.util.List<java.lang.Integer> getPartnerIdList();
  /**
   * <code>repeated int32 partner_id = 12 [packed = true];</code>
   */
  int getPartnerIdCount();
  /**
   * <code>repeated int32 partner_id = 12 [packed = true];</code>
   */
  int getPartnerId(int index);

  /**
   * <code>repeated int32 partner_account_id = 13 [packed = true];</code>
   */
  java.util.List<java.lang.Integer> getPartnerAccountIdList();
  /**
   * <code>repeated int32 partner_account_id = 13 [packed = true];</code>
   */
  int getPartnerAccountIdCount();
  /**
   * <code>repeated int32 partner_account_id = 13 [packed = true];</code>
   */
  int getPartnerAccountId(int index);

  /**
   * <code>repeated int32 source_pay_type = 14 [packed = true];</code>
   */
  java.util.List<java.lang.Integer> getSourcePayTypeList();
  /**
   * <code>repeated int32 source_pay_type = 14 [packed = true];</code>
   */
  int getSourcePayTypeCount();
  /**
   * <code>repeated int32 source_pay_type = 14 [packed = true];</code>
   */
  int getSourcePayType(int index);

  /**
   * <code>repeated int32 dest_pay_type = 15 [packed = true];</code>
   */
  java.util.List<java.lang.Integer> getDestPayTypeList();
  /**
   * <code>repeated int32 dest_pay_type = 15 [packed = true];</code>
   */
  int getDestPayTypeCount();
  /**
   * <code>repeated int32 dest_pay_type = 15 [packed = true];</code>
   */
  int getDestPayType(int index);

  /**
   * <code>optional string app_id = 16;</code>
   */
  boolean hasAppId();
  /**
   * <code>optional string app_id = 16;</code>
   */
  java.lang.String getAppId();
  /**
   * <code>optional string app_id = 16;</code>
   */
  com.google.protobuf.ByteString
      getAppIdBytes();

  /**
   * <code>optional int32 pay_scenarios = 17;</code>
   */
  boolean hasPayScenarios();
  /**
   * <code>optional int32 pay_scenarios = 17;</code>
   */
  int getPayScenarios();

  /**
   * <code>optional int32 gateway = 18;</code>
   */
  boolean hasGateway();
  /**
   * <code>optional int32 gateway = 18;</code>
   */
  int getGateway();

  /**
   * <code>optional int32 pay_mode = 19;</code>
   */
  boolean hasPayMode();
  /**
   * <code>optional int32 pay_mode = 19;</code>
   */
  int getPayMode();

  /**
   * <code>optional string order_id = 20;</code>
   */
  boolean hasOrderId();
  /**
   * <code>optional string order_id = 20;</code>
   */
  java.lang.String getOrderId();
  /**
   * <code>optional string order_id = 20;</code>
   */
  com.google.protobuf.ByteString
      getOrderIdBytes();

  /**
   * <pre>
   * for sms trade
   * </pre>
   *
   * <code>optional int32 sub_mobile_status = 21;</code>
   */
  boolean hasSubMobileStatus();
  /**
   * <pre>
   * for sms trade
   * </pre>
   *
   * <code>optional int32 sub_mobile_status = 21;</code>
   */
  int getSubMobileStatus();

  /**
   * <code>optional string sub_account_id = 22;</code>
   */
  boolean hasSubAccountId();
  /**
   * <code>optional string sub_account_id = 22;</code>
   */
  java.lang.String getSubAccountId();
  /**
   * <code>optional string sub_account_id = 22;</code>
   */
  com.google.protobuf.ByteString
      getSubAccountIdBytes();

  /**
   * <code>optional int32 sub_account_type = 23;</code>
   */
  boolean hasSubAccountType();
  /**
   * <code>optional int32 sub_account_type = 23;</code>
   */
  int getSubAccountType();

  /**
   * <code>optional string sub_client_code = 24;</code>
   */
  boolean hasSubClientCode();
  /**
   * <code>optional string sub_client_code = 24;</code>
   */
  java.lang.String getSubClientCode();
  /**
   * <code>optional string sub_client_code = 24;</code>
   */
  com.google.protobuf.ByteString
      getSubClientCodeBytes();

  /**
   * <code>optional int64 parent_id = 26;</code>
   */
  boolean hasParentId();
  /**
   * <code>optional int64 parent_id = 26;</code>
   */
  long getParentId();

  /**
   * <code>optional string sub_mobile = 27;</code>
   */
  boolean hasSubMobile();
  /**
   * <code>optional string sub_mobile = 27;</code>
   */
  java.lang.String getSubMobile();
  /**
   * <code>optional string sub_mobile = 27;</code>
   */
  com.google.protobuf.ByteString
      getSubMobileBytes();

  /**
   * <code>optional string third_trade_code = 28;</code>
   */
  boolean hasThirdTradeCode();
  /**
   * <code>optional string third_trade_code = 28;</code>
   */
  java.lang.String getThirdTradeCode();
  /**
   * <code>optional string third_trade_code = 28;</code>
   */
  com.google.protobuf.ByteString
      getThirdTradeCodeBytes();

  /**
   * <code>optional string partner_order_no = 29;</code>
   */
  boolean hasPartnerOrderNo();
  /**
   * <code>optional string partner_order_no = 29;</code>
   */
  java.lang.String getPartnerOrderNo();
  /**
   * <code>optional string partner_order_no = 29;</code>
   */
  com.google.protobuf.ByteString
      getPartnerOrderNoBytes();
}