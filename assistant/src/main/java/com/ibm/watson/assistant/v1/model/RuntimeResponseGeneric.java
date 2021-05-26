/*
 * (C) Copyright IBM Corp. 2019, 2021.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.watson.assistant.v1.model;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * RuntimeResponseGeneric.
 *
 * <p>Classes which extend this class: - RuntimeResponseGenericRuntimeResponseTypeText -
 * RuntimeResponseGenericRuntimeResponseTypePause - RuntimeResponseGenericRuntimeResponseTypeImage -
 * RuntimeResponseGenericRuntimeResponseTypeOption -
 * RuntimeResponseGenericRuntimeResponseTypeConnectToAgent -
 * RuntimeResponseGenericRuntimeResponseTypeSuggestion -
 * RuntimeResponseGenericRuntimeResponseTypeChannelTransfer -
 * RuntimeResponseGenericRuntimeResponseTypeUserDefined
 */
public class RuntimeResponseGeneric extends GenericModel {
  @SuppressWarnings("unused")
  protected static String discriminatorPropertyName = "response_type";

  protected static java.util.Map<String, Class<?>> discriminatorMapping;

  static {
    discriminatorMapping = new java.util.HashMap<>();
    discriminatorMapping.put(
        "channel_transfer", RuntimeResponseGenericRuntimeResponseTypeChannelTransfer.class);
    discriminatorMapping.put(
        "connect_to_agent", RuntimeResponseGenericRuntimeResponseTypeConnectToAgent.class);
    discriminatorMapping.put("image", RuntimeResponseGenericRuntimeResponseTypeImage.class);
    discriminatorMapping.put("option", RuntimeResponseGenericRuntimeResponseTypeOption.class);
    discriminatorMapping.put(
        "suggestion", RuntimeResponseGenericRuntimeResponseTypeSuggestion.class);
    discriminatorMapping.put("pause", RuntimeResponseGenericRuntimeResponseTypePause.class);
    discriminatorMapping.put("text", RuntimeResponseGenericRuntimeResponseTypeText.class);
    discriminatorMapping.put(
        "user_defined", RuntimeResponseGenericRuntimeResponseTypeUserDefined.class);
  }

  /** The preferred type of control to display. */
  public interface Preference {
    /** dropdown. */
    String DROPDOWN = "dropdown";
    /** button. */
    String BUTTON = "button";
  }

  protected RuntimeResponseGeneric() {}
}
